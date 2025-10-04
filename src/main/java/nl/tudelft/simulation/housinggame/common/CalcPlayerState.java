package nl.tudelft.simulation.housinggame.common;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.GroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.GrouproundRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousegroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerroundRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.ScenarioRecord;

/**
 * CalcPlayerState.java.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public class CalcPlayerState
{

    /**
     * This method always returns a list of length up to and including the current round number. Not played rounds are null.
     * @param data FacilitatorData
     * @param playerId player to retrieve
     * @return list of PlayerRoundRecords
     */
    public static List<PlayerroundRecord> getPlayerRoundList(final CommonData data, final int playerId)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        PlayerRecord player = SqlUtils.readRecordFromId(data, Tables.PLAYER, playerId);
        GroupRecord group = SqlUtils.readRecordFromId(data, Tables.GROUP, player.getGroupId());
        List<GrouproundRecord> groupRoundList =
                dslContext.selectFrom(Tables.GROUPROUND).where(Tables.GROUPROUND.GROUP_ID.eq(group.getId())).fetch();
        List<PlayerroundRecord> playerRoundList = new ArrayList<>();
        for (GrouproundRecord groupRound : groupRoundList)
        {
            PlayerroundRecord playerRound =
                    dslContext.selectFrom(Tables.PLAYERROUND).where(Tables.PLAYERROUND.PLAYER_ID.eq(playerId))
                            .and(Tables.PLAYERROUND.GROUPROUND_ID.eq(groupRound.getId())).fetchAny();
            playerRoundList.add(playerRound);
        }
        return playerRoundList;
    }

    /**
     * Return the current PlayerRound or null when not started.
     * @param data FacilitatorData
     * @param playerId player to retrieve
     * @return list of PlayerRoundRecords
     */
    public static PlayerroundRecord getCurrentPlayerRound(final CommonData data, final int playerId)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        PlayerRecord player = SqlUtils.readRecordFromId(data, Tables.PLAYER, playerId);
        GroupRecord group = SqlUtils.readRecordFromId(data, Tables.GROUP, player.getGroupId());
        List<GrouproundRecord> groupRoundList =
                dslContext.selectFrom(Tables.GROUPROUND).where(Tables.GROUPROUND.GROUP_ID.eq(group.getId())).fetch();
        GrouproundRecord groupRound = groupRoundList.get(groupRoundList.size() - 1);
        return dslContext.selectFrom(Tables.PLAYERROUND).where(Tables.PLAYERROUND.PLAYER_ID.eq(playerId))
                .and(Tables.PLAYERROUND.GROUPROUND_ID.eq(groupRound.getId())).fetchAny();
    }

    public static PlayerroundRecord getLastPlayerRound(final CommonData data, final int playerId)
    {
        List<PlayerroundRecord> playerRoundList = getPlayerRoundList(data, playerId);
        if (!playerRoundList.isEmpty())
        {
            PlayerroundRecord prr = playerRoundList.get(0);
            for (int i = 0; i < playerRoundList.size(); i++)
            {
                if (playerRoundList.get(i) != null)
                    prr = playerRoundList.get(i);
            }
            return prr;
        }
        return null;
    }

    public static PlayerroundRecord getPrevPlayerRound(final CommonData data, final int playerId)
    {
        List<PlayerroundRecord> playerRoundList = getPlayerRoundList(data, playerId);
        if (!playerRoundList.isEmpty())
        {
            PlayerroundRecord prr = playerRoundList.get(0);
            PlayerroundRecord prrPrev = playerRoundList.get(0);
            for (int i = 0; i < playerRoundList.size(); i++)
            {
                if (playerRoundList.get(i) != null)
                {
                    prrPrev = prr;
                    prr = playerRoundList.get(i);
                }
            }
            return prrPrev;
        }
        return null;
    }

    public static void normalizeSatisfaction(final CommonData data, final PlayerroundRecord playerRound)
    {
        PlayerRecord player = SqlUtils.readRecordFromId(data, Tables.PLAYER, playerRound.getPlayerId());
        GroupRecord group = SqlUtils.readRecordFromId(data, Tables.GROUP, player.getGroupId());
        ScenarioRecord scenario = SqlUtils.readRecordFromId(data, Tables.SCENARIO, group.getScenarioId());
        var params = SqlUtils.readRecordFromId(data, Tables.SCENARIOPARAMETERS, scenario.getScenarioparametersId());
        int hgSatisfaction = 0;
        if (playerRound.getFinalHousegroupId() != null)
        {
            var houseGroup = SqlUtils.readRecordFromId(data, Tables.HOUSEGROUP, playerRound.getFinalHousegroupId());
            hgSatisfaction = houseGroup.getHouseSatisfaction();
        }
        // normalize the satisfaction scores if so dictated by the parameters
        if (params.getAllowPersonalSatisfactionNeg() == 0)
            playerRound.setSatisfactionTotal(Math.max(0, playerRound.getSatisfactionTotal()));
        if (params.getAllowTotalSatisfactionNeg() == 0)
            playerRound.setSatisfactionTotal(Math.max(-hgSatisfaction, playerRound.getSatisfactionTotal()));
    }

    public static void calculatePlayerRoundTotals(final CommonData data, final PlayerroundRecord pr)
    {
        PlayerroundRecord prPrev = getPrevPlayerRound(data, pr.getPlayerId());
        int incPrevRound = prPrev.getSpendableIncome();
        int satPrevRound = prPrev.getSatisfactionTotal();
        int newIncome =
                incPrevRound + pr.getRoundIncome() - pr.getLivingCosts() - pr.getMortgagePayment() + pr.getProfitSoldHouse()
                        - pr.getSpentSavingsForBuyingHouse() - pr.getCostTaxes() - pr.getCostHouseMeasuresBought()
                        - pr.getCostPersonalMeasuresBought() - pr.getCostPluvialDamage() - pr.getCostFluvialDamage();
        int newSatisfaction = satPrevRound - pr.getSatisfactionDebtPenalty() + pr.getSatisfactionHouseRatingDelta()
                - pr.getSatisfactionMovePenalty() + pr.getSatisfactionHouseMeasures() + pr.getSatisfactionPersonalMeasures()
                - pr.getSatisfactionPluvialPenalty() - pr.getSatisfactionFluvialPenalty();
        pr.setSpendableIncome(newIncome);
        pr.setSatisfactionTotal(newSatisfaction);
        normalizeSatisfaction(data, pr);
    }

    public static PlayerroundRecord getHouseOwnerInRound(final CommonData data, final HousegroupRecord houseGroup, final int roundNr)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        List<PlayerroundRecord> prrList = dslContext.selectFrom(Tables.PLAYERROUND)
                .where(Tables.PLAYERROUND.FINAL_HOUSEGROUP_ID.eq(houseGroup.getId())).fetch();
        PlayerroundRecord ret = null;
        for (var prr : prrList)
        {
            GrouproundRecord grr = SqlUtils.readRecordFromId(data, Tables.GROUPROUND, prr.getGrouproundId());
            if (grr.getRoundNumber() == roundNr)
                ret = prr;
        }
        return ret;
    }
}
