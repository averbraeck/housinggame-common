package nl.tudelft.simulation.housinggame.common;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.HousegroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousemeasureRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasuretypeRecord;

/**
 * FPRecord stores Fluvial and Pluvial protection.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public record FPRecord(int fluvial, int pluvial)
{

    public static FPRecord measureProtectionTillRound(final CommonData data, final int round,
            final HousegroupRecord houseGroup)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        List<HousemeasureRecord> measureList =
                dslContext.selectFrom(Tables.HOUSEMEASURE).where(Tables.HOUSEMEASURE.HOUSEGROUP_ID.eq(houseGroup.getId()))
                        .fetch().sortAsc(Tables.HOUSEMEASURE.BOUGHT_IN_ROUND);
        int fluvial = 0;
        int pluvial = 0;
        for (var measure : measureList)
        {
            MeasuretypeRecord mt = SqlUtils.readRecordFromId(data, Tables.MEASURETYPE, measure.getMeasuretypeId());
            // only take records that are permanent, or for one round and this is the correct round.
            if ((measure.getBoughtInRound() <= round && mt.getValidOneRound() != 0)
                    || (measure.getBoughtInRound() == round && mt.getValidOneRound() == 0))
            {
                fluvial += mt.getFluvialProtectionDelta();
                pluvial += mt.getPluvialProtectionDelta();
            }
        }
        return new FPRecord(fluvial, pluvial);
    }

}
