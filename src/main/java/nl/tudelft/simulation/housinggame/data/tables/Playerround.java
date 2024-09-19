/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import nl.tudelft.simulation.housinggame.data.Housinggame;
import nl.tudelft.simulation.housinggame.data.Indexes;
import nl.tudelft.simulation.housinggame.data.Keys;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerroundRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
public class Playerround extends TableImpl<PlayerroundRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame.playerround</code>
     */
    public static final Playerround PLAYERROUND = new Playerround();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlayerroundRecord> getRecordType() {
        return PlayerroundRecord.class;
    }

    /**
     * The column <code>housinggame.playerround.id</code>.
     */
    public final TableField<PlayerroundRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>housinggame.playerround.create_time</code>.
     */
    public final TableField<PlayerroundRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>housinggame.playerround.round_income</code>.
     */
    public final TableField<PlayerroundRecord, Integer> ROUND_INCOME = createField(DSL.name("round_income"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.living_costs</code>.
     */
    public final TableField<PlayerroundRecord, Integer> LIVING_COSTS = createField(DSL.name("living_costs"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.paid_debt</code>.
     */
    public final TableField<PlayerroundRecord, Integer> PAID_DEBT = createField(DSL.name("paid_debt"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.mortgage_payment</code>.
     */
    public final TableField<PlayerroundRecord, Integer> MORTGAGE_PAYMENT = createField(DSL.name("mortgage_payment"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.profit_sold_house</code>.
     */
    public final TableField<PlayerroundRecord, Integer> PROFIT_SOLD_HOUSE = createField(DSL.name("profit_sold_house"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.spent_savings_for_buying_house</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SPENT_SAVINGS_FOR_BUYING_HOUSE = createField(DSL.name("spent_savings_for_buying_house"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.cost_taxes</code>.
     */
    public final TableField<PlayerroundRecord, Integer> COST_TAXES = createField(DSL.name("cost_taxes"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.cost_measures_bought</code>.
     */
    public final TableField<PlayerroundRecord, Integer> COST_MEASURES_BOUGHT = createField(DSL.name("cost_measures_bought"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.cost_satisfaction_bought</code>.
     */
    public final TableField<PlayerroundRecord, Integer> COST_SATISFACTION_BOUGHT = createField(DSL.name("cost_satisfaction_bought"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.cost_fluvial_damage</code>.
     */
    public final TableField<PlayerroundRecord, Integer> COST_FLUVIAL_DAMAGE = createField(DSL.name("cost_fluvial_damage"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.cost_pluvial_damage</code>.
     */
    public final TableField<PlayerroundRecord, Integer> COST_PLUVIAL_DAMAGE = createField(DSL.name("cost_pluvial_damage"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.spendable_income</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SPENDABLE_INCOME = createField(DSL.name("spendable_income"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_move_penalty</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SATISFACTION_MOVE_PENALTY = createField(DSL.name("satisfaction_move_penalty"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_house_rating_delta</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SATISFACTION_HOUSE_RATING_DELTA = createField(DSL.name("satisfaction_house_rating_delta"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_house_measures</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SATISFACTION_HOUSE_MEASURES = createField(DSL.name("satisfaction_house_measures"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_personal_measures</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SATISFACTION_PERSONAL_MEASURES = createField(DSL.name("satisfaction_personal_measures"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_fluvial_penalty</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SATISFACTION_FLUVIAL_PENALTY = createField(DSL.name("satisfaction_fluvial_penalty"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_pluvial_penalty</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SATISFACTION_PLUVIAL_PENALTY = createField(DSL.name("satisfaction_pluvial_penalty"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_debt_penalty</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SATISFACTION_DEBT_PENALTY = createField(DSL.name("satisfaction_debt_penalty"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>housinggame.playerround.satisfaction_personal_total</code>.
     */
    public final TableField<PlayerroundRecord, Integer> SATISFACTION_PERSONAL_TOTAL = createField(DSL.name("satisfaction_personal_total"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.preferred_house_rating</code>.
     */
    public final TableField<PlayerroundRecord, Integer> PREFERRED_HOUSE_RATING = createField(DSL.name("preferred_house_rating"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.maximum_mortgage</code>.
     */
    public final TableField<PlayerroundRecord, Integer> MAXIMUM_MORTGAGE = createField(DSL.name("maximum_mortgage"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.mortgage_house_start</code>.
     */
    public final TableField<PlayerroundRecord, Integer> MORTGAGE_HOUSE_START = createField(DSL.name("mortgage_house_start"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.mortgage_left_start</code>.
     */
    public final TableField<PlayerroundRecord, Integer> MORTGAGE_LEFT_START = createField(DSL.name("mortgage_left_start"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.house_price_sold</code>.
     */
    public final TableField<PlayerroundRecord, Integer> HOUSE_PRICE_SOLD = createField(DSL.name("house_price_sold"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.house_price_bought</code>.
     */
    public final TableField<PlayerroundRecord, Integer> HOUSE_PRICE_BOUGHT = createField(DSL.name("house_price_bought"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.mortgage_house_end</code>.
     */
    public final TableField<PlayerroundRecord, Integer> MORTGAGE_HOUSE_END = createField(DSL.name("mortgage_house_end"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.mortgage_left_end</code>.
     */
    public final TableField<PlayerroundRecord, Integer> MORTGAGE_LEFT_END = createField(DSL.name("mortgage_left_end"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.movingreason_id</code>.
     */
    public final TableField<PlayerroundRecord, Integer> MOVINGREASON_ID = createField(DSL.name("movingreason_id"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.moving_reason_other</code>.
     */
    public final TableField<PlayerroundRecord, String> MOVING_REASON_OTHER = createField(DSL.name("moving_reason_other"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.pluvial_base_protection</code>.
     */
    public final TableField<PlayerroundRecord, Integer> PLUVIAL_BASE_PROTECTION = createField(DSL.name("pluvial_base_protection"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.fluvial_base_protection</code>.
     */
    public final TableField<PlayerroundRecord, Integer> FLUVIAL_BASE_PROTECTION = createField(DSL.name("fluvial_base_protection"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.pluvial_community_delta</code>.
     */
    public final TableField<PlayerroundRecord, Integer> PLUVIAL_COMMUNITY_DELTA = createField(DSL.name("pluvial_community_delta"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.fluvial_community_delta</code>.
     */
    public final TableField<PlayerroundRecord, Integer> FLUVIAL_COMMUNITY_DELTA = createField(DSL.name("fluvial_community_delta"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.pluvial_house_delta</code>.
     */
    public final TableField<PlayerroundRecord, Integer> PLUVIAL_HOUSE_DELTA = createField(DSL.name("pluvial_house_delta"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.fluvial_house_delta</code>.
     */
    public final TableField<PlayerroundRecord, Integer> FLUVIAL_HOUSE_DELTA = createField(DSL.name("fluvial_house_delta"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.player_state</code>.
     */
    public final TableField<PlayerroundRecord, String> PLAYER_STATE = createField(DSL.name("player_state"), SQLDataType.VARCHAR(24).nullable(false).defaultValue(DSL.field(DSL.raw("'LOGIN'"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>housinggame.playerround.player_id</code>.
     */
    public final TableField<PlayerroundRecord, Integer> PLAYER_ID = createField(DSL.name("player_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.groupround_id</code>.
     */
    public final TableField<PlayerroundRecord, Integer> GROUPROUND_ID = createField(DSL.name("groupround_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>housinggame.playerround.start_housegroup_id</code>.
     */
    public final TableField<PlayerroundRecord, Integer> START_HOUSEGROUP_ID = createField(DSL.name("start_housegroup_id"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.final_housegroup_id</code>.
     */
    public final TableField<PlayerroundRecord, Integer> FINAL_HOUSEGROUP_ID = createField(DSL.name("final_housegroup_id"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>housinggame.playerround.active_transaction_id</code>.
     */
    public final TableField<PlayerroundRecord, Integer> ACTIVE_TRANSACTION_ID = createField(DSL.name("active_transaction_id"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    private Playerround(Name alias, Table<PlayerroundRecord> aliased) {
        this(alias, aliased, null);
    }

    private Playerround(Name alias, Table<PlayerroundRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>housinggame.playerround</code> table reference
     */
    public Playerround(String alias) {
        this(DSL.name(alias), PLAYERROUND);
    }

    /**
     * Create an aliased <code>housinggame.playerround</code> table reference
     */
    public Playerround(Name alias) {
        this(alias, PLAYERROUND);
    }

    /**
     * Create a <code>housinggame.playerround</code> table reference
     */
    public Playerround() {
        this(DSL.name("playerround"), null);
    }

    public <O extends Record> Playerround(Table<O> child, ForeignKey<O, PlayerroundRecord> key) {
        super(child, key, PLAYERROUND);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Housinggame.HOUSINGGAME;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PLAYERROUND_FK_PLAYERROUND_GROUPROUND1_IDX, Indexes.PLAYERROUND_FK_PLAYERROUND_HOUSEGROUP1_IDX, Indexes.PLAYERROUND_FK_PLAYERROUND_HOUSEGROUP2_IDX, Indexes.PLAYERROUND_FK_PLAYERROUND_HOUSETRANSACTION1_IDX, Indexes.PLAYERROUND_FK_PLAYERROUND_MOVINGREASON1_IDX, Indexes.PLAYERROUND_FK_PLAYERROUND_PLAYER1_IDX);
    }

    @Override
    public Identity<PlayerroundRecord, Integer> getIdentity() {
        return (Identity<PlayerroundRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PlayerroundRecord> getPrimaryKey() {
        return Keys.KEY_PLAYERROUND_PRIMARY;
    }

    @Override
    public List<UniqueKey<PlayerroundRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_PLAYERROUND_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<PlayerroundRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_PLAYERROUND_MOVINGREASON1, Keys.FK_PLAYERROUND_PLAYER1, Keys.FK_PLAYERROUND_GROUPROUND1, Keys.FK_PLAYERROUND_HOUSEGROUP1, Keys.FK_PLAYERROUND_HOUSEGROUP2, Keys.FK_PLAYERROUND_HOUSETRANSACTION1);
    }

    private transient Movingreason _movingreason;
    private transient Player _player;
    private transient Groupround _groupround;
    private transient Housegroup _fkPlayerroundHousegroup1;
    private transient Housegroup _fkPlayerroundHousegroup2;
    private transient Housetransaction _housetransaction;

    /**
     * Get the implicit join path to the <code>housinggame.movingreason</code>
     * table.
     */
    public Movingreason movingreason() {
        if (_movingreason == null)
            _movingreason = new Movingreason(this, Keys.FK_PLAYERROUND_MOVINGREASON1);

        return _movingreason;
    }

    /**
     * Get the implicit join path to the <code>housinggame.player</code> table.
     */
    public Player player() {
        if (_player == null)
            _player = new Player(this, Keys.FK_PLAYERROUND_PLAYER1);

        return _player;
    }

    /**
     * Get the implicit join path to the <code>housinggame.groupround</code>
     * table.
     */
    public Groupround groupround() {
        if (_groupround == null)
            _groupround = new Groupround(this, Keys.FK_PLAYERROUND_GROUPROUND1);

        return _groupround;
    }

    /**
     * Get the implicit join path to the <code>housinggame.housegroup</code>
     * table, via the <code>fk_playerround_housegroup1</code> key.
     */
    public Housegroup fkPlayerroundHousegroup1() {
        if (_fkPlayerroundHousegroup1 == null)
            _fkPlayerroundHousegroup1 = new Housegroup(this, Keys.FK_PLAYERROUND_HOUSEGROUP1);

        return _fkPlayerroundHousegroup1;
    }

    /**
     * Get the implicit join path to the <code>housinggame.housegroup</code>
     * table, via the <code>fk_playerround_housegroup2</code> key.
     */
    public Housegroup fkPlayerroundHousegroup2() {
        if (_fkPlayerroundHousegroup2 == null)
            _fkPlayerroundHousegroup2 = new Housegroup(this, Keys.FK_PLAYERROUND_HOUSEGROUP2);

        return _fkPlayerroundHousegroup2;
    }

    /**
     * Get the implicit join path to the
     * <code>housinggame.housetransaction</code> table.
     */
    public Housetransaction housetransaction() {
        if (_housetransaction == null)
            _housetransaction = new Housetransaction(this, Keys.FK_PLAYERROUND_HOUSETRANSACTION1);

        return _housetransaction;
    }

    @Override
    public Playerround as(String alias) {
        return new Playerround(DSL.name(alias), this);
    }

    @Override
    public Playerround as(Name alias) {
        return new Playerround(alias, this);
    }

    @Override
    public Playerround as(Table<?> alias) {
        return new Playerround(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Playerround rename(String name) {
        return new Playerround(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Playerround rename(Name name) {
        return new Playerround(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Playerround rename(Table<?> name) {
        return new Playerround(name.getQualifiedName(), null);
    }
}
