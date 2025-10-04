package nl.tudelft.simulation.housinggame.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.CommunityRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.GroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.GrouproundRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HouseRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousegroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerroundRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.ScenarioRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.TaxRecord;

/**
 * Taxes calculates the taxes for one player or for all players.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public class Taxes
{
    public static Map<CommunityRecord, Integer> countCommunityNumbers(final CommonData data, final GrouproundRecord groupRound)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        Map<CommunityRecord, Integer> communityMap = new HashMap<>();
        List<PlayerroundRecord> prList = dslContext.selectFrom(Tables.PLAYERROUND)
                .where(Tables.PLAYERROUND.GROUPROUND_ID.eq(groupRound.getId())).fetch();
        for (var playerRound : prList)
        {
            if (playerRound.getFinalHousegroupId() != null)
            {
                HousegroupRecord houseGroup =
                        SqlUtils.readRecordFromId(data, Tables.HOUSEGROUP, playerRound.getFinalHousegroupId());
                HouseRecord house = SqlUtils.readRecordFromId(data, Tables.HOUSE, houseGroup.getHouseId());
                CommunityRecord community = SqlUtils.readRecordFromId(data, Tables.COMMUNITY, house.getCommunityId());
                if (communityMap.containsKey(community))
                    communityMap.put(community, communityMap.get(community) + 1);
                else
                    communityMap.put(community, 1);
            }
        }
        return communityMap;
    }

    public static Map<CommunityRecord, Integer> calcTaxMap(final CommonData data, final GrouproundRecord groupRound)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        Map<CommunityRecord, Integer> communityMap = Taxes.countCommunityNumbers(data, groupRound);
        Map<CommunityRecord, Integer> taxMap = new HashMap<>();
        GroupRecord group = SqlUtils.readRecordFromId(data, Tables.GROUP, groupRound.getGroupId());
        ScenarioRecord scenario = SqlUtils.readRecordFromId(data, Tables.SCENARIO, group.getScenarioId());
        var cumulativeNewsEffects =
                CumulativeNewsEffects.readCumulativeNewsEffects(data.getDataSource(), scenario, groupRound.getRoundNumber());
        for (var community : communityMap.keySet())
        {
            List<TaxRecord> taxList =
                    dslContext.selectFrom(Tables.TAX).where(Tables.TAX.COMMUNITY_ID.eq(community.getId())).fetch();
            taxMap.put(community, 1000);

            // tax change based on measures
            int txc = (int) cumulativeNewsEffects.get(community.getId()).getTaxChange();

            for (TaxRecord tax : taxList)
            {
                int nr = communityMap.get(community);
                if (nr >= tax.getMinimumInhabitants() && nr <= tax.getMaximumInhabitants())
                {
                    taxMap.put(community, tax.getTaxCost().intValue() + txc);
                    break;
                }
            }
        }

        return taxMap;
    }

    public static void applyTax(final CommonData data, final Map<CommunityRecord, Integer> taxMap,
            final PlayerroundRecord playerRound)
    {
        if (playerRound.getFinalHousegroupId() != null)
        {
            HousegroupRecord houseGroup =
                    SqlUtils.readRecordFromId(data, Tables.HOUSEGROUP, playerRound.getFinalHousegroupId());
            HouseRecord house = SqlUtils.readRecordFromId(data, Tables.HOUSE, houseGroup.getHouseId());
            CommunityRecord community = SqlUtils.readRecordFromId(data, Tables.COMMUNITY, house.getCommunityId());
            int taxCost = taxMap.get(community);
            playerRound.setCostTaxes(taxCost);
            // recalculate player satisfaction and income
            CalcPlayerState.calculatePlayerRoundTotals(data, playerRound);
            playerRound.store();
        }
    }

}
