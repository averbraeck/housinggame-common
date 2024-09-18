/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.tudelft.simulation.housinggame.data.Housinggame;
import nl.tudelft.simulation.housinggame.data.Indexes;
import nl.tudelft.simulation.housinggame.data.Keys;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasuretypeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function19;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Measuretype extends TableImpl<MeasuretypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.measuretype</code>
     */
    public static final Measuretype MEASURETYPE = new Measuretype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeasuretypeRecord> getRecordType() {
        return MeasuretypeRecord.class;
    }

    /**
     * The column <code>housinggame.measuretype.id</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.measuretype.short_alias</code>.
     */
    public final TableField<MeasuretypeRecord, String> SHORT_ALIAS = createField(DSL.name("short_alias"), SQLDataType.VARCHAR(24).nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.name</code>.
     */
    public final TableField<MeasuretypeRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.description</code>.
     */
    public final TableField<MeasuretypeRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.cost_absolute</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> COST_ABSOLUTE = createField(DSL.name("cost_absolute"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.cost_percentage_income</code>.
     */
    public final TableField<MeasuretypeRecord, Double> COST_PERCENTAGE_INCOME = createField(DSL.name("cost_percentage_income"), SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.cost_percentage_house</code>.
     */
    public final TableField<MeasuretypeRecord, Double> COST_PERCENTAGE_HOUSE = createField(DSL.name("cost_percentage_house"), SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.satisfaction_delta_once</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> SATISFACTION_DELTA_ONCE = createField(DSL.name("satisfaction_delta_once"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>housinggame.measuretype.satisfaction_delta_permanent</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> SATISFACTION_DELTA_PERMANENT = createField(DSL.name("satisfaction_delta_permanent"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.pluvial_protection_delta</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> PLUVIAL_PROTECTION_DELTA = createField(DSL.name("pluvial_protection_delta"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.fluvial_protection_delta</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> FLUVIAL_PROTECTION_DELTA = createField(DSL.name("fluvial_protection_delta"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.house_value_delta_abs</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> HOUSE_VALUE_DELTA_ABS = createField(DSL.name("house_value_delta_abs"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.house_value_delta_perc</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> HOUSE_VALUE_DELTA_PERC = createField(DSL.name("house_value_delta_perc"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.valid_one_round</code>.
     */
    public final TableField<MeasuretypeRecord, Byte> VALID_ONE_ROUND = createField(DSL.name("valid_one_round"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>housinggame.measuretype.valid_until_used</code>.
     */
    public final TableField<MeasuretypeRecord, Byte> VALID_UNTIL_USED = createField(DSL.name("valid_until_used"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>housinggame.measuretype.house_measure</code>.
     */
    public final TableField<MeasuretypeRecord, Byte> HOUSE_MEASURE = createField(DSL.name("house_measure"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("1"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>housinggame.measuretype.measurecategory_id</code>.
     */
    public final TableField<MeasuretypeRecord, Integer> MEASURECATEGORY_ID = createField(DSL.name("measurecategory_id"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.measuretype.category_sequence_nr</code>.
     */
    public final TableField<MeasuretypeRecord, Double> CATEGORY_SEQUENCE_NR = createField(DSL.name("category_sequence_nr"), SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>housinggame.measuretype.priority</code>.
     */
    public final TableField<MeasuretypeRecord, Double> PRIORITY = createField(DSL.name("priority"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.field(DSL.raw("1"), SQLDataType.FLOAT)), this, "");

    private Measuretype(Name alias, Table<MeasuretypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Measuretype(Name alias, Table<MeasuretypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.measuretype</code> table reference
     */
    public Measuretype(String alias) {
        this(DSL.name(alias), MEASURETYPE);
    }

    /**
     * Create an aliased <code>housinggame.measuretype</code> table reference
     */
    public Measuretype(Name alias) {
        this(alias, MEASURETYPE);
    }

    /**
     * Create a <code>housinggame.measuretype</code> table reference
     */
    public Measuretype() {
        this(DSL.name("measuretype"), null);
    }

    public <O extends Record> Measuretype(Table<O> child, ForeignKey<O, MeasuretypeRecord> key) {
        super(child, key, MEASURETYPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.MEASURETYPE_FK_MEASURETYPE_MEASURECATEGORY1_IDX);
    }

    @Override
    public Identity<MeasuretypeRecord, Integer> getIdentity() {
        return (Identity<MeasuretypeRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MeasuretypeRecord> getPrimaryKey() {
        return Keys.KEY_MEASURETYPE_PRIMARY;
    }

    @Override
    public List<UniqueKey<MeasuretypeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_MEASURETYPE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<MeasuretypeRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_MEASURETYPE_MEASURECATEGORY1);
    }

    private transient Measurecategory _measurecategory;

    /**
     * Get the implicit join path to the
     * <code>housinggame.measurecategory</code> table.
     */
    public Measurecategory measurecategory() {
        if (_measurecategory == null)
            _measurecategory = new Measurecategory(this, Keys.FK_MEASURETYPE_MEASURECATEGORY1);

        return _measurecategory;
    }

    @Override
    public Measuretype as(String alias) {
        return new Measuretype(DSL.name(alias), this);
    }

    @Override
    public Measuretype as(Name alias) {
        return new Measuretype(alias, this);
    }

    @Override
    public Measuretype as(Table<?> alias) {
        return new Measuretype(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Measuretype rename(String name) {
        return new Measuretype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Measuretype rename(Name name) {
        return new Measuretype(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Measuretype rename(Table<?> name) {
        return new Measuretype(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, String, String, String, Integer, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Integer, Double, Double> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function19<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? super Double, ? super Double, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Byte, ? super Byte, ? super Byte, ? super Integer, ? super Double, ? super Double, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function19<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? super Double, ? super Double, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Byte, ? super Byte, ? super Byte, ? super Integer, ? super Double, ? super Double, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
