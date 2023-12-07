/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Measuretype;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeasuretypeRecord extends UpdatableRecordImpl<MeasuretypeRecord> implements Record10<Integer, String, String, String, Integer, Integer, Integer, Integer, Byte, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.measuretype.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.measuretype.short_alias</code>.
     */
    public void setShortAlias(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.short_alias</code>.
     */
    public String getShortAlias() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.measuretype.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.measuretype.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>housinggame.measuretype.price</code>.
     */
    public void setPrice(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.price</code>.
     */
    public Integer getPrice() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>housinggame.measuretype.satisfaction</code>.
     */
    public void setSatisfaction(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.satisfaction</code>.
     */
    public Integer getSatisfaction() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>housinggame.measuretype.pluvial_protection_level</code>.
     */
    public void setPluvialProtectionLevel(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.pluvial_protection_level</code>.
     */
    public Integer getPluvialProtectionLevel() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>housinggame.measuretype.fluvial_protection_level</code>.
     */
    public void setFluvialProtectionLevel(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.fluvial_protection_level</code>.
     */
    public Integer getFluvialProtectionLevel() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>housinggame.measuretype.valid_till_usage</code>.
     */
    public void setValidTillUsage(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.valid_till_usage</code>.
     */
    public Byte getValidTillUsage() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>housinggame.measuretype.gameversion_id</code>.
     */
    public void setGameversionId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.gameversion_id</code>.
     */
    public Integer getGameversionId() {
        return (Integer) get(9);
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
    public Row10<Integer, String, String, String, Integer, Integer, Integer, Integer, Byte, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, String, String, Integer, Integer, Integer, Integer, Byte, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Measuretype.MEASURETYPE.ID;
    }

    @Override
    public Field<String> field2() {
        return Measuretype.MEASURETYPE.SHORT_ALIAS;
    }

    @Override
    public Field<String> field3() {
        return Measuretype.MEASURETYPE.NAME;
    }

    @Override
    public Field<String> field4() {
        return Measuretype.MEASURETYPE.DESCRIPTION;
    }

    @Override
    public Field<Integer> field5() {
        return Measuretype.MEASURETYPE.PRICE;
    }

    @Override
    public Field<Integer> field6() {
        return Measuretype.MEASURETYPE.SATISFACTION;
    }

    @Override
    public Field<Integer> field7() {
        return Measuretype.MEASURETYPE.PLUVIAL_PROTECTION_LEVEL;
    }

    @Override
    public Field<Integer> field8() {
        return Measuretype.MEASURETYPE.FLUVIAL_PROTECTION_LEVEL;
    }

    @Override
    public Field<Byte> field9() {
        return Measuretype.MEASURETYPE.VALID_TILL_USAGE;
    }

    @Override
    public Field<Integer> field10() {
        return Measuretype.MEASURETYPE.GAMEVERSION_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getShortAlias();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Integer component5() {
        return getPrice();
    }

    @Override
    public Integer component6() {
        return getSatisfaction();
    }

    @Override
    public Integer component7() {
        return getPluvialProtectionLevel();
    }

    @Override
    public Integer component8() {
        return getFluvialProtectionLevel();
    }

    @Override
    public Byte component9() {
        return getValidTillUsage();
    }

    @Override
    public Integer component10() {
        return getGameversionId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getShortAlias();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public Integer value5() {
        return getPrice();
    }

    @Override
    public Integer value6() {
        return getSatisfaction();
    }

    @Override
    public Integer value7() {
        return getPluvialProtectionLevel();
    }

    @Override
    public Integer value8() {
        return getFluvialProtectionLevel();
    }

    @Override
    public Byte value9() {
        return getValidTillUsage();
    }

    @Override
    public Integer value10() {
        return getGameversionId();
    }

    @Override
    public MeasuretypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value2(String value) {
        setShortAlias(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value5(Integer value) {
        setPrice(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value6(Integer value) {
        setSatisfaction(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value7(Integer value) {
        setPluvialProtectionLevel(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value8(Integer value) {
        setFluvialProtectionLevel(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value9(Byte value) {
        setValidTillUsage(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value10(Integer value) {
        setGameversionId(value);
        return this;
    }

    @Override
    public MeasuretypeRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6, Integer value7, Integer value8, Byte value9, Integer value10) {
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
     * Create a detached MeasuretypeRecord
     */
    public MeasuretypeRecord() {
        super(Measuretype.MEASURETYPE);
    }

    /**
     * Create a detached, initialised MeasuretypeRecord
     */
    public MeasuretypeRecord(Integer id, String shortAlias, String name, String description, Integer price, Integer satisfaction, Integer pluvialProtectionLevel, Integer fluvialProtectionLevel, Byte validTillUsage, Integer gameversionId) {
        super(Measuretype.MEASURETYPE);

        setId(id);
        setShortAlias(shortAlias);
        setName(name);
        setDescription(description);
        setPrice(price);
        setSatisfaction(satisfaction);
        setPluvialProtectionLevel(pluvialProtectionLevel);
        setFluvialProtectionLevel(fluvialProtectionLevel);
        setValidTillUsage(validTillUsage);
        setGameversionId(gameversionId);
        resetChangedOnNotNull();
    }
}
