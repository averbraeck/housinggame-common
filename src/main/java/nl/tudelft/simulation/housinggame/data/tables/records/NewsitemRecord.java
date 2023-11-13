/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Newsitem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NewsitemRecord extends UpdatableRecordImpl<NewsitemRecord> implements Record5<UInteger, String, String, String, UInteger> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.newsitem.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.newsitem.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
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
     * Setter for <code>housinggame.newsitem.round_id</code>.
     */
    public void setRoundId(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.newsitem.round_id</code>.
     */
    public UInteger getRoundId() {
        return (UInteger) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UInteger, String, String, String, UInteger> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UInteger, String, String, String, UInteger> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
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
    public Field<UInteger> field5() {
        return Newsitem.NEWSITEM.ROUND_ID;
    }

    @Override
    public UInteger component1() {
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
    public UInteger component5() {
        return getRoundId();
    }

    @Override
    public UInteger value1() {
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
    public UInteger value5() {
        return getRoundId();
    }

    @Override
    public NewsitemRecord value1(UInteger value) {
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
    public NewsitemRecord value5(UInteger value) {
        setRoundId(value);
        return this;
    }

    @Override
    public NewsitemRecord values(UInteger value1, String value2, String value3, String value4, UInteger value5) {
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
     * Create a detached NewsitemRecord
     */
    public NewsitemRecord() {
        super(Newsitem.NEWSITEM);
    }

    /**
     * Create a detached, initialised NewsitemRecord
     */
    public NewsitemRecord(UInteger id, String name, String summary, String content, UInteger roundId) {
        super(Newsitem.NEWSITEM);

        setId(id);
        setName(name);
        setSummary(summary);
        setContent(content);
        setRoundId(roundId);
        resetChangedOnNotNull();
    }
}