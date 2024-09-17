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
import nl.tudelft.simulation.housinggame.data.tables.records.PersonalmeasureRecord;

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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Personalmeasure extends TableImpl<PersonalmeasureRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.personalmeasure</code>
     */
    public static final Personalmeasure PERSONALMEASURE = new Personalmeasure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonalmeasureRecord> getRecordType() {
        return PersonalmeasureRecord.class;
    }

    /**
     * The column <code>housinggame.personalmeasure.id</code>.
     */
    public final TableField<PersonalmeasureRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.personalmeasure.measuretype_id</code>.
     */
    public final TableField<PersonalmeasureRecord, Integer> MEASURETYPE_ID = createField(DSL.name("measuretype_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.personalmeasure.playerround_id</code>.
     */
    public final TableField<PersonalmeasureRecord, Integer> PLAYERROUND_ID = createField(DSL.name("playerround_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Personalmeasure(Name alias, Table<PersonalmeasureRecord> aliased) {
        this(alias, aliased, null);
    }

    private Personalmeasure(Name alias, Table<PersonalmeasureRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.personalmeasure</code> table
     * reference
     */
    public Personalmeasure(String alias) {
        this(DSL.name(alias), PERSONALMEASURE);
    }

    /**
     * Create an aliased <code>housinggame.personalmeasure</code> table
     * reference
     */
    public Personalmeasure(Name alias) {
        this(alias, PERSONALMEASURE);
    }

    /**
     * Create a <code>housinggame.personalmeasure</code> table reference
     */
    public Personalmeasure() {
        this(DSL.name("personalmeasure"), null);
    }

    public <O extends Record> Personalmeasure(Table<O> child, ForeignKey<O, PersonalmeasureRecord> key) {
        super(child, key, PERSONALMEASURE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PERSONALMEASURE_FK_PERSONALMEASURE_MEASURETYPE1_IDX, Indexes.PERSONALMEASURE_FK_PERSONALMEASURE_PLAYERROUND1_IDX);
    }

    @Override
    public Identity<PersonalmeasureRecord, Integer> getIdentity() {
        return (Identity<PersonalmeasureRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PersonalmeasureRecord> getPrimaryKey() {
        return Keys.KEY_PERSONALMEASURE_PRIMARY;
    }

    @Override
    public List<UniqueKey<PersonalmeasureRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_PERSONALMEASURE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<PersonalmeasureRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_PERSONALMEASURE_MEASURETYPE1, Keys.FK_PERSONALMEASURE_PLAYERROUND1);
    }

    private transient Measuretype _measuretype;
    private transient Playerround _playerround;

    /**
     * Get the implicit join path to the <code>housinggame.measuretype</code>
     * table.
     */
    public Measuretype measuretype() {
        if (_measuretype == null)
            _measuretype = new Measuretype(this, Keys.FK_PERSONALMEASURE_MEASURETYPE1);

        return _measuretype;
    }

    /**
     * Get the implicit join path to the <code>housinggame.playerround</code>
     * table.
     */
    public Playerround playerround() {
        if (_playerround == null)
            _playerround = new Playerround(this, Keys.FK_PERSONALMEASURE_PLAYERROUND1);

        return _playerround;
    }

    @Override
    public Personalmeasure as(String alias) {
        return new Personalmeasure(DSL.name(alias), this);
    }

    @Override
    public Personalmeasure as(Name alias) {
        return new Personalmeasure(alias, this);
    }

    @Override
    public Personalmeasure as(Table<?> alias) {
        return new Personalmeasure(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Personalmeasure rename(String name) {
        return new Personalmeasure(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Personalmeasure rename(Name name) {
        return new Personalmeasure(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Personalmeasure rename(Table<?> name) {
        return new Personalmeasure(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
