/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import nl.tudelft.simulation.housinggame.data.tables.User;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record6<Integer, String, String, String, LocalDateTime, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.user.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.user.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.user.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.user.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.user.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.user.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>housinggame.user.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.user.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>housinggame.user.administrator</code>.
     */
    public void setAdministrator(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.user.administrator</code>.
     */
    public Byte getAdministrator() {
        return (Byte) get(5);
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
    public Row6<Integer, String, String, String, LocalDateTime, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, LocalDateTime, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return User.USER.EMAIL;
    }

    @Override
    public Field<String> field4() {
        return User.USER.PASSWORD;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return User.USER.CREATE_TIME;
    }

    @Override
    public Field<Byte> field6() {
        return User.USER.ADMINISTRATOR;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getEmail();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public Byte component6() {
        return getAdministrator();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getEmail();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public Byte value6() {
        return getAdministrator();
    }

    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UserRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public UserRecord value6(Byte value) {
        setAdministrator(value);
        return this;
    }

    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, LocalDateTime value5, Byte value6) {
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
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String username, String email, String password, LocalDateTime createTime, Byte administrator) {
        super(User.USER);

        setId(id);
        setUsername(username);
        setEmail(email);
        setPassword(password);
        setCreateTime(createTime);
        setAdministrator(administrator);
        resetChangedOnNotNull();
    }
}
