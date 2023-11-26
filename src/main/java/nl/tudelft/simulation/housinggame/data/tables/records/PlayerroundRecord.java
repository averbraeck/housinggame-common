/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import java.time.LocalDateTime;

import nl.tudelft.simulation.housinggame.data.tables.Playerround;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlayerroundRecord extends UpdatableRecordImpl<PlayerroundRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.playerround.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.playerround.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.playerround.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.playerround.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>housinggame.playerround.start_savings</code>.
     */
    public void setStartSavings(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.playerround.start_savings</code>.
     */
    public Integer getStartSavings() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>housinggame.playerround.start_debt</code>.
     */
    public void setStartDebt(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.playerround.start_debt</code>.
     */
    public Integer getStartDebt() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>housinggame.playerround.round_income</code>.
     */
    public void setRoundIncome(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.playerround.round_income</code>.
     */
    public Integer getRoundIncome() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>housinggame.playerround.living_costs</code>.
     */
    public void setLivingCosts(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.playerround.living_costs</code>.
     */
    public Integer getLivingCosts() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>housinggame.playerround.paid_debt</code>.
     */
    public void setPaidDebt(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>housinggame.playerround.paid_debt</code>.
     */
    public Integer getPaidDebt() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>housinggame.playerround.paid_mortgage</code>.
     */
    public void setPaidMortgage(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>housinggame.playerround.paid_mortgage</code>.
     */
    public Integer getPaidMortgage() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>housinggame.playerround.profit_sold_house</code>.
     */
    public void setProfitSoldHouse(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>housinggame.playerround.profit_sold_house</code>.
     */
    public Integer getProfitSoldHouse() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.spent_savings_for_buying_house</code>.
     */
    public void setSpentSavingsForBuyingHouse(Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.spent_savings_for_buying_house</code>.
     */
    public Integer getSpentSavingsForBuyingHouse() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>housinggame.playerround.cost_taxes</code>.
     */
    public void setCostTaxes(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>housinggame.playerround.cost_taxes</code>.
     */
    public Integer getCostTaxes() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>housinggame.playerround.cost_measures_bought</code>.
     */
    public void setCostMeasuresBought(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>housinggame.playerround.cost_measures_bought</code>.
     */
    public Integer getCostMeasuresBought() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>housinggame.playerround.cost_satisfaction_bought</code>.
     */
    public void setCostSatisfactionBought(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>housinggame.playerround.cost_satisfaction_bought</code>.
     */
    public Integer getCostSatisfactionBought() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>housinggame.playerround.cost_fluvial_damage</code>.
     */
    public void setCostFluvialDamage(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>housinggame.playerround.cost_fluvial_damage</code>.
     */
    public Integer getCostFluvialDamage() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>housinggame.playerround.cost_pluvial_damage</code>.
     */
    public void setCostPluvialDamage(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>housinggame.playerround.cost_pluvial_damage</code>.
     */
    public Integer getCostPluvialDamage() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>housinggame.playerround.final_spendable_income</code>.
     */
    public void setFinalSpendableIncome(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>housinggame.playerround.final_spendable_income</code>.
     */
    public Integer getFinalSpendableIncome() {
        return (Integer) get(15);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.start_personal_satisfaction</code>.
     */
    public void setStartPersonalSatisfaction(Integer value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.start_personal_satisfaction</code>.
     */
    public Integer getStartPersonalSatisfaction() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>housinggame.playerround.start_house_satisfaction</code>.
     */
    public void setStartHouseSatisfaction(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>housinggame.playerround.start_house_satisfaction</code>.
     */
    public Integer getStartHouseSatisfaction() {
        return (Integer) get(17);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.satisfacction_move_penalty</code>.
     */
    public void setSatisfacctionMovePenalty(Integer value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.satisfacction_move_penalty</code>.
     */
    public Integer getSatisfacctionMovePenalty() {
        return (Integer) get(18);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.satisfaction_house_rating_delta</code>.
     */
    public void setSatisfactionHouseRatingDelta(Integer value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.satisfaction_house_rating_delta</code>.
     */
    public Integer getSatisfactionHouseRatingDelta() {
        return (Integer) get(19);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.satisfaction_house_measures</code>.
     */
    public void setSatisfactionHouseMeasures(Integer value) {
        set(20, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.satisfaction_house_measures</code>.
     */
    public Integer getSatisfactionHouseMeasures() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>housinggame.playerround.satisfaction_bought</code>.
     */
    public void setSatisfactionBought(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>housinggame.playerround.satisfaction_bought</code>.
     */
    public Integer getSatisfactionBought() {
        return (Integer) get(21);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.satisfaction_fluvial_damage</code>.
     */
    public void setSatisfactionFluvialDamage(Integer value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.satisfaction_fluvial_damage</code>.
     */
    public Integer getSatisfactionFluvialDamage() {
        return (Integer) get(22);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.satisfaction_pluvial_damage</code>.
     */
    public void setSatisfactionPluvialDamage(Integer value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.satisfaction_pluvial_damage</code>.
     */
    public Integer getSatisfactionPluvialDamage() {
        return (Integer) get(23);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.satisfaction_debt_penalty</code>.
     */
    public void setSatisfactionDebtPenalty(Integer value) {
        set(24, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.satisfaction_debt_penalty</code>.
     */
    public Integer getSatisfactionDebtPenalty() {
        return (Integer) get(24);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.final_personal_satisfaction</code>.
     */
    public void setFinalPersonalSatisfaction(Integer value) {
        set(25, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.final_personal_satisfaction</code>.
     */
    public Integer getFinalPersonalSatisfaction() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>housinggame.playerround.final_house_satisfaction</code>.
     */
    public void setFinalHouseSatisfaction(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>housinggame.playerround.final_house_satisfaction</code>.
     */
    public Integer getFinalHouseSatisfaction() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>housinggame.playerround.start_houseround_id</code>.
     */
    public void setStartHouseroundId(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>housinggame.playerround.start_houseround_id</code>.
     */
    public Integer getStartHouseroundId() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>housinggame.playerround.start_mortgage</code>.
     */
    public void setStartMortgage(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>housinggame.playerround.start_mortgage</code>.
     */
    public Integer getStartMortgage() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>housinggame.playerround.maximum_mortgage</code>.
     */
    public void setMaximumMortgage(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>housinggame.playerround.maximum_mortgage</code>.
     */
    public Integer getMaximumMortgage() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>housinggame.playerround.preferred_house_rating</code>.
     */
    public void setPreferredHouseRating(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>housinggame.playerround.preferred_house_rating</code>.
     */
    public Integer getPreferredHouseRating() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>housinggame.playerround.mortgage_left</code>.
     */
    public void setMortgageLeft(Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>housinggame.playerround.mortgage_left</code>.
     */
    public Integer getMortgageLeft() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>housinggame.playerround.house_price_sold</code>.
     */
    public void setHousePriceSold(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>housinggame.playerround.house_price_sold</code>.
     */
    public Integer getHousePriceSold() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>housinggame.playerround.house_price_bought</code>.
     */
    public void setHousePriceBought(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>housinggame.playerround.house_price_bought</code>.
     */
    public Integer getHousePriceBought() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>housinggame.playerround.final_houseround_id</code>.
     */
    public void setFinalHouseroundId(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>housinggame.playerround.final_houseround_id</code>.
     */
    public Integer getFinalHouseroundId() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>housinggame.playerround.moving_reason</code>.
     */
    public void setMovingReason(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>housinggame.playerround.moving_reason</code>.
     */
    public String getMovingReason() {
        return (String) get(35);
    }

    /**
     * Setter for <code>housinggame.playerround.pluvial_damage</code>.
     */
    public void setPluvialDamage(Integer value) {
        set(36, value);
    }

    /**
     * Getter for <code>housinggame.playerround.pluvial_damage</code>.
     */
    public Integer getPluvialDamage() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>housinggame.playerround.new_mortgage</code>.
     */
    public void setNewMortgage(Integer value) {
        set(37, value);
    }

    /**
     * Getter for <code>housinggame.playerround.new_mortgage</code>.
     */
    public Integer getNewMortgage() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>housinggame.playerround.fluvial_damage</code>.
     */
    public void setFluvialDamage(Integer value) {
        set(38, value);
    }

    /**
     * Getter for <code>housinggame.playerround.fluvial_damage</code>.
     */
    public Integer getFluvialDamage() {
        return (Integer) get(38);
    }

    /**
     * Setter for <code>housinggame.playerround.player_state</code>.
     */
    public void setPlayerState(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>housinggame.playerround.player_state</code>.
     */
    public String getPlayerState() {
        return (String) get(39);
    }

    /**
     * Setter for <code>housinggame.playerround.player_id</code>.
     */
    public void setPlayerId(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>housinggame.playerround.player_id</code>.
     */
    public Integer getPlayerId() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>housinggame.playerround.groupround_id</code>.
     */
    public void setGrouproundId(Integer value) {
        set(41, value);
    }

    /**
     * Getter for <code>housinggame.playerround.groupround_id</code>.
     */
    public Integer getGrouproundId() {
        return (Integer) get(41);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlayerroundRecord
     */
    public PlayerroundRecord() {
        super(Playerround.PLAYERROUND);
    }

    /**
     * Create a detached, initialised PlayerroundRecord
     */
    public PlayerroundRecord(Integer id, LocalDateTime createTime, Integer startSavings, Integer startDebt, Integer roundIncome, Integer livingCosts, Integer paidDebt, Integer paidMortgage, Integer profitSoldHouse, Integer spentSavingsForBuyingHouse, Integer costTaxes, Integer costMeasuresBought, Integer costSatisfactionBought, Integer costFluvialDamage, Integer costPluvialDamage, Integer finalSpendableIncome, Integer startPersonalSatisfaction, Integer startHouseSatisfaction, Integer satisfacctionMovePenalty, Integer satisfactionHouseRatingDelta, Integer satisfactionHouseMeasures, Integer satisfactionBought, Integer satisfactionFluvialDamage, Integer satisfactionPluvialDamage, Integer satisfactionDebtPenalty, Integer finalPersonalSatisfaction, Integer finalHouseSatisfaction, Integer startHouseroundId, Integer startMortgage, Integer maximumMortgage, Integer preferredHouseRating, Integer mortgageLeft, Integer housePriceSold, Integer housePriceBought, Integer finalHouseroundId, String movingReason, Integer pluvialDamage, Integer newMortgage, Integer fluvialDamage, String playerState, Integer playerId, Integer grouproundId) {
        super(Playerround.PLAYERROUND);

        setId(id);
        setCreateTime(createTime);
        setStartSavings(startSavings);
        setStartDebt(startDebt);
        setRoundIncome(roundIncome);
        setLivingCosts(livingCosts);
        setPaidDebt(paidDebt);
        setPaidMortgage(paidMortgage);
        setProfitSoldHouse(profitSoldHouse);
        setSpentSavingsForBuyingHouse(spentSavingsForBuyingHouse);
        setCostTaxes(costTaxes);
        setCostMeasuresBought(costMeasuresBought);
        setCostSatisfactionBought(costSatisfactionBought);
        setCostFluvialDamage(costFluvialDamage);
        setCostPluvialDamage(costPluvialDamage);
        setFinalSpendableIncome(finalSpendableIncome);
        setStartPersonalSatisfaction(startPersonalSatisfaction);
        setStartHouseSatisfaction(startHouseSatisfaction);
        setSatisfacctionMovePenalty(satisfacctionMovePenalty);
        setSatisfactionHouseRatingDelta(satisfactionHouseRatingDelta);
        setSatisfactionHouseMeasures(satisfactionHouseMeasures);
        setSatisfactionBought(satisfactionBought);
        setSatisfactionFluvialDamage(satisfactionFluvialDamage);
        setSatisfactionPluvialDamage(satisfactionPluvialDamage);
        setSatisfactionDebtPenalty(satisfactionDebtPenalty);
        setFinalPersonalSatisfaction(finalPersonalSatisfaction);
        setFinalHouseSatisfaction(finalHouseSatisfaction);
        setStartHouseroundId(startHouseroundId);
        setStartMortgage(startMortgage);
        setMaximumMortgage(maximumMortgage);
        setPreferredHouseRating(preferredHouseRating);
        setMortgageLeft(mortgageLeft);
        setHousePriceSold(housePriceSold);
        setHousePriceBought(housePriceBought);
        setFinalHouseroundId(finalHouseroundId);
        setMovingReason(movingReason);
        setPluvialDamage(pluvialDamage);
        setNewMortgage(newMortgage);
        setFluvialDamage(fluvialDamage);
        setPlayerState(playerState);
        setPlayerId(playerId);
        setGrouproundId(grouproundId);
        resetChangedOnNotNull();
    }
}
