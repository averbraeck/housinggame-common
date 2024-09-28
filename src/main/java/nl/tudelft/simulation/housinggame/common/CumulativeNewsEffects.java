package nl.tudelft.simulation.housinggame.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import nl.tudelft.simulation.housinggame.data.Tables;
import nl.tudelft.simulation.housinggame.data.tables.records.CommunityRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.NewseffectsRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.NewsitemRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.ScenarioRecord;

/**
 * CumulativeNewsEffects contains the added effects of news messages per community. It is the added effect, which means that if
 * there was a tax increase in round 3 of 10% and a tax reduction of 10% in round 5, the tax have its original value from round
 * 5 onward.
 * <p>
 * Copyright (c) 2020-2024 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public class CumulativeNewsEffects
{
    private final int roundNumber;

    private final int communityId;

    private final String communityName;

    private int pluvialBaseProtection = 0;

    private int fluvialBaseProtection = 0;

    private int pluvialProtectionDelta = 0;

    private int fluvialProtectionDelta = 0;

    /** true = euros, false = percent. */
    private boolean discountEuros;

    /** house discount to apply in first round after flooding. */
    private int discountRound1;

    /** house discount to apply in second round after flooding. */
    private int discountRound2;

    /** house discount to apply in third round after flooding. */
    private int discountRound3;

    private double taxChange = 0;

    private int satisfactionLivingBonus = 0;

    private int satisfactionMoveChange = 0;

    /**
     * @param roundNumber
     * @param communityId
     * @param communityName
     */
    public CumulativeNewsEffects(final int roundNumber, final int communityId, final String communityName)
    {
        this.roundNumber = roundNumber;
        this.communityId = communityId;
        this.communityName = communityName;
    }

    /**
     * @return roundNumber
     */
    public int getRoundNumber()
    {
        return this.roundNumber;
    }

    /**
     * @return communityId
     */
    public int getCommunityId()
    {
        return this.communityId;
    }

    /**
     * @return communityName
     */
    public String getCommunityName()
    {
        return this.communityName;
    }

    /**
     * @return pluvialBaseProtection
     */
    public int getPluvialBaseProtection()
    {
        return this.pluvialBaseProtection;
    }

    /**
     * @return fluvialBaseProtection
     */
    public int getFluvialBaseProtection()
    {
        return this.fluvialBaseProtection;
    }

    /**
     * @return pluvialProtectionDelta
     */
    public int getPluvialProtectionDelta()
    {
        return this.pluvialProtectionDelta;
    }

    /**
     * @return fluvialProtectionDelta
     */
    public int getFluvialProtectionDelta()
    {
        return this.fluvialProtectionDelta;
    }

    /**
     * @return taxChange
     */
    public double getTaxChange()
    {
        return this.taxChange;
    }

    /**
     * @return satisfactionLivingBonus
     */
    public int getSatisfactionLivingBonus()
    {
        return this.satisfactionLivingBonus;
    }

    /**
     * @return satisfactionMoveChange
     */
    public int getSatisfactionMoveChange()
    {
        return this.satisfactionMoveChange;
    }

    /**
     * @return discountEuros: true if discount is in Euros, false if it is a percentage
     */
    public boolean isDiscountEuros()
    {
        return this.discountEuros;
    }

    /**
     * @return discountRound1
     */
    public int getDiscountRound1()
    {
        return this.discountRound1;
    }

    /**
     * @return discountRound2
     */
    public int getDiscountRound2()
    {
        return this.discountRound2;
    }

    /**
     * @return discountRound3
     */
    public int getDiscountRound3()
    {
        return this.discountRound3;
    }

    /**
     * @param pluvialBaseProtection set pluvialBaseProtection
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects setPluvialBaseProtection(final int pluvialBaseProtection)
    {
        this.pluvialBaseProtection = pluvialBaseProtection;
        return this;
    }

    /**
     * @param fluvialBaseProtection set fluvialBaseProtection
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects setFluvialBaseProtection(final int fluvialBaseProtection)
    {
        this.fluvialBaseProtection = fluvialBaseProtection;
        return this;
    }

    /**
     * @param pluvialProtectionDelta set pluvialProtectionDelta
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects addPluvialProtectionDelta(final int pluvialProtectionDelta)
    {
        this.pluvialProtectionDelta += pluvialProtectionDelta;
        return this;
    }

    /**
     * @param fluvialProtectionDelta set fluvialProtectionDelta
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects addFluvialProtectionDelta(final int fluvialProtectionDelta)
    {
        this.fluvialProtectionDelta += fluvialProtectionDelta;
        return this;
    }

    /**
     * @param taxChange set taxChange
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects addTaxChange(final double taxChange)
    {
        this.taxChange += taxChange;
        return this;
    }

    /**
     * @param satisfactionLivingBonus set satisfactionLivingBonus
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects addSatisfactionLivingBonus(final int satisfactionLivingBonus)
    {
        this.satisfactionLivingBonus += satisfactionLivingBonus;
        return this;
    }

    /**
     * @param satisfactionMoveChange set satisfactionMoveChange
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects addSatisfactionMoveChange(final int satisfactionMoveChange)
    {
        this.satisfactionMoveChange += satisfactionMoveChange;
        return this;
    }

    /**
     * @param discountEuros set discountEuros
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects setDiscountEuros(final boolean discountEuros)
    {
        this.discountEuros = discountEuros;
        return this;
    }

    /**
     * @param discountRound1 set discountRound1
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects addDiscountRound1(final int discountRound1)
    {
        this.discountRound1 += discountRound1;
        return this;
    }

    /**
     * @param discountRound2 set discountRound2
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects addDiscountRound2(final int discountRound2)
    {
        this.discountRound2 += discountRound2;
        return this;
    }

    /**
     * @param discountRound3 set discountRound3
     * @return CumulativeNewsEffects
     */
    public CumulativeNewsEffects addDiscountRound3(final int discountRound3)
    {
        this.discountRound3 += discountRound3;
        return this;
    }

    public static Map<Integer, CumulativeNewsEffects> readCumulativeNewsEffects(final DataSource dataSource,
            final ScenarioRecord scenario, final int roundNumber)
    {
        Map<Integer, CumulativeNewsEffects> effectsMap = new HashMap<>();
        DSLContext dslContext = DSL.using(dataSource, SQLDialect.MYSQL);
        var scenarioParameters =
                SqlUtils.readRecordFromId(dataSource, Tables.SCENARIOPARAMETERS, scenario.getScenarioparametersId());
        List<CommunityRecord> communityList = dslContext.selectFrom(Tables.COMMUNITY)
                .where(Tables.COMMUNITY.GAMEVERSION_ID.eq(scenario.getGameversionId())).fetch();
        Map<Integer, CommunityRecord> communityMap = new HashMap<>();
        for (var community : communityList)
        {
            var effects = new CumulativeNewsEffects(roundNumber, community.getId(), community.getName());
            effects.setFluvialBaseProtection(community.getFluvialProtection());
            effects.setPluvialBaseProtection(community.getPluvialProtection());
            effectsMap.put(community.getId(), effects);
            communityMap.put(community.getId(), community);
        }

        List<NewsitemRecord> newsItemList = dslContext.selectFrom(Tables.NEWSITEM)
                .where(Tables.NEWSITEM.SCENARIO_ID.eq(scenario.getId())).fetch().sortAsc(Tables.NEWSITEM.ROUND_NUMBER);
        for (var newsItem : newsItemList)
        {
            if (newsItem.getRoundNumber().intValue() <= roundNumber)
            {
                List<NewseffectsRecord> newsEffectList = dslContext.selectFrom(Tables.NEWSEFFECTS)
                        .where(Tables.NEWSEFFECTS.NEWSITEM_ID.eq(newsItem.getId())).fetch();
                for (var newsEffect : newsEffectList)
                {
                    var communities = newsEffect.getCommunityId() == null ? new ArrayList<CommunityRecord>(communityList)
                            : List.of(communityMap.get(newsEffect.getCommunityId()));
                    for (var community : communities)
                    {
                        if (newsEffect.getPluvialProtectionChange() != null)
                            effectsMap.get(community.getId())
                                    .addPluvialProtectionDelta(newsEffect.getPluvialProtectionChange());
                        if (newsEffect.getFluvialProtectionChange() != null)
                            effectsMap.get(community.getId())
                                    .addFluvialProtectionDelta(newsEffect.getFluvialProtectionChange());
                        if (newsEffect.getTaxChange() != null)
                            effectsMap.get(community.getId()).addTaxChange(newsEffect.getTaxChange());
                        if (newsEffect.getSatisfactionLivingBonus() != null)
                            effectsMap.get(community.getId())
                                    .addSatisfactionLivingBonus(newsEffect.getSatisfactionLivingBonus());
                        if (newsEffect.getSatisfactionMoveChange() != null)
                            effectsMap.get(community.getId()).addSatisfactionMoveChange(newsEffect.getSatisfactionMoveChange());
                        if (newsEffect.getHouseDiscountRound1() != null)
                        {
                            int hdr1 = newsEffect.getHouseDiscountRound1() == null ? 0 : newsEffect.getHouseDiscountRound1();
                            int hdr2 = newsEffect.getHouseDiscountRound2() == null ? 0 : newsEffect.getHouseDiscountRound2();
                            int hdr3 = newsEffect.getHouseDiscountRound3() == null ? 0 : newsEffect.getHouseDiscountRound3();
                            boolean discountEuros = scenarioParameters.getNewsDiscountInEuros().intValue() != 0;
                            effectsMap.get(community.getId()).setDiscountEuros(discountEuros);
                            effectsMap.get(community.getId()).addDiscountRound1(hdr1);
                            effectsMap.get(community.getId()).addDiscountRound2(hdr2);
                            effectsMap.get(community.getId()).addDiscountRound3(hdr3);
                        }
                    }
                }
            }
        }

        System.out.println(effectsMap);

        return effectsMap;
    }

    /** {@inheritDoc} */
    @Override
    public String toString()
    {
        return "CumulativeNewsEffects [roundNumber=" + this.roundNumber + ", communityId=" + this.communityId
                + ", communityName=" + this.communityName + ", pluvialBaseProtection=" + this.pluvialBaseProtection
                + ", fluvialBaseProtection=" + this.fluvialBaseProtection + ", pluvialProtectionDelta="
                + this.pluvialProtectionDelta + ", fluvialProtectionDelta=" + this.fluvialProtectionDelta + ", discountEuros="
                + this.discountEuros + ", discountRound1=" + this.discountRound1 + ", discountRound2=" + this.discountRound2
                + ", discountRound3=" + this.discountRound3 + ", taxChange=" + this.taxChange + ", satisfactionLivingBonus="
                + this.satisfactionLivingBonus + ", satisfactionMoveChange=" + this.satisfactionMoveChange + "]";
    }

}
