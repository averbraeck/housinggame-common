/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Welfaretype;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WelfaretypeRecord extends UpdatableRecordImpl<WelfaretypeRecord> implements Record10<Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.welfaretype.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.welfaretype.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.welfaretype.initial_satisfaction</code>.
     */
    public void setInitialSatisfaction(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.initial_satisfaction</code>.
     */
    public Integer getInitialSatisfaction() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>housinggame.welfaretype.initial_money</code>.
     */
    public void setInitialMoney(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.initial_money</code>.
     */
    public Integer getInitialMoney() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>housinggame.welfaretype.maximum_mortgage</code>.
     */
    public void setMaximumMortgage(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.maximum_mortgage</code>.
     */
    public Integer getMaximumMortgage() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>housinggame.welfaretype.living_costs</code>.
     */
    public void setLivingCosts(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.living_costs</code>.
     */
    public Integer getLivingCosts() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>housinggame.welfaretype.income_per_round</code>.
     */
    public void setIncomePerRound(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.income_per_round</code>.
     */
    public Integer getIncomePerRound() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>housinggame.welfaretype.satisfaction_cost_per_point</code>.
     */
    public void setSatisfactionCostPerPoint(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>housinggame.welfaretype.satisfaction_cost_per_point</code>.
     */
    public Integer getSatisfactionCostPerPoint() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>housinggame.welfaretype.preferred_house_rating</code>.
     */
    public void setPreferredHouseRating(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.preferred_house_rating</code>.
     */
    public Integer getPreferredHouseRating() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>housinggame.welfaretype.scenario_id</code>.
     */
    public void setScenarioId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>housinggame.welfaretype.scenario_id</code>.
     */
    public Integer getScenarioId() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Welfaretype.WELFARETYPE.ID;
    }

    @Override
    public Field<String> field2() {
        return Welfaretype.WELFARETYPE.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Welfaretype.WELFARETYPE.INITIAL_SATISFACTION;
    }

    @Override
    public Field<Integer> field4() {
        return Welfaretype.WELFARETYPE.INITIAL_MONEY;
    }

    @Override
    public Field<Integer> field5() {
        return Welfaretype.WELFARETYPE.MAXIMUM_MORTGAGE;
    }

    @Override
    public Field<Integer> field6() {
        return Welfaretype.WELFARETYPE.LIVING_COSTS;
    }

    @Override
    public Field<Integer> field7() {
        return Welfaretype.WELFARETYPE.INCOME_PER_ROUND;
    }

    @Override
    public Field<Integer> field8() {
        return Welfaretype.WELFARETYPE.SATISFACTION_COST_PER_POINT;
    }

    @Override
    public Field<Integer> field9() {
        return Welfaretype.WELFARETYPE.PREFERRED_HOUSE_RATING;
    }

    @Override
    public Field<Integer> field10() {
        return Welfaretype.WELFARETYPE.SCENARIO_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getInitialSatisfaction();
    }

    @Override
    public Integer component4() {
        return getInitialMoney();
    }

    @Override
    public Integer component5() {
        return getMaximumMortgage();
    }

    @Override
    public Integer component6() {
        return getLivingCosts();
    }

    @Override
    public Integer component7() {
        return getIncomePerRound();
    }

    @Override
    public Integer component8() {
        return getSatisfactionCostPerPoint();
    }

    @Override
    public Integer component9() {
        return getPreferredHouseRating();
    }

    @Override
    public Integer component10() {
        return getScenarioId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getInitialSatisfaction();
    }

    @Override
    public Integer value4() {
        return getInitialMoney();
    }

    @Override
    public Integer value5() {
        return getMaximumMortgage();
    }

    @Override
    public Integer value6() {
        return getLivingCosts();
    }

    @Override
    public Integer value7() {
        return getIncomePerRound();
    }

    @Override
    public Integer value8() {
        return getSatisfactionCostPerPoint();
    }

    @Override
    public Integer value9() {
        return getPreferredHouseRating();
    }

    @Override
    public Integer value10() {
        return getScenarioId();
    }

    @Override
    public WelfaretypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value3(Integer value) {
        setInitialSatisfaction(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value4(Integer value) {
        setInitialMoney(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value5(Integer value) {
        setMaximumMortgage(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value6(Integer value) {
        setLivingCosts(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value7(Integer value) {
        setIncomePerRound(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value8(Integer value) {
        setSatisfactionCostPerPoint(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value9(Integer value) {
        setPreferredHouseRating(value);
        return this;
    }

    @Override
    public WelfaretypeRecord value10(Integer value) {
        setScenarioId(value);
        return this;
    }

    @Override
    public WelfaretypeRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WelfaretypeRecord
     */
    public WelfaretypeRecord() {
        super(Welfaretype.WELFARETYPE);
    }

    /**
     * Create a detached, initialised WelfaretypeRecord
     */
    public WelfaretypeRecord(Integer id, String name, Integer initialSatisfaction, Integer initialMoney, Integer maximumMortgage, Integer livingCosts, Integer incomePerRound, Integer satisfactionCostPerPoint, Integer preferredHouseRating, Integer scenarioId) {
        super(Welfaretype.WELFARETYPE);

        setId(id);
        setName(name);
        setInitialSatisfaction(initialSatisfaction);
        setInitialMoney(initialMoney);
        setMaximumMortgage(maximumMortgage);
        setLivingCosts(livingCosts);
        setIncomePerRound(incomePerRound);
        setSatisfactionCostPerPoint(satisfactionCostPerPoint);
        setPreferredHouseRating(preferredHouseRating);
        setScenarioId(scenarioId);
        resetChangedOnNotNull();
    }
}
