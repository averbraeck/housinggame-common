/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
import nl.tudelft.simulation.housinggame.data.tables.records.GroupRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Group extends TableImpl<GroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.group</code>
     */
    public static final Group GROUP = new Group();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupRecord> getRecordType() {
        return GroupRecord.class;
    }

    /**
     * The column <code>housinggame.group.id</code>.
     */
    public final TableField<GroupRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.group.name</code>.
     */
    public final TableField<GroupRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>housinggame.group.password</code>.
     */
    public final TableField<GroupRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>housinggame.group.gamesession_id</code>.
     */
    public final TableField<GroupRecord, Integer> GAMESESSION_ID = createField(DSL.name("gamesession_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.group.scenario_id</code>.
     */
    public final TableField<GroupRecord, Integer> SCENARIO_ID = createField(DSL.name("scenario_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.group.facilitator_id</code>.
     */
    public final TableField<GroupRecord, Integer> FACILITATOR_ID = createField(DSL.name("facilitator_id"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    private Group(Name alias, Table<GroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private Group(Name alias, Table<GroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.group</code> table reference
     */
    public Group(String alias) {
        this(DSL.name(alias), GROUP);
    }

    /**
     * Create an aliased <code>housinggame.group</code> table reference
     */
    public Group(Name alias) {
        this(alias, GROUP);
    }

    /**
     * Create a <code>housinggame.group</code> table reference
     */
    public Group() {
        this(DSL.name("group"), null);
    }

    public <O extends Record> Group(Table<O> child, ForeignKey<O, GroupRecord> key) {
        super(child, key, GROUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.GROUP_FK_GROUP_GAMESESSION1_IDX, Indexes.GROUP_FK_GROUP_SCENARIO1_IDX, Indexes.GROUP_FK_GROUP_USER1_IDX);
    }

    @Override
    public Identity<GroupRecord, Integer> getIdentity() {
        return (Identity<GroupRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GroupRecord> getPrimaryKey() {
        return Keys.KEY_GROUP_PRIMARY;
    }

    @Override
    public List<UniqueKey<GroupRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_GROUP_ID_UNIQUE, Keys.KEY_GROUP_NAME_UNIQUE, Keys.KEY_GROUP_FACILITATOR_UNIQUE);
    }

    @Override
    public List<ForeignKey<GroupRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_GROUP_GAMESESSION1, Keys.FK_GROUP_SCENARIO1, Keys.FK_GROUP_USER1);
    }

    private transient Gamesession _gamesession;
    private transient Scenario _scenario;
    private transient User _user;

    /**
     * Get the implicit join path to the <code>housinggame.gamesession</code>
     * table.
     */
    public Gamesession gamesession() {
        if (_gamesession == null)
            _gamesession = new Gamesession(this, Keys.FK_GROUP_GAMESESSION1);

        return _gamesession;
    }

    /**
     * Get the implicit join path to the <code>housinggame.scenario</code>
     * table.
     */
    public Scenario scenario() {
        if (_scenario == null)
            _scenario = new Scenario(this, Keys.FK_GROUP_SCENARIO1);

        return _scenario;
    }

    /**
     * Get the implicit join path to the <code>housinggame.user</code> table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.FK_GROUP_USER1);

        return _user;
    }

    @Override
    public Group as(String alias) {
        return new Group(DSL.name(alias), this);
    }

    @Override
    public Group as(Name alias) {
        return new Group(alias, this);
    }

    @Override
    public Group as(Table<?> alias) {
        return new Group(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Group rename(String name) {
        return new Group(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Group rename(Name name) {
        return new Group(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Group rename(Table<?> name) {
        return new Group(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
