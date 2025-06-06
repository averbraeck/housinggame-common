/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import nl.tudelft.simulation.housinggame.data.tables.Newsitem;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NewsitemRecord extends UpdatableRecordImpl<NewsitemRecord> implements Record6<Integer, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.newsitem.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.newsitem.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.newsitem.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.newsitem.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.newsitem.summary</code>.
     */
    public void setSummary(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.newsitem.summary</code>.
     */
    public String getSummary() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.newsitem.content</code>.
     */
    public void setContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.newsitem.content</code>.
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>housinggame.newsitem.round_number</code>.
     */
    public void setRoundNumber(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.newsitem.round_number</code>.
     */
    public Integer getRoundNumber() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>housinggame.newsitem.scenario_id</code>.
     */
    public void setScenarioId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.newsitem.scenario_id</code>.
     */
    public Integer getScenarioId() {
        return (Integer) get(5);
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
    public Row6<Integer, String, String, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Newsitem.NEWSITEM.ID;
    }

    @Override
    public Field<String> field2() {
        return Newsitem.NEWSITEM.NAME;
    }

    @Override
    public Field<String> field3() {
        return Newsitem.NEWSITEM.SUMMARY;
    }

    @Override
    public Field<String> field4() {
        return Newsitem.NEWSITEM.CONTENT;
    }

    @Override
    public Field<Integer> field5() {
        return Newsitem.NEWSITEM.ROUND_NUMBER;
    }

    @Override
    public Field<Integer> field6() {
        return Newsitem.NEWSITEM.SCENARIO_ID;
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
        return getSummary();
    }

    @Override
    public String component4() {
        return getContent();
    }

    @Override
    public Integer component5() {
        return getRoundNumber();
    }

    @Override
    public Integer component6() {
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
    public String value3() {
        return getSummary();
    }

    @Override
    public String value4() {
        return getContent();
    }

    @Override
    public Integer value5() {
        return getRoundNumber();
    }

    @Override
    public Integer value6() {
        return getScenarioId();
    }

    @Override
    public NewsitemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public NewsitemRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public NewsitemRecord value3(String value) {
        setSummary(value);
        return this;
    }

    @Override
    public NewsitemRecord value4(String value) {
        setContent(value);
        return this;
    }

    @Override
    public NewsitemRecord value5(Integer value) {
        setRoundNumber(value);
        return this;
    }

    @Override
    public NewsitemRecord value6(Integer value) {
        setScenarioId(value);
        return this;
    }

    @Override
    public NewsitemRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6) {
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
     * Create a detached NewsitemRecord
     */
    public NewsitemRecord() {
        super(Newsitem.NEWSITEM);
    }

    /**
     * Create a detached, initialised NewsitemRecord
     */
    public NewsitemRecord(Integer id, String name, String summary, String content, Integer roundNumber, Integer scenarioId) {
        super(Newsitem.NEWSITEM);

        setId(id);
        setName(name);
        setSummary(summary);
        setContent(content);
        setRoundNumber(roundNumber);
        setScenarioId(scenarioId);
        resetChangedOnNotNull();
    }
}
