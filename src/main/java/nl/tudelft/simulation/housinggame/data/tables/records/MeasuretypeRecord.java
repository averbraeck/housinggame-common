/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Measuretype;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeasuretypeRecord extends UpdatableRecordImpl<MeasuretypeRecord> implements Record9<UInteger, String, String, UInteger, Integer, Integer, Integer, UByte, UInteger> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.measuretype.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>housinggame.measuretype.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.measuretype.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.measuretype.price</code>.
     */
    public void setPrice(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.price</code>.
     */
    public UInteger getPrice() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>housinggame.measuretype.satisfaction</code>.
     */
    public void setSatisfaction(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.satisfaction</code>.
     */
    public Integer getSatisfaction() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>housinggame.measuretype.pluvial_protection_level</code>.
     */
    public void setPluvialProtectionLevel(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.pluvial_protection_level</code>.
     */
    public Integer getPluvialProtectionLevel() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>housinggame.measuretype.fluvial_protection_level</code>.
     */
    public void setFluvialProtectionLevel(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.fluvial_protection_level</code>.
     */
    public Integer getFluvialProtectionLevel() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>housinggame.measuretype.valid_till_usage</code>.
     */
    public void setValidTillUsage(UByte value) {
        set(7, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.valid_till_usage</code>.
     */
    public UByte getValidTillUsage() {
        return (UByte) get(7);
    }

    /**
     * Setter for <code>housinggame.measuretype.gameversion_id</code>.
     */
    public void setGameversionId(UInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>housinggame.measuretype.gameversion_id</code>.
     */
    public UInteger getGameversionId() {
        return (UInteger) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UInteger, String, String, UInteger, Integer, Integer, Integer, UByte, UInteger> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UInteger, String, String, UInteger, Integer, Integer, Integer, UByte, UInteger> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Measuretype.MEASURETYPE.ID;
    }

    @Override
    public Field<String> field2() {
        return Measuretype.MEASURETYPE.NAME;
    }

    @Override
    public Field<String> field3() {
        return Measuretype.MEASURETYPE.DESCRIPTION;
    }

    @Override
    public Field<UInteger> field4() {
        return Measuretype.MEASURETYPE.PRICE;
    }

    @Override
    public Field<Integer> field5() {
        return Measuretype.MEASURETYPE.SATISFACTION;
    }

    @Override
    public Field<Integer> field6() {
        return Measuretype.MEASURETYPE.PLUVIAL_PROTECTION_LEVEL;
    }

    @Override
    public Field<Integer> field7() {
        return Measuretype.MEASURETYPE.FLUVIAL_PROTECTION_LEVEL;
    }

    @Override
    public Field<UByte> field8() {
        return Measuretype.MEASURETYPE.VALID_TILL_USAGE;
    }

    @Override
    public Field<UInteger> field9() {
        return Measuretype.MEASURETYPE.GAMEVERSION_ID;
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
        return getDescription();
    }

    @Override
    public UInteger component4() {
        return getPrice();
    }

    @Override
    public Integer component5() {
        return getSatisfaction();
    }

    @Override
    public Integer component6() {
        return getPluvialProtectionLevel();
    }

    @Override
    public Integer component7() {
        return getFluvialProtectionLevel();
    }

    @Override
    public UByte component8() {
        return getValidTillUsage();
    }

    @Override
    public UInteger component9() {
        return getGameversionId();
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
        return getDescription();
    }

    @Override
    public UInteger value4() {
        return getPrice();
    }

    @Override
    public Integer value5() {
        return getSatisfaction();
    }

    @Override
    public Integer value6() {
        return getPluvialProtectionLevel();
    }

    @Override
    public Integer value7() {
        return getFluvialProtectionLevel();
    }

    @Override
    public UByte value8() {
        return getValidTillUsage();
    }

    @Override
    public UInteger value9() {
        return getGameversionId();
    }

    @Override
    public MeasuretypeRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value4(UInteger value) {
        setPrice(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value5(Integer value) {
        setSatisfaction(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value6(Integer value) {
        setPluvialProtectionLevel(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value7(Integer value) {
        setFluvialProtectionLevel(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value8(UByte value) {
        setValidTillUsage(value);
        return this;
    }

    @Override
    public MeasuretypeRecord value9(UInteger value) {
        setGameversionId(value);
        return this;
    }

    @Override
    public MeasuretypeRecord values(UInteger value1, String value2, String value3, UInteger value4, Integer value5, Integer value6, Integer value7, UByte value8, UInteger value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
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
    public MeasuretypeRecord(UInteger id, String name, String description, UInteger price, Integer satisfaction, Integer pluvialProtectionLevel, Integer fluvialProtectionLevel, UByte validTillUsage, UInteger gameversionId) {
        super(Measuretype.MEASURETYPE);

        setId(id);
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
