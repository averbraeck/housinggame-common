/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Measure;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeasureRecord extends UpdatableRecordImpl<MeasureRecord> implements Record5<Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.measure.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.measure.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.measure.round_number</code>.
     */
    public void setRoundNumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.measure.round_number</code>.
     */
    public Integer getRoundNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>housinggame.measure.consumed_in_round</code>.
     */
    public void setConsumedInRound(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.measure.consumed_in_round</code>.
     */
    public Integer getConsumedInRound() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>housinggame.measure.measuretype_id</code>.
     */
    public void setMeasuretypeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.measure.measuretype_id</code>.
     */
    public Integer getMeasuretypeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>housinggame.measure.housegroup_id</code>.
     */
    public void setHousegroupId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.measure.housegroup_id</code>.
     */
    public Integer getHousegroupId() {
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
        return Measure.MEASURE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Measure.MEASURE.ROUND_NUMBER;
    }

    @Override
    public Field<Integer> field3() {
        return Measure.MEASURE.CONSUMED_IN_ROUND;
    }

    @Override
    public Field<Integer> field4() {
        return Measure.MEASURE.MEASURETYPE_ID;
    }

    @Override
    public Field<Integer> field5() {
        return Measure.MEASURE.HOUSEGROUP_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getRoundNumber();
    }

    @Override
    public Integer component3() {
        return getConsumedInRound();
    }

    @Override
    public Integer component4() {
        return getMeasuretypeId();
    }

    @Override
    public Integer component5() {
        return getHousegroupId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getRoundNumber();
    }

    @Override
    public Integer value3() {
        return getConsumedInRound();
    }

    @Override
    public Integer value4() {
        return getMeasuretypeId();
    }

    @Override
    public Integer value5() {
        return getHousegroupId();
    }

    @Override
    public MeasureRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MeasureRecord value2(Integer value) {
        setRoundNumber(value);
        return this;
    }

    @Override
    public MeasureRecord value3(Integer value) {
        setConsumedInRound(value);
        return this;
    }

    @Override
    public MeasureRecord value4(Integer value) {
        setMeasuretypeId(value);
        return this;
    }

    @Override
    public MeasureRecord value5(Integer value) {
        setHousegroupId(value);
        return this;
    }

    @Override
    public MeasureRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5) {
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
     * Create a detached MeasureRecord
     */
    public MeasureRecord() {
        super(Measure.MEASURE);
    }

    /**
     * Create a detached, initialised MeasureRecord
     */
    public MeasureRecord(Integer id, Integer roundNumber, Integer consumedInRound, Integer measuretypeId, Integer housegroupId) {
        super(Measure.MEASURE);

        setId(id);
        setRoundNumber(roundNumber);
        setConsumedInRound(consumedInRound);
        setMeasuretypeId(measuretypeId);
        setHousegroupId(housegroupId);
        resetChangedOnNotNull();
    }
}
