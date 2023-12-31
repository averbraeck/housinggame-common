/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Questionitem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionitemRecord extends UpdatableRecordImpl<QuestionitemRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.questionitem.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.questionitem.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.questionitem.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.questionitem.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.questionitem.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.questionitem.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.questionitem.question_id</code>.
     */
    public void setQuestionId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.questionitem.question_id</code>.
     */
    public Integer getQuestionId() {
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
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Questionitem.QUESTIONITEM.ID;
    }

    @Override
    public Field<String> field2() {
        return Questionitem.QUESTIONITEM.CODE;
    }

    @Override
    public Field<String> field3() {
        return Questionitem.QUESTIONITEM.NAME;
    }

    @Override
    public Field<Integer> field4() {
        return Questionitem.QUESTIONITEM.QUESTION_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Integer component4() {
        return getQuestionId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Integer value4() {
        return getQuestionId();
    }

    @Override
    public QuestionitemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public QuestionitemRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public QuestionitemRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public QuestionitemRecord value4(Integer value) {
        setQuestionId(value);
        return this;
    }

    @Override
    public QuestionitemRecord values(Integer value1, String value2, String value3, Integer value4) {
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
     * Create a detached QuestionitemRecord
     */
    public QuestionitemRecord() {
        super(Questionitem.QUESTIONITEM);
    }

    /**
     * Create a detached, initialised QuestionitemRecord
     */
    public QuestionitemRecord(Integer id, String code, String name, Integer questionId) {
        super(Questionitem.QUESTIONITEM);

        setId(id);
        setCode(code);
        setName(name);
        setQuestionId(questionId);
        resetChangedOnNotNull();
    }
}
