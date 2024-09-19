/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Measurecategory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeasurecategoryRecord extends UpdatableRecordImpl<MeasurecategoryRecord> implements Record6<Integer, String, String, String, Integer, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.measurecategory.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.measurecategory.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.measurecategory.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.measurecategory.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.measurecategory.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.measurecategory.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.measurecategory.explanation</code>.
     */
    public void setExplanation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.measurecategory.explanation</code>.
     */
    public String getExplanation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>housinggame.measurecategory.scenario_id</code>.
     */
    public void setScenarioId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.measurecategory.scenario_id</code>.
     */
    public Integer getScenarioId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>housinggame.measurecategory.sequence_nr</code>.
     */
    public void setSequenceNr(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.measurecategory.sequence_nr</code>.
     */
    public Double getSequenceNr() {
        return (Double) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Integer, Double> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, Integer, Double> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Measurecategory.MEASURECATEGORY.ID;
    }

    @Override
    public Field<String> field2() {
        return Measurecategory.MEASURECATEGORY.NAME;
    }

    @Override
    public Field<String> field3() {
        return Measurecategory.MEASURECATEGORY.DESCRIPTION;
    }

    @Override
    public Field<String> field4() {
        return Measurecategory.MEASURECATEGORY.EXPLANATION;
    }

    @Override
    public Field<Integer> field5() {
        return Measurecategory.MEASURECATEGORY.SCENARIO_ID;
    }

    @Override
    public Field<Double> field6() {
        return Measurecategory.MEASURECATEGORY.SEQUENCE_NR;
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
    public String component3() {
        return getDescription();
    }

    @Override
    public String component4() {
        return getExplanation();
    }

    @Override
    public Integer component5() {
        return getScenarioId();
    }

    @Override
    public Double component6() {
        return getSequenceNr();
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
    public String value3() {
        return getDescription();
    }

    @Override
    public String value4() {
        return getExplanation();
    }

    @Override
    public Integer value5() {
        return getScenarioId();
    }

    @Override
    public Double value6() {
        return getSequenceNr();
    }

    @Override
    public MeasurecategoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MeasurecategoryRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public MeasurecategoryRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public MeasurecategoryRecord value4(String value) {
        setExplanation(value);
        return this;
    }

    @Override
    public MeasurecategoryRecord value5(Integer value) {
        setScenarioId(value);
        return this;
    }

    @Override
    public MeasurecategoryRecord value6(Double value) {
        setSequenceNr(value);
        return this;
    }

    @Override
    public MeasurecategoryRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Double value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MeasurecategoryRecord
     */
    public MeasurecategoryRecord() {
        super(Measurecategory.MEASURECATEGORY);
    }

    /**
     * Create a detached, initialised MeasurecategoryRecord
     */
    public MeasurecategoryRecord(Integer id, String name, String description, String explanation, Integer scenarioId, Double sequenceNr) {
        super(Measurecategory.MEASURECATEGORY);

        setId(id);
        setName(name);
        setDescription(description);
        setExplanation(explanation);
        setScenarioId(scenarioId);
        setSequenceNr(sequenceNr);
        resetChangedOnNotNull();
    }
}
