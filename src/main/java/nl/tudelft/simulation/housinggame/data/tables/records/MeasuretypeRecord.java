/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Measuretype;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeasuretypeRecord extends UpdatableRecordImpl<MeasuretypeRecord> implements Record18<Integer, String, String, String, Integer, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Integer, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.measuretype.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.measuretype.short_alias</code>.
     */
    public void setShortAlias(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.short_alias</code>.
     */
    public String getShortAlias() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.measuretype.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.measuretype.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>housinggame.measuretype.cost_absolute</code>.
     */
    public void setCostAbsolute(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.cost_absolute</code>.
     */
    public Integer getCostAbsolute() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>housinggame.measuretype.cost_percentage_income</code>.
     */
    public void setCostPercentageIncome(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.cost_percentage_income</code>.
     */
    public Double getCostPercentageIncome() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>housinggame.measuretype.cost_percentage_house</code>.
     */
    public void setCostPercentageHouse(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.cost_percentage_house</code>.
     */
    public Double getCostPercentageHouse() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>housinggame.measuretype.satisfaction_delta_once</code>.
     */
    public void setSatisfactionDeltaOnce(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.satisfaction_delta_once</code>.
     */
    public Integer getSatisfactionDeltaOnce() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>housinggame.measuretype.satisfaction_delta_permanent</code>.
     */
    public void setSatisfactionDeltaPermanent(Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>housinggame.measuretype.satisfaction_delta_permanent</code>.
     */
    public Integer getSatisfactionDeltaPermanent() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>housinggame.measuretype.pluvial_protection_delta</code>.
     */
    public void setPluvialProtectionDelta(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.pluvial_protection_delta</code>.
     */
    public Integer getPluvialProtectionDelta() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>housinggame.measuretype.fluvial_protection_delta</code>.
     */
    public void setFluvialProtectionDelta(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.fluvial_protection_delta</code>.
     */
    public Integer getFluvialProtectionDelta() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>housinggame.measuretype.house_value_delta_abs</code>.
     */
    public void setHouseValueDeltaAbs(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.house_value_delta_abs</code>.
     */
    public Integer getHouseValueDeltaAbs() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>housinggame.measuretype.house_value_delta_perc</code>.
     */
    public void setHouseValueDeltaPerc(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.house_value_delta_perc</code>.
     */
    public Integer getHouseValueDeltaPerc() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>housinggame.measuretype.valid_one_round</code>.
     */
    public void setValidOneRound(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.valid_one_round</code>.
     */
    public Byte getValidOneRound() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>housinggame.measuretype.valid_until_used</code>.
     */
    public void setValidUntilUsed(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.valid_until_used</code>.
     */
    public Byte getValidUntilUsed() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>housinggame.measuretype.house_measure</code>.
     */
    public void setHouseMeasure(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.house_measure</code>.
     */
    public Byte getHouseMeasure() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>housinggame.measuretype.measurecategory_id</code>.
     */
    public void setMeasurecategoryId(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.measurecategory_id</code>.
     */
    public Integer getMeasurecategoryId() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>housinggame.measuretype.category_sequence_nr</code>.
     */
    public void setCategorySequenceNr(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.category_sequence_nr</code>.
     */
    public Double getCategorySequenceNr() {
        return (Double) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, String, String, String, Integer, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Integer, Double> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Integer, String, String, String, Integer, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Integer, Double> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Measuretype.MEASURETYPE.ID;
    }

    @Override
    public Field<String> field2() {
        return Measuretype.MEASURETYPE.SHORT_ALIAS;
    }

    @Override
    public Field<String> field3() {
        return Measuretype.MEASURETYPE.NAME;
    }

    @Override
    public Field<String> field4() {
        return Measuretype.MEASURETYPE.DESCRIPTION;
    }

    @Override
    public Field<Integer> field5() {
        return Measuretype.MEASURETYPE.COST_ABSOLUTE;
    }

    @Override
    public Field<Double> field6() {
        return Measuretype.MEASURETYPE.COST_PERCENTAGE_INCOME;
    }

    @Override
    public Field<Double> field7() {
        return Measuretype.MEASURETYPE.COST_PERCENTAGE_HOUSE;
    }

    @Override
    public Field<Integer> field8() {
        return Measuretype.MEASURETYPE.SATISFACTION_DELTA_ONCE;
    }

    @Override
    public Field<Integer> field9() {
        return Measuretype.MEASURETYPE.SATISFACTION_DELTA_PERMANENT;
    }

    @Override
    public Field<Integer> field10() {
        return Measuretype.MEASURETYPE.PLUVIAL_PROTECTION_DELTA;
    }

    @Override
    public Field<Integer> field11() {
        return Measuretype.MEASURETYPE.FLUVIAL_PROTECTION_DELTA;
    }

    @Override
    public Field<Integer> field12() {
        return Measuretype.MEASURETYPE.HOUSE_VALUE_DELTA_ABS;
    }

    @Override
    public Field<Integer> field13() {
        return Measuretype.MEASURETYPE.HOUSE_VALUE_DELTA_PERC;
    }

    @Override
    public Field<Byte> field14() {
        return Measuretype.MEASURETYPE.VALID_ONE_ROUND;
    }

    @Override
    public Field<Byte> field15() {
        return Measuretype.MEASURETYPE.VALID_UNTIL_USED;
    }

    @Override
    public Field<Byte> field16() {
        return Measuretype.MEASURETYPE.HOUSE_MEASURE;
    }

    @Override
    public Field<Integer> field17() {
        return Measuretype.MEASURETYPE.MEASURECATEGORY_ID;
    }

    @Override
    public Field<Double> field18() {
        return Measuretype.MEASURETYPE.CATEGORY_SEQUENCE_NR;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getShortAlias();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Integer component5() {
        return getCostAbsolute();
    }

    @Override
    public Double component6() {
        return getCostPercentageIncome();
    }

    @Override
    public Double component7() {
        return getCostPercentageHouse();
    }

    @Override
    public Integer component8() {
        return getSatisfactionDeltaOnce();
    }

    @Override
    public Integer component9() {
        return getSatisfactionDeltaPermanent();
    }

    @Override
    public Integer component10() {
        return getPluvialProtectionDelta();
    }

    @Override
    public Integer component11() {
        return getFluvialProtectionDelta();
    }

    @Override
    public Integer component12() {
        return getHouseValueDeltaAbs();
    }

    @Override
    public Integer component13() {
        return getHouseValueDeltaPerc();
    }

    @Override
    public Byte component14() {
        return getValidOneRound();
    }

    @Override
    public Byte component15() {
        return getValidUntilUsed();
    }

    @Override
    public Byte component16() {
        return getHouseMeasure();
    }

    @Override
    public Integer component17() {
        return getMeasurecategoryId();
    }

    @Override
    public Double component18() {
        return getCategorySequenceNr();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getShortAlias();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public Integer value5() {
        return getCostAbsolute();
    }

    @Override
    public Double value6() {
        return getCostPercentageIncome();
    }

    @Override
    public Double value7() {
        return getCostPercentageHouse();
    }

    @Override
    public Integer value8() {
        return getSatisfactionDeltaOnce();
    }

    @Override
    public Integer value9() {
        return getSatisfactionDeltaPermanent();
    }

    @Override
    public Integer value10() {
        return getPluvialProtectionDelta();
    }

    @Override
    public Integer value11() {
        return getFluvialProtectionDelta();
    }

    @Override
    public Integer value12() {
        return getHouseValueDeltaAbs();
    }

    @Override
    public Integer value13() {
        return getHouseValueDeltaPerc();
    }

    @Override
    public Byte value14() {
        return getValidOneRound();
    }

    @Override
    public Byte value15() {
        return getValidUntilUsed();
    }

    @Override
    public Byte value16() {
        return getHouseMeasure();
    }

    @Override
    public Integer value17() {
        return getMeasurecategoryId();
    }

    @Override
    public Double value18() {
        return getCategorySequenceNr();
    }

    @Override
    public MeasuretypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value2(String value) {
        setShortAlias(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value5(Integer value) {
        setCostAbsolute(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value6(Double value) {
        setCostPercentageIncome(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value7(Double value) {
        setCostPercentageHouse(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value8(Integer value) {
        setSatisfactionDeltaOnce(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value9(Integer value) {
        setSatisfactionDeltaPermanent(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value10(Integer value) {
        setPluvialProtectionDelta(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value11(Integer value) {
        setFluvialProtectionDelta(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value12(Integer value) {
        setHouseValueDeltaAbs(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value13(Integer value) {
        setHouseValueDeltaPerc(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value14(Byte value) {
        setValidOneRound(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value15(Byte value) {
        setValidUntilUsed(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value16(Byte value) {
        setHouseMeasure(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value17(Integer value) {
        setMeasurecategoryId(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value18(Double value) {
        setCategorySequenceNr(value);
        return this;
    }

    @Override
    public MeasuretypeRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Double value6, Double value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Byte value14, Byte value15, Byte value16, Integer value17, Double value18) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MeasuretypeRecord
     */
    public MeasuretypeRecord() {
        super(Measuretype.MEASURETYPE);
    }

    /**
     * Create a detached, initialised MeasuretypeRecord
     */
    public MeasuretypeRecord(Integer id, String shortAlias, String name, String description, Integer costAbsolute, Double costPercentageIncome, Double costPercentageHouse, Integer satisfactionDeltaOnce, Integer satisfactionDeltaPermanent, Integer pluvialProtectionDelta, Integer fluvialProtectionDelta, Integer houseValueDeltaAbs, Integer houseValueDeltaPerc, Byte validOneRound, Byte validUntilUsed, Byte houseMeasure, Integer measurecategoryId, Double categorySequenceNr) {
        super(Measuretype.MEASURETYPE);

        setId(id);
        setShortAlias(shortAlias);
        setName(name);
        setDescription(description);
        setCostAbsolute(costAbsolute);
        setCostPercentageIncome(costPercentageIncome);
        setCostPercentageHouse(costPercentageHouse);
        setSatisfactionDeltaOnce(satisfactionDeltaOnce);
        setSatisfactionDeltaPermanent(satisfactionDeltaPermanent);
        setPluvialProtectionDelta(pluvialProtectionDelta);
        setFluvialProtectionDelta(fluvialProtectionDelta);
        setHouseValueDeltaAbs(houseValueDeltaAbs);
        setHouseValueDeltaPerc(houseValueDeltaPerc);
        setValidOneRound(validOneRound);
        setValidUntilUsed(validUntilUsed);
        setHouseMeasure(houseMeasure);
        setMeasurecategoryId(measurecategoryId);
        setCategorySequenceNr(categorySequenceNr);
        resetChangedOnNotNull();
    }
}
