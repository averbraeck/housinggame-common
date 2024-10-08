package nl.tudelft.simulation.housinggame.common;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.GrouproundRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousemeasureRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasurecategoryRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasuretypeRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PersonalmeasureRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerroundRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.ScenarioRecord;

/**
 * MeasureListRecord stores a measurecategory with its measuretypes. The categories and types are sorted according to their
 * sequence numbers.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public record MeasureTypeList(MeasurecategoryRecord measureCategory, List<MeasuretypeRecord> measureTypes)
{
    public static MeasureTypeList getMeasureListRecord(final CommonData data, final MeasurecategoryRecord mcr)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        List<MeasuretypeRecord> measureTypeList =
                dslContext.selectFrom(Tables.MEASURETYPE).where(Tables.MEASURETYPE.MEASURECATEGORY_ID.eq(mcr.getId())).fetch()
                        .sortAsc(Tables.MEASURETYPE.CATEGORY_SEQUENCE_NR);
        return new MeasureTypeList(mcr, measureTypeList);
    }

    public static List<MeasureTypeList> getMeasureListRecords(final CommonData data, final int scenarioId)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        List<MeasurecategoryRecord> measureCategoryList = dslContext.selectFrom(Tables.MEASURECATEGORY)
                .where(Tables.MEASURECATEGORY.SCENARIO_ID.eq(scenarioId)).fetch().sortAsc(Tables.MEASURECATEGORY.SEQUENCE_NR);
        List<MeasureTypeList> mlrList = new ArrayList<>();
        for (var mcr : measureCategoryList)
            mlrList.add(getMeasureListRecord(data, mcr));
        return mlrList;
    }

    public static List<MeasureTypeList> getAllMeasureListRecords(final CommonData data, final ScenarioRecord scenario)
    {
        return getMeasureListRecords(data, scenario.getId());
    }

    public static List<MeasuretypeRecord> getActiveMeasureListRecords(final CommonData data, final int scenarioId,
            final PlayerroundRecord playerRound)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        GrouproundRecord gr = SqlUtils.readRecordFromId(data, Tables.GROUPROUND, playerRound.getGrouproundId());
        List<HousemeasureRecord> houseMeasureList = dslContext.selectFrom(Tables.HOUSEMEASURE)
                .where(Tables.HOUSEMEASURE.HOUSEGROUP_ID.eq(playerRound.getFinalHousegroupId())).fetch();
        List<PlayerroundRecord> prList = dslContext.selectFrom(Tables.PLAYERROUND)
                .where(Tables.PLAYERROUND.PLAYER_ID.eq(playerRound.getPlayerId())).fetch();
        List<PersonalmeasureRecord> personalMeasureList = new ArrayList<>();
        for (var pr : prList)
        {
            personalMeasureList.addAll(dslContext
                    .selectFrom(Tables.PERSONALMEASURE.where(Tables.PERSONALMEASURE.PLAYERROUND_ID.eq(pr.getId()))).fetch());
        }
        List<MeasuretypeRecord> mtList = new ArrayList<>();
        for (HousemeasureRecord hm : houseMeasureList)
        {
            MeasuretypeRecord mt = SqlUtils.readRecordFromId(data, Tables.MEASURETYPE, hm.getMeasuretypeId());
            // only if bought before or in round we are interested in
            if (hm.getBoughtInRound() <= gr.getRoundNumber())
            {
                // if not used before or in round we are interested in
                if (mt.getValidUntilUsed() == 0 || hm.getUsedInRound() == null || hm.getUsedInRound() == -1
                        || hm.getUsedInRound() > gr.getRoundNumber())
                {
                    // if not one time or (one-time and current round)
                    if (mt.getValidOneRound() == 0
                            || (mt.getValidOneRound() != 0 && hm.getBoughtInRound() == gr.getRoundNumber()))
                    {
                        mtList.add(mt);
                    }
                }
            }
        }
        return mtList;
    }

}
