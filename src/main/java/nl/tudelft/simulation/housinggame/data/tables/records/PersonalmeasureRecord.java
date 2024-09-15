/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Personalmeasure;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonalmeasureRecord extends UpdatableRecordImpl<PersonalmeasureRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.personalmeasure.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.personalmeasure.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.personalmeasure.round_number</code>.
     */
    public void setRoundNumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.personalmeasure.round_number</code>.
     */
    public Integer getRoundNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>housinggame.personalmeasure.measuretype_id</code>.
     */
    public void setMeasuretypeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.personalmeasure.measuretype_id</code>.
     */
    public Integer getMeasuretypeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>housinggame.personalmeasure.playerround_id</code>.
     */
    public void setPlayerroundId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.personalmeasure.playerround_id</code>.
     */
    public Integer getPlayerroundId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Personalmeasure.PERSONALMEASURE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Personalmeasure.PERSONALMEASURE.ROUND_NUMBER;
    }

    @Override
    public Field<Integer> field3() {
        return Personalmeasure.PERSONALMEASURE.MEASURETYPE_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Personalmeasure.PERSONALMEASURE.PLAYERROUND_ID;
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
        return getMeasuretypeId();
    }

    @Override
    public Integer component4() {
        return getPlayerroundId();
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
        return getMeasuretypeId();
    }

    @Override
    public Integer value4() {
        return getPlayerroundId();
    }

    @Override
    public PersonalmeasureRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PersonalmeasureRecord value2(Integer value) {
        setRoundNumber(value);
        return this;
    }

    @Override
    public PersonalmeasureRecord value3(Integer value) {
        setMeasuretypeId(value);
        return this;
    }

    @Override
    public PersonalmeasureRecord value4(Integer value) {
        setPlayerroundId(value);
        return this;
    }

    @Override
    public PersonalmeasureRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersonalmeasureRecord
     */
    public PersonalmeasureRecord() {
        super(Personalmeasure.PERSONALMEASURE);
    }

    /**
     * Create a detached, initialised PersonalmeasureRecord
     */
    public PersonalmeasureRecord(Integer id, Integer roundNumber, Integer measuretypeId, Integer playerroundId) {
        super(Personalmeasure.PERSONALMEASURE);

        setId(id);
        setRoundNumber(roundNumber);
        setMeasuretypeId(measuretypeId);
        setPlayerroundId(playerroundId);
        resetChangedOnNotNull();
    }
}
