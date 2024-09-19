package nl.tudelft.simulation.housinggame.common;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.GameversionRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasurecategoryRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasuretypeRecord;

/**
 * MeasureListRecord stores a measurecategory with its measuretypes. The categories and types are sorted according to their
 * sequence numbers.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public record MeasureTypeList(MeasurecategoryRecord measureCategory, List<MeasuretypeRecord> measureTypeList)
{
    public static MeasureTypeList getMeasureListRecord(final CommonData data, final MeasurecategoryRecord mcr)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        List<MeasuretypeRecord> measureTypeList =
                dslContext.selectFrom(Tables.MEASURETYPE).where(Tables.MEASURETYPE.MEASURECATEGORY_ID.eq(mcr.getId())).fetch()
                        .sortAsc(Tables.MEASURETYPE.CATEGORY_SEQUENCE_NR);
        return new MeasureTypeList(mcr, measureTypeList);
    }

    public static List<MeasureTypeList> getMeasureListRecords(final CommonData data, final int gameVersionId)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        List<MeasurecategoryRecord> measureCategoryList =
                dslContext.selectFrom(Tables.MEASURECATEGORY).where(Tables.MEASURECATEGORY.GAMEVERSION_ID.eq(gameVersionId))
                        .fetch().sortAsc(Tables.MEASURECATEGORY.SEQUENCE_NR);
        List<MeasureTypeList> mlrList = new ArrayList<>();
        for (var mcr : measureCategoryList)
            mlrList.add(getMeasureListRecord(data, mcr));
        return mlrList;
    }

    public static List<MeasureTypeList> getMeasureListRecords(final CommonData data, final GameversionRecord gameVersion)
    {
        return getMeasureListRecords(data, gameVersion.getId());
    }

}
