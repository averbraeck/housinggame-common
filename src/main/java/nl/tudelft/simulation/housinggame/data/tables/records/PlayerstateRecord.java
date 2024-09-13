/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import java.time.LocalDateTime;

import nl.tudelft.simulation.housinggame.data.tables.Playerstate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlayerstateRecord extends UpdatableRecordImpl<PlayerstateRecord> implements Record5<Integer, Integer, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.playerstate.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.playerstate.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.playerstate.playerround_id</code>.
     */
    public void setPlayerroundId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.playerstate.playerround_id</code>.
     */
    public Integer getPlayerroundId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>housinggame.playerstate.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.playerstate.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>housinggame.playerstate.player_state</code>.
     */
    public void setPlayerState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.playerstate.player_state</code>.
     */
    public String getPlayerState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>housinggame.playerstate.content</code>.
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.playerstate.content</code>.
     */
    public String getContent() {
        return (String) get(4);
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
    public Row5<Integer, Integer, LocalDateTime, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, LocalDateTime, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Playerstate.PLAYERSTATE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Playerstate.PLAYERSTATE.PLAYERROUND_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Playerstate.PLAYERSTATE.TIMESTAMP;
    }

    @Override
    public Field<String> field4() {
        return Playerstate.PLAYERSTATE.PLAYER_STATE;
    }

    @Override
    public Field<String> field5() {
        return Playerstate.PLAYERSTATE.CONTENT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPlayerroundId();
    }

    @Override
    public LocalDateTime component3() {
        return getTimestamp();
    }

    @Override
    public String component4() {
        return getPlayerState();
    }

    @Override
    public String component5() {
        return getContent();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPlayerroundId();
    }

    @Override
    public LocalDateTime value3() {
        return getTimestamp();
    }

    @Override
    public String value4() {
        return getPlayerState();
    }

    @Override
    public String value5() {
        return getContent();
    }

    @Override
    public PlayerstateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PlayerstateRecord value2(Integer value) {
        setPlayerroundId(value);
        return this;
    }

    @Override
    public PlayerstateRecord value3(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public PlayerstateRecord value4(String value) {
        setPlayerState(value);
        return this;
    }

    @Override
    public PlayerstateRecord value5(String value) {
        setContent(value);
        return this;
    }

    @Override
    public PlayerstateRecord values(Integer value1, Integer value2, LocalDateTime value3, String value4, String value5) {
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
     * Create a detached PlayerstateRecord
     */
    public PlayerstateRecord() {
        super(Playerstate.PLAYERSTATE);
    }

    /**
     * Create a detached, initialised PlayerstateRecord
     */
    public PlayerstateRecord(Integer id, Integer playerroundId, LocalDateTime timestamp, String playerState, String content) {
        super(Playerstate.PLAYERSTATE);

        setId(id);
        setPlayerroundId(playerroundId);
        setTimestamp(timestamp);
        setPlayerState(playerState);
        setContent(content);
        resetChangedOnNotNull();
    }
}
