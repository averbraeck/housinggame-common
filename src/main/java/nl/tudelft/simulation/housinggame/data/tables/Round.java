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
import nl.tudelft.simulation.housinggame.data.tables.records.RoundRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Round extends TableImpl<RoundRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.round</code>
     */
    public static final Round ROUND = new Round();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoundRecord> getRecordType() {
        return RoundRecord.class;
    }

    /**
     * The column <code>housinggame.round.id</code>.
     */
    public final TableField<RoundRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.round.round_number</code>.
     */
    public final TableField<RoundRecord, Integer> ROUND_NUMBER = createField(DSL.name("round_number"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.round.scenario_id</code>.
     */
    public final TableField<RoundRecord, UInteger> SCENARIO_ID = createField(DSL.name("scenario_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private Round(Name alias, Table<RoundRecord> aliased) {
        this(alias, aliased, null);
    }

    private Round(Name alias, Table<RoundRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.round</code> table reference
     */
    public Round(String alias) {
        this(DSL.name(alias), ROUND);
    }

    /**
     * Create an aliased <code>housinggame.round</code> table reference
     */
    public Round(Name alias) {
        this(alias, ROUND);
    }

    /**
     * Create a <code>housinggame.round</code> table reference
     */
    public Round() {
        this(DSL.name("round"), null);
    }

    public <O extends Record> Round(Table<O> child, ForeignKey<O, RoundRecord> key) {
        super(child, key, ROUND);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ROUND_FK_ROUND_SCENARIO1_IDX);
    }

    @Override
    public Identity<RoundRecord, UInteger> getIdentity() {
        return (Identity<RoundRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<RoundRecord> getPrimaryKey() {
        return Keys.KEY_ROUND_PRIMARY;
    }

    @Override
    public List<UniqueKey<RoundRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_ROUND_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<RoundRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_ROUND_SCENARIO1);
    }

    private transient Scenario _scenario;

    /**
     * Get the implicit join path to the <code>housinggame.scenario</code>
     * table.
     */
    public Scenario scenario() {
        if (_scenario == null)
            _scenario = new Scenario(this, Keys.FK_ROUND_SCENARIO1);

        return _scenario;
    }

    @Override
    public Round as(String alias) {
        return new Round(DSL.name(alias), this);
    }

    @Override
    public Round as(Name alias) {
        return new Round(alias, this);
    }

    @Override
    public Round as(Table<?> alias) {
        return new Round(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Round rename(String name) {
        return new Round(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Round rename(Name name) {
        return new Round(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Round rename(Table<?> name) {
        return new Round(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, Integer, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super UInteger, ? super Integer, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super UInteger, ? super Integer, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
