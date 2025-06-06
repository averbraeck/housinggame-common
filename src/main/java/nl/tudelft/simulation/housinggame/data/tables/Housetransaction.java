/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
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
import nl.tudelft.simulation.housinggame.data.tables.records.HousetransactionRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Housetransaction extends TableImpl<HousetransactionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.housetransaction</code>
     */
    public static final Housetransaction HOUSETRANSACTION = new Housetransaction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HousetransactionRecord> getRecordType() {
        return HousetransactionRecord.class;
    }

    /**
     * The column <code>housinggame.housetransaction.id</code>.
     */
    public final TableField<HousetransactionRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.housetransaction.timestamp</code>.
     */
    public final TableField<HousetransactionRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>housinggame.housetransaction.price</code>.
     */
    public final TableField<HousetransactionRecord, Integer> PRICE = createField(DSL.name("price"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.housetransaction.comment</code>.
     */
    public final TableField<HousetransactionRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>housinggame.housetransaction.transaction_status</code>.
     */
    public final TableField<HousetransactionRecord, String> TRANSACTION_STATUS = createField(DSL.name("transaction_status"), SQLDataType.VARCHAR(24).nullable(false), this, "");

    /**
     * The column <code>housinggame.housetransaction.housegroup_id</code>.
     */
    public final TableField<HousetransactionRecord, Integer> HOUSEGROUP_ID = createField(DSL.name("housegroup_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.housetransaction.playerround_id</code>.
     */
    public final TableField<HousetransactionRecord, Integer> PLAYERROUND_ID = createField(DSL.name("playerround_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.housetransaction.groupround_id</code>.
     */
    public final TableField<HousetransactionRecord, Integer> GROUPROUND_ID = createField(DSL.name("groupround_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Housetransaction(Name alias, Table<HousetransactionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Housetransaction(Name alias, Table<HousetransactionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.housetransaction</code> table
     * reference
     */
    public Housetransaction(String alias) {
        this(DSL.name(alias), HOUSETRANSACTION);
    }

    /**
     * Create an aliased <code>housinggame.housetransaction</code> table
     * reference
     */
    public Housetransaction(Name alias) {
        this(alias, HOUSETRANSACTION);
    }

    /**
     * Create a <code>housinggame.housetransaction</code> table reference
     */
    public Housetransaction() {
        this(DSL.name("housetransaction"), null);
    }

    public <O extends Record> Housetransaction(Table<O> child, ForeignKey<O, HousetransactionRecord> key) {
        super(child, key, HOUSETRANSACTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.HOUSETRANSACTION_FK_HOUSETRANSACTION_GROUPROUND1_IDX, Indexes.HOUSETRANSACTION_FK_HOUSETRANSACTION_HOUSEGROUP1_IDX, Indexes.HOUSETRANSACTION_FK_HOUSETRANSACTION_PLAYERROUND1_IDX);
    }

    @Override
    public Identity<HousetransactionRecord, Integer> getIdentity() {
        return (Identity<HousetransactionRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<HousetransactionRecord> getPrimaryKey() {
        return Keys.KEY_HOUSETRANSACTION_PRIMARY;
    }

    @Override
    public List<UniqueKey<HousetransactionRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_HOUSETRANSACTION_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<HousetransactionRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_HOUSETRANSACTION_HOUSEGROUP1, Keys.FK_HOUSETRANSACTION_PLAYERROUND1, Keys.FK_HOUSETRANSACTION_GROUPROUND1);
    }

    private transient Housegroup _housegroup;
    private transient Playerround _playerround;
    private transient Groupround _groupround;

    /**
     * Get the implicit join path to the <code>housinggame.housegroup</code>
     * table.
     */
    public Housegroup housegroup() {
        if (_housegroup == null)
            _housegroup = new Housegroup(this, Keys.FK_HOUSETRANSACTION_HOUSEGROUP1);

        return _housegroup;
    }

    /**
     * Get the implicit join path to the <code>housinggame.playerround</code>
     * table.
     */
    public Playerround playerround() {
        if (_playerround == null)
            _playerround = new Playerround(this, Keys.FK_HOUSETRANSACTION_PLAYERROUND1);

        return _playerround;
    }

    /**
     * Get the implicit join path to the <code>housinggame.groupround</code>
     * table.
     */
    public Groupround groupround() {
        if (_groupround == null)
            _groupround = new Groupround(this, Keys.FK_HOUSETRANSACTION_GROUPROUND1);

        return _groupround;
    }

    @Override
    public Housetransaction as(String alias) {
        return new Housetransaction(DSL.name(alias), this);
    }

    @Override
    public Housetransaction as(Name alias) {
        return new Housetransaction(alias, this);
    }

    @Override
    public Housetransaction as(Table<?> alias) {
        return new Housetransaction(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Housetransaction rename(String name) {
        return new Housetransaction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Housetransaction rename(Name name) {
        return new Housetransaction(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Housetransaction rename(Table<?> name) {
        return new Housetransaction(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, LocalDateTime, Integer, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Integer, ? super LocalDateTime, ? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Integer, ? super LocalDateTime, ? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
