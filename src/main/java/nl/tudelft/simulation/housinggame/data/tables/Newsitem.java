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
import nl.tudelft.simulation.housinggame.data.tables.records.NewsitemRecord;

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
public class Newsitem extends TableImpl<NewsitemRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.newsitem</code>
     */
    public static final Newsitem NEWSITEM = new Newsitem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NewsitemRecord> getRecordType() {
        return NewsitemRecord.class;
    }

    /**
     * The column <code>housinggame.newsitem.id</code>.
     */
    public final TableField<NewsitemRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.newsitem.name</code>.
     */
    public final TableField<NewsitemRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>housinggame.newsitem.summary</code>.
     */
    public final TableField<NewsitemRecord, String> SUMMARY = createField(DSL.name("summary"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>housinggame.newsitem.content</code>.
     */
    public final TableField<NewsitemRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>housinggame.newsitem.round_id</code>.
     */
    public final TableField<NewsitemRecord, Integer> ROUND_ID = createField(DSL.name("round_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Newsitem(Name alias, Table<NewsitemRecord> aliased) {
        this(alias, aliased, null);
    }

    private Newsitem(Name alias, Table<NewsitemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.newsitem</code> table reference
     */
    public Newsitem(String alias) {
        this(DSL.name(alias), NEWSITEM);
    }

    /**
     * Create an aliased <code>housinggame.newsitem</code> table reference
     */
    public Newsitem(Name alias) {
        this(alias, NEWSITEM);
    }

    /**
     * Create a <code>housinggame.newsitem</code> table reference
     */
    public Newsitem() {
        this(DSL.name("newsitem"), null);
    }

    public <O extends Record> Newsitem(Table<O> child, ForeignKey<O, NewsitemRecord> key) {
        super(child, key, NEWSITEM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.NEWSITEM_FK_NEWSITEM_ROUND1_IDX);
    }

    @Override
    public Identity<NewsitemRecord, Integer> getIdentity() {
        return (Identity<NewsitemRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<NewsitemRecord> getPrimaryKey() {
        return Keys.KEY_NEWSITEM_PRIMARY;
    }

    @Override
    public List<UniqueKey<NewsitemRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_NEWSITEM_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<NewsitemRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_NEWSITEM_ROUND1);
    }

    private transient Round _round;

    /**
     * Get the implicit join path to the <code>housinggame.round</code> table.
     */
    public Round round() {
        if (_round == null)
            _round = new Round(this, Keys.FK_NEWSITEM_ROUND1);

        return _round;
    }

    @Override
    public Newsitem as(String alias) {
        return new Newsitem(DSL.name(alias), this);
    }

    @Override
    public Newsitem as(Name alias) {
        return new Newsitem(alias, this);
    }

    @Override
    public Newsitem as(Table<?> alias) {
        return new Newsitem(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Newsitem rename(String name) {
        return new Newsitem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Newsitem rename(Name name) {
        return new Newsitem(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Newsitem rename(Table<?> name) {
        return new Newsitem(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
