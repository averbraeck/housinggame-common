/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Housemeasure;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HousemeasureRecord extends UpdatableRecordImpl<HousemeasureRecord> implements Record5<Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.housemeasure.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.housemeasure.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.housemeasure.bought_in_round</code>.
     */
    public void setBoughtInRound(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.housemeasure.bought_in_round</code>.
     */
    public Integer getBoughtInRound() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>housinggame.housemeasure.measuretype_id</code>.
     */
    public void setMeasuretypeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.housemeasure.measuretype_id</code>.
     */
    public Integer getMeasuretypeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>housinggame.housemeasure.housegroup_id</code>.
     */
    public void setHousegroupId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.housemeasure.housegroup_id</code>.
     */
    public Integer getHousegroupId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>housinggame.housemeasure.used_in_round</code>.
     */
    public void setUsedInRound(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.housemeasure.used_in_round</code>.
     */
    public Integer getUsedInRound() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Housemeasure.HOUSEMEASURE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Housemeasure.HOUSEMEASURE.BOUGHT_IN_ROUND;
    }

    @Override
    public Field<Integer> field3() {
        return Housemeasure.HOUSEMEASURE.MEASURETYPE_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Housemeasure.HOUSEMEASURE.HOUSEGROUP_ID;
    }

    @Override
    public Field<Integer> field5() {
        return Housemeasure.HOUSEMEASURE.USED_IN_ROUND;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getBoughtInRound();
    }

    @Override
    public Integer component3() {
        return getMeasuretypeId();
    }

    @Override
    public Integer component4() {
        return getHousegroupId();
    }

    @Override
    public Integer component5() {
        return getUsedInRound();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getBoughtInRound();
    }

    @Override
    public Integer value3() {
        return getMeasuretypeId();
    }

    @Override
    public Integer value4() {
        return getHousegroupId();
    }

    @Override
    public Integer value5() {
        return getUsedInRound();
    }

    @Override
    public HousemeasureRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public HousemeasureRecord value2(Integer value) {
        setBoughtInRound(value);
        return this;
    }

    @Override
    public HousemeasureRecord value3(Integer value) {
        setMeasuretypeId(value);
        return this;
    }

    @Override
    public HousemeasureRecord value4(Integer value) {
        setHousegroupId(value);
        return this;
    }

    @Override
    public HousemeasureRecord value5(Integer value) {
        setUsedInRound(value);
        return this;
    }

    @Override
    public HousemeasureRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HousemeasureRecord
     */
    public HousemeasureRecord() {
        super(Housemeasure.HOUSEMEASURE);
    }

    /**
     * Create a detached, initialised HousemeasureRecord
     */
    public HousemeasureRecord(Integer id, Integer boughtInRound, Integer measuretypeId, Integer housegroupId, Integer usedInRound) {
        super(Housemeasure.HOUSEMEASURE);

        setId(id);
        setBoughtInRound(boughtInRound);
        setMeasuretypeId(measuretypeId);
        setHousegroupId(housegroupId);
        setUsedInRound(usedInRound);
        resetChangedOnNotNull();
    }
}