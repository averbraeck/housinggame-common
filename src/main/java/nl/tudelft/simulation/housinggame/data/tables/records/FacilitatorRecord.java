/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Facilitator;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FacilitatorRecord extends UpdatableRecordImpl<FacilitatorRecord> implements Record3<UInteger, String, UInteger> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.facilitator.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.facilitator.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>housinggame.facilitator.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.facilitator.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.facilitator.user_id</code>.
     */
    public void setUserId(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.facilitator.user_id</code>.
     */
    public UInteger getUserId() {
        return (UInteger) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<UInteger, String, UInteger> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Facilitator.FACILITATOR.ID;
    }

    @Override
    public Field<String> field2() {
        return Facilitator.FACILITATOR.NAME;
    }

    @Override
    public Field<UInteger> field3() {
        return Facilitator.FACILITATOR.USER_ID;
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
    public UInteger component3() {
        return getUserId();
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
    public UInteger value3() {
        return getUserId();
    }

    @Override
    public FacilitatorRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public FacilitatorRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FacilitatorRecord value3(UInteger value) {
        setUserId(value);
        return this;
    }

    @Override
    public FacilitatorRecord values(UInteger value1, String value2, UInteger value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FacilitatorRecord
     */
    public FacilitatorRecord() {
        super(Facilitator.FACILITATOR);
    }

    /**
     * Create a detached, initialised FacilitatorRecord
     */
    public FacilitatorRecord(UInteger id, String name, UInteger userId) {
        super(Facilitator.FACILITATOR);

        setId(id);
        setName(name);
        setUserId(userId);
        resetChangedOnNotNull();
    }
}
