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
     * Setter for <code>housinggame.playerround.satisfaction</code>.
     */
    public void setSatisfaction(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.playerround.satisfaction</code>.
     */
    public Integer getSatisfaction() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>housinggame.playerround.savings</code>.
     */
    public void setSavings(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.playerround.savings</code>.
     */
    public Integer getSavings() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>housinggame.playerround.maximum_mortgage</code>.
     */
    public void setMaximumMortgage(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.playerround.maximum_mortgage</code>.
     */
    public Integer getMaximumMortgage() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>housinggame.playerround.mortgage</code>.
     */
    public void setMortgage(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.playerround.mortgage</code>.
     */
    public Integer getMortgage() {
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
     * Setter for <code>housinggame.playerround.income_per_round</code>.
     */
    public void setIncomePerRound(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>housinggame.playerround.income_per_round</code>.
     */
    public Integer getIncomePerRound() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>housinggame.playerround.debt</code>.
     */
    public void setDebt(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>housinggame.playerround.debt</code>.
     */
    public Integer getDebt() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>housinggame.playerround.spendable_income</code>.
     */
    public void setSpendableIncome(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>housinggame.playerround.spendable_income</code>.
     */
    public Integer getSpendableIncome() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>housinggame.playerround.preferred_house_rating</code>.
     */
    public void setPreferredHouseRating(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>housinggame.playerround.preferred_house_rating</code>.
     */
    public Integer getPreferredHouseRating() {
        return (Integer) get(9);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.satisfaction_cost_per_point</code>.
     */
    public void setSatisfactionCostPerPoint(Integer value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.satisfaction_cost_per_point</code>.
     */
    public Integer getSatisfactionCostPerPoint() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>housinggame.playerround.house_price_sold</code>.
     */
    public void setHousePriceSold(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>housinggame.playerround.house_price_sold</code>.
     */
    public Integer getHousePriceSold() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>housinggame.playerround.house_price_bought</code>.
     */
    public void setHousePriceBought(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>housinggame.playerround.house_price_bought</code>.
     */
    public Integer getHousePriceBought() {
        return (Integer) get(12);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.spent_savings_for_buying_house</code>.
     */
    public void setSpentSavingsForBuyingHouse(Integer value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.spent_savings_for_buying_house</code>.
     */
    public Integer getSpentSavingsForBuyingHouse() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>housinggame.playerround.paid_off_debt</code>.
     */
    public void setPaidOffDebt(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>housinggame.playerround.paid_off_debt</code>.
     */
    public Integer getPaidOffDebt() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>housinggame.playerround.cost_measure_bought</code>.
     */
    public void setCostMeasureBought(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>housinggame.playerround.cost_measure_bought</code>.
     */
    public Integer getCostMeasureBought() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>housinggame.playerround.pluvial_damage</code>.
     */
    public void setPluvialDamage(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>housinggame.playerround.pluvial_damage</code>.
     */
    public Integer getPluvialDamage() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>housinggame.playerround.fluvial_damage</code>.
     */
    public void setFluvialDamage(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>housinggame.playerround.fluvial_damage</code>.
     */
    public Integer getFluvialDamage() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>housinggame.playerround.repaired_damage</code>.
     */
    public void setRepairedDamage(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>housinggame.playerround.repaired_damage</code>.
     */
    public Integer getRepairedDamage() {
        return (Integer) get(18);
    }

    /**
     * Setter for
     * <code>housinggame.playerround.satisfaction_point_bought</code>.
     */
    public void setSatisfactionPointBought(Integer value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>housinggame.playerround.satisfaction_point_bought</code>.
     */
    public Integer getSatisfactionPointBought() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>housinggame.playerround.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>housinggame.playerround.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>housinggame.playerround.moving_reason</code>.
     */
    public void setMovingReason(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>housinggame.playerround.moving_reason</code>.
     */
    public String getMovingReason() {
        return (String) get(21);
    }

    /**
     * Setter for <code>housinggame.playerround.player_state</code>.
     */
    public void setPlayerState(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>housinggame.playerround.player_state</code>.
     */
    public String getPlayerState() {
        return (String) get(22);
    }

    /**
     * Setter for <code>housinggame.playerround.house_id</code>.
     */
    public void setHouseId(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>housinggame.playerround.house_id</code>.
     */
    public Integer getHouseId() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>housinggame.playerround.player_id</code>.
     */
    public void setPlayerId(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>housinggame.playerround.player_id</code>.
     */
    public Integer getPlayerId() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>housinggame.playerround.groupround_id</code>.
     */
    public void setGrouproundId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>housinggame.playerround.groupround_id</code>.
     */
    public Integer getGrouproundId() {
        return (Integer) get(25);
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
    public PlayerroundRecord(Integer id, Integer satisfaction, Integer savings, Integer maximumMortgage, Integer mortgage, Integer livingCosts, Integer incomePerRound, Integer debt, Integer spendableIncome, Integer preferredHouseRating, Integer satisfactionCostPerPoint, Integer housePriceSold, Integer housePriceBought, Integer spentSavingsForBuyingHouse, Integer paidOffDebt, Integer costMeasureBought, Integer pluvialDamage, Integer fluvialDamage, Integer repairedDamage, Integer satisfactionPointBought, LocalDateTime createTime, String movingReason, String playerState, Integer houseId, Integer playerId, Integer grouproundId) {
        super(Playerround.PLAYERROUND);

        setId(id);
        setSatisfaction(satisfaction);
        setSavings(savings);
        setMaximumMortgage(maximumMortgage);
        setMortgage(mortgage);
        setLivingCosts(livingCosts);
        setIncomePerRound(incomePerRound);
        setDebt(debt);
        setSpendableIncome(spendableIncome);
        setPreferredHouseRating(preferredHouseRating);
        setSatisfactionCostPerPoint(satisfactionCostPerPoint);
        setHousePriceSold(housePriceSold);
        setHousePriceBought(housePriceBought);
        setSpentSavingsForBuyingHouse(spentSavingsForBuyingHouse);
        setPaidOffDebt(paidOffDebt);
        setCostMeasureBought(costMeasureBought);
        setPluvialDamage(pluvialDamage);
        setFluvialDamage(fluvialDamage);
        setRepairedDamage(repairedDamage);
        setSatisfactionPointBought(satisfactionPointBought);
        setCreateTime(createTime);
        setMovingReason(movingReason);
        setPlayerState(playerState);
        setHouseId(houseId);
        setPlayerId(playerId);
        setGrouproundId(grouproundId);
        resetChangedOnNotNull();
    }
}
