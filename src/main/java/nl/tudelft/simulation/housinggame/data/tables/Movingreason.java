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
import nl.tudelft.simulation.housinggame.data.tables.records.MovingreasonRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class Movingreason extends TableImpl<MovingreasonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.movingreason</code>
     */
    public static final Movingreason MOVINGREASON = new Movingreason();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovingreasonRecord> getRecordType() {
        return MovingreasonRecord.class;
    }

    /**
     * The column <code>housinggame.movingreason.id</code>.
     */
    public final TableField<MovingreasonRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.movingreason.sequence_number</code>.
     */
    public final TableField<MovingreasonRecord, Integer> SEQUENCE_NUMBER = createField(DSL.name("sequence_number"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.movingreason.reason_text</code>.
     */
    public final TableField<MovingreasonRecord, String> REASON_TEXT = createField(DSL.name("reason_text"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>housinggame.movingreason.is_other</code>.
     */
    public final TableField<MovingreasonRecord, Byte> IS_OTHER = createField(DSL.name("is_other"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>housinggame.movingreason.gameversion_id</code>.
     */
    public final TableField<MovingreasonRecord, Integer> GAMEVERSION_ID = createField(DSL.name("gameversion_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Movingreason(Name alias, Table<MovingreasonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Movingreason(Name alias, Table<MovingreasonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.movingreason</code> table reference
     */
    public Movingreason(String alias) {
        this(DSL.name(alias), MOVINGREASON);
    }

    /**
     * Create an aliased <code>housinggame.movingreason</code> table reference
     */
    public Movingreason(Name alias) {
        this(alias, MOVINGREASON);
    }

    /**
     * Create a <code>housinggame.movingreason</code> table reference
     */
    public Movingreason() {
        this(DSL.name("movingreason"), null);
    }

    public <O extends Record> Movingreason(Table<O> child, ForeignKey<O, MovingreasonRecord> key) {
        super(child, key, MOVINGREASON);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.MOVINGREASON_FK_MOVINGREASON_GAMEVERSION1_IDX);
    }

    @Override
    public Identity<MovingreasonRecord, Integer> getIdentity() {
        return (Identity<MovingreasonRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MovingreasonRecord> getPrimaryKey() {
        return Keys.KEY_MOVINGREASON_PRIMARY;
    }

    @Override
    public List<UniqueKey<MovingreasonRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_MOVINGREASON_ID_UNIQUE, Keys.KEY_MOVINGREASON_SEQUENCE_UNIQUE);
    }

    @Override
    public List<ForeignKey<MovingreasonRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_MOVINGREASON_GAMEVERSION1);
    }

    private transient Gameversion _gameversion;

    /**
     * Get the implicit join path to the <code>housinggame.gameversion</code>
     * table.
     */
    public Gameversion gameversion() {
        if (_gameversion == null)
            _gameversion = new Gameversion(this, Keys.FK_MOVINGREASON_GAMEVERSION1);

        return _gameversion;
    }

    @Override
    public Movingreason as(String alias) {
        return new Movingreason(DSL.name(alias), this);
    }

    @Override
    public Movingreason as(Name alias) {
        return new Movingreason(alias, this);
    }

    @Override
    public Movingreason as(Table<?> alias) {
        return new Movingreason(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Movingreason rename(String name) {
        return new Movingreason(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Movingreason rename(Name name) {
        return new Movingreason(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Movingreason rename(Table<?> name) {
        return new Movingreason(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, Byte, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super Integer, ? super String, ? super Byte, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super Integer, ? super String, ? super Byte, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
