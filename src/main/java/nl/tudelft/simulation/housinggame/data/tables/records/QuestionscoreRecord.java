/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Questionscore;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionscoreRecord extends UpdatableRecordImpl<QuestionscoreRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.questionscore.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.questionscore.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.questionscore.score</code>.
     */
    public void setScore(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.questionscore.score</code>.
     */
    public Integer getScore() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>housinggame.questionscore.playerround_id</code>.
     */
    public void setPlayerroundId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.questionscore.playerround_id</code>.
     */
    public Integer getPlayerroundId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>housinggame.questionscore.question_id</code>.
     */
    public void setQuestionId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.questionscore.question_id</code>.
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
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Questionscore.QUESTIONSCORE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Questionscore.QUESTIONSCORE.SCORE;
    }

    @Override
    public Field<Integer> field3() {
        return Questionscore.QUESTIONSCORE.PLAYERROUND_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Questionscore.QUESTIONSCORE.QUESTION_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getScore();
    }

    @Override
    public Integer component3() {
        return getPlayerroundId();
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
    public Integer value2() {
        return getScore();
    }

    @Override
    public Integer value3() {
        return getPlayerroundId();
    }

    @Override
    public Integer value4() {
        return getQuestionId();
    }

    @Override
    public QuestionscoreRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public QuestionscoreRecord value2(Integer value) {
        setScore(value);
        return this;
    }

    @Override
    public QuestionscoreRecord value3(Integer value) {
        setPlayerroundId(value);
        return this;
    }

    @Override
    public QuestionscoreRecord value4(Integer value) {
        setQuestionId(value);
        return this;
    }

    @Override
    public QuestionscoreRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
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
     * Create a detached QuestionscoreRecord
     */
    public QuestionscoreRecord() {
        super(Questionscore.QUESTIONSCORE);
    }

    /**
     * Create a detached, initialised QuestionscoreRecord
     */
    public QuestionscoreRecord(Integer id, Integer score, Integer playerroundId, Integer questionId) {
        super(Questionscore.QUESTIONSCORE);

        setId(id);
        setScore(score);
        setPlayerroundId(playerroundId);
        setQuestionId(questionId);
        resetChangedOnNotNull();
    }
}
