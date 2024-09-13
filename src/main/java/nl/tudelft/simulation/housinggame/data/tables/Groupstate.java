/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.tudelft.simulation.housinggame.data.Housinggame;
import nl.tudelft.simulation.housinggame.data.Indexes;
import nl.tudelft.simulation.housinggame.data.Keys;
import nl.tudelft.simulation.housinggame.data.tables.records.GroupstateRecord;

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
public class Groupstate extends TableImpl<GroupstateRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.groupstate</code>
     */
    public static final Groupstate GROUPSTATE = new Groupstate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupstateRecord> getRecordType() {
        return GroupstateRecord.class;
    }

    /**
     * The column <code>housinggame.groupstate.id</code>.
     */
    public final TableField<GroupstateRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.groupstate.groupround_id</code>.
     */
    public final TableField<GroupstateRecord, Integer> GROUPROUND_ID = createField(DSL.name("groupround_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.groupstate.timestamp</code>.
     */
    public final TableField<GroupstateRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>housinggame.groupstate.group_state</code>.
     */
    public final TableField<GroupstateRecord, String> GROUP_STATE = createField(DSL.name("group_state"), SQLDataType.VARCHAR(24).nullable(false), this, "");

    /**
     * The column <code>housinggame.groupstate.content</code>.
     */
    public final TableField<GroupstateRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.CLOB)), this, "");

    private Groupstate(Name alias, Table<GroupstateRecord> aliased) {
        this(alias, aliased, null);
    }

    private Groupstate(Name alias, Table<GroupstateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.groupstate</code> table reference
     */
    public Groupstate(String alias) {
        this(DSL.name(alias), GROUPSTATE);
    }

    /**
     * Create an aliased <code>housinggame.groupstate</code> table reference
     */
    public Groupstate(Name alias) {
        this(alias, GROUPSTATE);
    }

    /**
     * Create a <code>housinggame.groupstate</code> table reference
     */
    public Groupstate() {
        this(DSL.name("groupstate"), null);
    }

    public <O extends Record> Groupstate(Table<O> child, ForeignKey<O, GroupstateRecord> key) {
        super(child, key, GROUPSTATE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.GROUPSTATE_FK_GROUPSTATE_GROUPROUND1_IDX);
    }

    @Override
    public Identity<GroupstateRecord, Integer> getIdentity() {
        return (Identity<GroupstateRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GroupstateRecord> getPrimaryKey() {
        return Keys.KEY_GROUPSTATE_PRIMARY;
    }

    @Override
    public List<UniqueKey<GroupstateRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_GROUPSTATE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<GroupstateRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_GROUPSTATE_GROUPROUND1);
    }

    private transient Groupround _groupround;

    /**
     * Get the implicit join path to the <code>housinggame.groupround</code>
     * table.
     */
    public Groupround groupround() {
        if (_groupround == null)
            _groupround = new Groupround(this, Keys.FK_GROUPSTATE_GROUPROUND1);

        return _groupround;
    }

    @Override
    public Groupstate as(String alias) {
        return new Groupstate(DSL.name(alias), this);
    }

    @Override
    public Groupstate as(Name alias) {
        return new Groupstate(alias, this);
    }

    @Override
    public Groupstate as(Table<?> alias) {
        return new Groupstate(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Groupstate rename(String name) {
        return new Groupstate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Groupstate rename(Name name) {
        return new Groupstate(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Groupstate rename(Table<?> name) {
        return new Groupstate(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, LocalDateTime, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super Integer, ? super LocalDateTime, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super Integer, ? super LocalDateTime, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
