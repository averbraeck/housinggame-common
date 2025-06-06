/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import nl.tudelft.simulation.housinggame.data.Housinggame;
import nl.tudelft.simulation.housinggame.data.Indexes;
import nl.tudelft.simulation.housinggame.data.Keys;
import nl.tudelft.simulation.housinggame.data.tables.records.WelfaretypeRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Welfaretype extends TableImpl<WelfaretypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.welfaretype</code>
     */
    public static final Welfaretype WELFARETYPE = new Welfaretype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WelfaretypeRecord> getRecordType() {
        return WelfaretypeRecord.class;
    }

    /**
     * The column <code>housinggame.welfaretype.id</code>.
     */
    public final TableField<WelfaretypeRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.welfaretype.name</code>.
     */
    public final TableField<WelfaretypeRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>housinggame.welfaretype.initial_satisfaction</code>.
     */
    public final TableField<WelfaretypeRecord, Integer> INITIAL_SATISFACTION = createField(DSL.name("initial_satisfaction"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.welfaretype.initial_money</code>.
     */
    public final TableField<WelfaretypeRecord, Integer> INITIAL_MONEY = createField(DSL.name("initial_money"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.welfaretype.maximum_mortgage</code>.
     */
    public final TableField<WelfaretypeRecord, Integer> MAXIMUM_MORTGAGE = createField(DSL.name("maximum_mortgage"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.welfaretype.living_costs</code>.
     */
    public final TableField<WelfaretypeRecord, Integer> LIVING_COSTS = createField(DSL.name("living_costs"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.welfaretype.round_income</code>.
     */
    public final TableField<WelfaretypeRecord, Integer> ROUND_INCOME = createField(DSL.name("round_income"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.welfaretype.preferred_house_rating</code>.
     */
    public final TableField<WelfaretypeRecord, Integer> PREFERRED_HOUSE_RATING = createField(DSL.name("preferred_house_rating"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.welfaretype.scenario_id</code>.
     */
    public final TableField<WelfaretypeRecord, Integer> SCENARIO_ID = createField(DSL.name("scenario_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Welfaretype(Name alias, Table<WelfaretypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Welfaretype(Name alias, Table<WelfaretypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.welfaretype</code> table reference
     */
    public Welfaretype(String alias) {
        this(DSL.name(alias), WELFARETYPE);
    }

    /**
     * Create an aliased <code>housinggame.welfaretype</code> table reference
     */
    public Welfaretype(Name alias) {
        this(alias, WELFARETYPE);
    }

    /**
     * Create a <code>housinggame.welfaretype</code> table reference
     */
    public Welfaretype() {
        this(DSL.name("welfaretype"), null);
    }

    public <O extends Record> Welfaretype(Table<O> child, ForeignKey<O, WelfaretypeRecord> key) {
        super(child, key, WELFARETYPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.WELFARETYPE_FK_WELFARETYPE_SCENARIO1_IDX);
    }

    @Override
    public Identity<WelfaretypeRecord, Integer> getIdentity() {
        return (Identity<WelfaretypeRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<WelfaretypeRecord> getPrimaryKey() {
        return Keys.KEY_WELFARETYPE_PRIMARY;
    }

    @Override
    public List<UniqueKey<WelfaretypeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_WELFARETYPE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<WelfaretypeRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_WELFARETYPE_SCENARIO1);
    }

    private transient Scenario _scenario;

    /**
     * Get the implicit join path to the <code>housinggame.scenario</code>
     * table.
     */
    public Scenario scenario() {
        if (_scenario == null)
            _scenario = new Scenario(this, Keys.FK_WELFARETYPE_SCENARIO1);

        return _scenario;
    }

    @Override
    public Welfaretype as(String alias) {
        return new Welfaretype(DSL.name(alias), this);
    }

    @Override
    public Welfaretype as(Name alias) {
        return new Welfaretype(alias, this);
    }

    @Override
    public Welfaretype as(Table<?> alias) {
        return new Welfaretype(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Welfaretype rename(String name) {
        return new Welfaretype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Welfaretype rename(Name name) {
        return new Welfaretype(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Welfaretype rename(Table<?> name) {
        return new Welfaretype(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Integer, ? super String, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Integer, ? super String, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
