package nl.tudelft.simulation.housinggame.common;

import java.util.List;
import java.util.Map;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.HouseRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousegroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousemeasureRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasuretypeRecord;

/**
 * CalcHouseGroup.java.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public class CalcHouseGroup
{

    public static void calcFloodHousePlayer(final CommonData data, final HousegroupRecord houseGroup, final int roundNr,
            final Map<Integer, CumulativeNewsEffects> cumulativeNewsEffects, final int pluvialIntensity,
            final int fluvialIntensity)
    {
        DSLContext dslContext = DSL.using(data.getDataSource(), SQLDialect.MYSQL);
        HouseRecord house = SqlUtils.readRecordFromId(data, Tables.HOUSE, houseGroup.getHouseId());
        var group = SqlUtils.readRecordFromId(data, Tables.GROUP, houseGroup.getGroupId());
        var scenario = SqlUtils.readRecordFromId(data, Tables.SCENARIO, group.getScenarioId());
        var params = SqlUtils.readRecordFromId(data, Tables.SCENARIOPARAMETERS, scenario.getScenarioparametersId());
        int pCommDelta = cumulativeNewsEffects.get(house.getCommunityId()).getPluvialProtectionDelta();
        int pluvialCommunityProtection = houseGroup.getPluvialBaseProtection() + pCommDelta;
        int fCommDelta = cumulativeNewsEffects.get(house.getCommunityId()).getFluvialProtectionDelta();
        int fluvialCommunityProtection = houseGroup.getFluvialBaseProtection() + fCommDelta;
        var fpRecord = FluvialPluvial.measureProtectionTillRound(data, roundNr, houseGroup);
        int pHouseDelta = fpRecord.pluvial();
        int fHouseDelta = fpRecord.fluvial();
        int pluvialHouseProtection = pluvialCommunityProtection + pHouseDelta;
        int fluvialHouseProtection = fluvialCommunityProtection + fHouseDelta;

        int pluvialCommunityDamage = Math.max(0, pluvialIntensity - pluvialCommunityProtection);
        int fluvialCommunityDamage = Math.max(0, fluvialIntensity - fluvialCommunityProtection);
        int pluvialHouseDamage = Math.max(0, pluvialIntensity - pluvialHouseProtection);
        int fluvialHouseDamage = Math.max(0, fluvialIntensity - fluvialHouseProtection);

        // set the last round where damage happened
        if (pluvialCommunityDamage > 0)
            houseGroup.setLastRoundCommPluvial(roundNr);
        if (fluvialCommunityDamage > 0)
            houseGroup.setLastRoundCommFluvial(roundNr);
        if (pluvialHouseDamage > 0)
            houseGroup.setLastRoundHousePluvial(roundNr);
        if (fluvialHouseDamage > 0)
            houseGroup.setLastRoundHouseFluvial(roundNr);

        // check if a player owns this house in this round, and set the protection data for the playerround
        var playerRound = CalcPlayerState.getHouseOwnerInRound(data, houseGroup, roundNr);
        if (playerRound != null)
        {
            playerRound.setPluvialBaseProtection(houseGroup.getPluvialBaseProtection());
            playerRound.setFluvialBaseProtection(houseGroup.getFluvialBaseProtection());
            playerRound.setPluvialCommunityDelta(pCommDelta);
            playerRound.setFluvialCommunityDelta(fCommDelta);
            playerRound.setPluvialHouseDelta(pHouseDelta);
            playerRound.setFluvialHouseDelta(fHouseDelta);

            // init
            playerRound.setSatisfactionPluvialPenalty(0);
            playerRound.setSatisfactionFluvialPenalty(0);
            playerRound.setCostPluvialDamage(0);
            playerRound.setCostFluvialDamage(0);

            // calculate the damage satisfaction penalties
            if (pluvialCommunityDamage > 0 && params.getPluvialSatisfactionPenaltyIfAreaFlooded() != null)
            {
                playerRound.setSatisfactionPluvialPenalty(params.getPluvialSatisfactionPenaltyIfAreaFlooded());
            }

            if (fluvialCommunityDamage > 0 && params.getFluvialSatisfactionPenaltyIfAreaFlooded() != null)
            {
                playerRound.setSatisfactionFluvialPenalty(params.getFluvialSatisfactionPenaltyIfAreaFlooded());
            }

            if (pluvialHouseDamage > 0 && params.getPluvialSatisfactionPenaltyHouseFloodedFixed() != null)
            {
                playerRound.setSatisfactionPluvialPenalty(
                        playerRound.getSatisfactionPluvialPenalty() + params.getPluvialSatisfactionPenaltyHouseFloodedFixed());
            }

            if (fluvialHouseDamage > 0 && params.getFluvialSatisfactionPenaltyHouseFloodedFixed() != null)
            {
                playerRound.setSatisfactionFluvialPenalty(
                        playerRound.getSatisfactionFluvialPenalty() + params.getFluvialSatisfactionPenaltyHouseFloodedFixed());
            }

            if (pluvialHouseDamage > 0 && params.getPluvialSatisfactionPenaltyPerDamagePoint() != null)
            {
                playerRound.setSatisfactionPluvialPenalty(playerRound.getSatisfactionPluvialPenalty()
                        + pluvialHouseDamage * params.getPluvialSatisfactionPenaltyPerDamagePoint());
            }

            if (fluvialHouseDamage > 0 && params.getFluvialSatisfactionPenaltyPerDamagePoint() != null)
            {
                playerRound.setSatisfactionFluvialPenalty(playerRound.getSatisfactionFluvialPenalty()
                        + fluvialHouseDamage * params.getFluvialSatisfactionPenaltyPerDamagePoint());
            }

            // calculate the damage cost
            if (pluvialHouseDamage > 0 && params.getPluvialRepairCostsFixed() != null)
            {
                playerRound.setCostPluvialDamage(params.getPluvialRepairCostsFixed());
            }

            if (fluvialHouseDamage > 0 && params.getFluvialRepairCostsFixed() != null)
            {
                playerRound.setCostFluvialDamage(params.getFluvialRepairCostsFixed());
            }

            if (pluvialHouseDamage > 0 && params.getPluvialRepairCostsPerDamagePoint() != null)
            {
                playerRound.setCostPluvialDamage(
                        playerRound.getCostPluvialDamage() + pluvialHouseDamage * params.getPluvialRepairCostsPerDamagePoint());
            }

            if (fluvialHouseDamage > 0 && params.getFluvialRepairCostsPerDamagePoint() != null)
            {
                playerRound.setCostFluvialDamage(
                        playerRound.getCostFluvialDamage() + fluvialHouseDamage * params.getFluvialRepairCostsPerDamagePoint());
            }

            // re-calculate satisfaction and spendable income
            CalcPlayerState.calculatePlayerRoundTotals(data, playerRound);
            playerRound.store();

        } // if (houseGroup.getOwnerId() != null)

        // see if there are one-time measures that have been consumed, and adapt the protection and house satisfaction
        int phd = pluvialHouseDamage;
        int fhd = fluvialHouseDamage;
        if (phd > 0 || fhd > 0)
        {
            List<HousemeasureRecord> hmList = dslContext.selectFrom(Tables.HOUSEMEASURE)
                    .where(Tables.HOUSEMEASURE.HOUSEGROUP_ID.eq(houseGroup.getId())).fetch();
            for (var hm : hmList)
            {
                MeasuretypeRecord mt = SqlUtils.readRecordFromId(data, Tables.MEASURETYPE, hm.getMeasuretypeId());
                if (mt.getFluvialProtectionDelta() > 0 && fhd > 0 && mt.getValidUntilUsed() > 0)
                {
                    fhd -= mt.getFluvialProtectionDelta();
                    hm.setUsedInRound(roundNr);
                    hm.store();
                }
                if (mt.getPluvialProtectionDelta() > 0 && phd > 0 && mt.getValidUntilUsed() > 0)
                {
                    phd -= mt.getPluvialProtectionDelta();
                    hm.setUsedInRound(roundNr);
                    hm.store();
                }
            }
        }

        // update the market value of (all) houses, also based if an area was flooded (fluvial) in previous rounds
        if (houseGroup.getLastRoundCommFluvial() != null && houseGroup.getLastRoundCommFluvial().intValue() != 0
                && roundNr - houseGroup.getLastRoundCommFluvial().intValue() < 3)
        {
            int diff = roundNr - houseGroup.getLastRoundCommFluvial().intValue() + 1;
            int discount = diff == 1 ? cumulativeNewsEffects.get(house.getCommunityId()).getDiscountRound1()
                    : diff == 2 ? cumulativeNewsEffects.get(house.getCommunityId()).getDiscountRound2()
                            : diff == 3 ? cumulativeNewsEffects.get(house.getCommunityId()).getDiscountRound3() : 0;
            if (cumulativeNewsEffects.get(house.getCommunityId()).isDiscountEuros())
            {
                houseGroup.setMarketValue(houseGroup.getOriginalPrice() - discount);
            }
            else
            {
                houseGroup.setMarketValue((int) ((1.0 - discount / 100.0) * houseGroup.getOriginalPrice()));
            }
        }

        houseGroup.store();

    }

}
