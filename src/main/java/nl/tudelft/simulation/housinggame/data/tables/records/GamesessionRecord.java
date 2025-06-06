/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import nl.tudelft.simulation.housinggame.data.tables.Gamesession;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GamesessionRecord extends UpdatableRecordImpl<GamesessionRecord> implements Record10<Integer, String, String, String, LocalDateTime, LocalDate, LocalDateTime, LocalDateTime, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.gamesession.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.gamesession.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.gamesession.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.gamesession.location</code>.
     */
    public void setLocation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.location</code>.
     */
    public String getLocation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>housinggame.gamesession.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>housinggame.gamesession.date</code>.
     */
    public void setDate(LocalDate value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>housinggame.gamesession.start_time</code>.
     */
    public void setStartTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.start_time</code>.
     */
    public LocalDateTime getStartTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>housinggame.gamesession.end_time</code>.
     */
    public void setEndTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.end_time</code>.
     */
    public LocalDateTime getEndTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>housinggame.gamesession.gameversion_id</code>.
     */
    public void setGameversionId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.gameversion_id</code>.
     */
    public Integer getGameversionId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>housinggame.gamesession.description</code>.
     */
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>housinggame.gamesession.description</code>.
     */
    public String getDescription() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, LocalDateTime, LocalDate, LocalDateTime, LocalDateTime, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, String, String, LocalDateTime, LocalDate, LocalDateTime, LocalDateTime, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Gamesession.GAMESESSION.ID;
    }

    @Override
    public Field<String> field2() {
        return Gamesession.GAMESESSION.NAME;
    }

    @Override
    public Field<String> field3() {
        return Gamesession.GAMESESSION.PASSWORD;
    }

    @Override
    public Field<String> field4() {
        return Gamesession.GAMESESSION.LOCATION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Gamesession.GAMESESSION.CREATE_TIME;
    }

    @Override
    public Field<LocalDate> field6() {
        return Gamesession.GAMESESSION.DATE;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Gamesession.GAMESESSION.START_TIME;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Gamesession.GAMESESSION.END_TIME;
    }

    @Override
    public Field<Integer> field9() {
        return Gamesession.GAMESESSION.GAMEVERSION_ID;
    }

    @Override
    public Field<String> field10() {
        return Gamesession.GAMESESSION.DESCRIPTION;
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
        return getPassword();
    }

    @Override
    public String component4() {
        return getLocation();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public LocalDate component6() {
        return getDate();
    }

    @Override
    public LocalDateTime component7() {
        return getStartTime();
    }

    @Override
    public LocalDateTime component8() {
        return getEndTime();
    }

    @Override
    public Integer component9() {
        return getGameversionId();
    }

    @Override
    public String component10() {
        return getDescription();
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
        return getPassword();
    }

    @Override
    public String value4() {
        return getLocation();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public LocalDate value6() {
        return getDate();
    }

    @Override
    public LocalDateTime value7() {
        return getStartTime();
    }

    @Override
    public LocalDateTime value8() {
        return getEndTime();
    }

    @Override
    public Integer value9() {
        return getGameversionId();
    }

    @Override
    public String value10() {
        return getDescription();
    }

    @Override
    public GamesessionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GamesessionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GamesessionRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public GamesessionRecord value4(String value) {
        setLocation(value);
        return this;
    }

    @Override
    public GamesessionRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public GamesessionRecord value6(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public GamesessionRecord value7(LocalDateTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public GamesessionRecord value8(LocalDateTime value) {
        setEndTime(value);
        return this;
    }

    @Override
    public GamesessionRecord value9(Integer value) {
        setGameversionId(value);
        return this;
    }

    @Override
    public GamesessionRecord value10(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public GamesessionRecord values(Integer value1, String value2, String value3, String value4, LocalDateTime value5, LocalDate value6, LocalDateTime value7, LocalDateTime value8, Integer value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GamesessionRecord
     */
    public GamesessionRecord() {
        super(Gamesession.GAMESESSION);
    }

    /**
     * Create a detached, initialised GamesessionRecord
     */
    public GamesessionRecord(Integer id, String name, String password, String location, LocalDateTime createTime, LocalDate date, LocalDateTime startTime, LocalDateTime endTime, Integer gameversionId, String description) {
        super(Gamesession.GAMESESSION);

        setId(id);
        setName(name);
        setPassword(password);
        setLocation(location);
        setCreateTime(createTime);
        setDate(date);
        setStartTime(startTime);
        setEndTime(endTime);
        setGameversionId(gameversionId);
        setDescription(description);
        resetChangedOnNotNull();
    }
}
