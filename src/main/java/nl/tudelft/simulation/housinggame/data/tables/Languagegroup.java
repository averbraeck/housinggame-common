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
import nl.tudelft.simulation.housinggame.data.tables.records.LanguagegroupRecord;

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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Languagegroup extends TableImpl<LanguagegroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.languagegroup</code>
     */
    public static final Languagegroup LANGUAGEGROUP = new Languagegroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LanguagegroupRecord> getRecordType() {
        return LanguagegroupRecord.class;
    }

    /**
     * The column <code>housinggame.languagegroup.id</code>.
     */
    public final TableField<LanguagegroupRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.languagegroup.name</code>.
     */
    public final TableField<LanguagegroupRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>housinggame.languagegroup.language_id1</code>.
     */
    public final TableField<LanguagegroupRecord, Integer> LANGUAGE_ID1 = createField(DSL.name("language_id1"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.languagegroup.language_id2</code>.
     */
    public final TableField<LanguagegroupRecord, Integer> LANGUAGE_ID2 = createField(DSL.name("language_id2"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.languagegroup.language_id3</code>.
     */
    public final TableField<LanguagegroupRecord, Integer> LANGUAGE_ID3 = createField(DSL.name("language_id3"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.languagegroup.language_id4</code>.
     */
    public final TableField<LanguagegroupRecord, Integer> LANGUAGE_ID4 = createField(DSL.name("language_id4"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    private Languagegroup(Name alias, Table<LanguagegroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private Languagegroup(Name alias, Table<LanguagegroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.languagegroup</code> table reference
     */
    public Languagegroup(String alias) {
        this(DSL.name(alias), LANGUAGEGROUP);
    }

    /**
     * Create an aliased <code>housinggame.languagegroup</code> table reference
     */
    public Languagegroup(Name alias) {
        this(alias, LANGUAGEGROUP);
    }

    /**
     * Create a <code>housinggame.languagegroup</code> table reference
     */
    public Languagegroup() {
        this(DSL.name("languagegroup"), null);
    }

    public <O extends Record> Languagegroup(Table<O> child, ForeignKey<O, LanguagegroupRecord> key) {
        super(child, key, LANGUAGEGROUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.LANGUAGEGROUP_FK_LANGUAGES_LANGUAGE1_IDX, Indexes.LANGUAGEGROUP_FK_LANGUAGES_LANGUAGE2_IDX, Indexes.LANGUAGEGROUP_FK_LANGUAGES_LANGUAGE3_IDX, Indexes.LANGUAGEGROUP_FK_LANGUAGES_LANGUAGE4_IDX);
    }

    @Override
    public Identity<LanguagegroupRecord, Integer> getIdentity() {
        return (Identity<LanguagegroupRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LanguagegroupRecord> getPrimaryKey() {
        return Keys.KEY_LANGUAGEGROUP_PRIMARY;
    }

    @Override
    public List<UniqueKey<LanguagegroupRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_LANGUAGEGROUP_ID_UNIQUE, Keys.KEY_LANGUAGEGROUP_NAME_UNIQUE);
    }

    @Override
    public List<ForeignKey<LanguagegroupRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_LANGUAGES_LANGUAGE1, Keys.FK_LANGUAGES_LANGUAGE2, Keys.FK_LANGUAGES_LANGUAGE3, Keys.FK_LANGUAGES_LANGUAGE4);
    }

    private transient Language _fkLanguagesLanguage1;
    private transient Language _fkLanguagesLanguage2;
    private transient Language _fkLanguagesLanguage3;
    private transient Language _fkLanguagesLanguage4;

    /**
     * Get the implicit join path to the <code>housinggame.language</code>
     * table, via the <code>fk_languages_language1</code> key.
     */
    public Language fkLanguagesLanguage1() {
        if (_fkLanguagesLanguage1 == null)
            _fkLanguagesLanguage1 = new Language(this, Keys.FK_LANGUAGES_LANGUAGE1);

        return _fkLanguagesLanguage1;
    }

    /**
     * Get the implicit join path to the <code>housinggame.language</code>
     * table, via the <code>fk_languages_language2</code> key.
     */
    public Language fkLanguagesLanguage2() {
        if (_fkLanguagesLanguage2 == null)
            _fkLanguagesLanguage2 = new Language(this, Keys.FK_LANGUAGES_LANGUAGE2);

        return _fkLanguagesLanguage2;
    }

    /**
     * Get the implicit join path to the <code>housinggame.language</code>
     * table, via the <code>fk_languages_language3</code> key.
     */
    public Language fkLanguagesLanguage3() {
        if (_fkLanguagesLanguage3 == null)
            _fkLanguagesLanguage3 = new Language(this, Keys.FK_LANGUAGES_LANGUAGE3);

        return _fkLanguagesLanguage3;
    }

    /**
     * Get the implicit join path to the <code>housinggame.language</code>
     * table, via the <code>fk_languages_language4</code> key.
     */
    public Language fkLanguagesLanguage4() {
        if (_fkLanguagesLanguage4 == null)
            _fkLanguagesLanguage4 = new Language(this, Keys.FK_LANGUAGES_LANGUAGE4);

        return _fkLanguagesLanguage4;
    }

    @Override
    public Languagegroup as(String alias) {
        return new Languagegroup(DSL.name(alias), this);
    }

    @Override
    public Languagegroup as(Name alias) {
        return new Languagegroup(alias, this);
    }

    @Override
    public Languagegroup as(Table<?> alias) {
        return new Languagegroup(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Languagegroup rename(String name) {
        return new Languagegroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Languagegroup rename(Name name) {
        return new Languagegroup(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Languagegroup rename(Table<?> name) {
        return new Languagegroup(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super String, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super String, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
