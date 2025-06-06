/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import nl.tudelft.simulation.housinggame.data.tables.Group;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupRecord extends UpdatableRecordImpl<GroupRecord> implements Record6<Integer, String, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.group.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.group.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.group.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.group.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.group.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.group.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>housinggame.group.gamesession_id</code>.
     */
    public void setGamesessionId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.group.gamesession_id</code>.
     */
    public Integer getGamesessionId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>housinggame.group.scenario_id</code>.
     */
    public void setScenarioId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.group.scenario_id</code>.
     */
    public Integer getScenarioId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>housinggame.group.facilitator_id</code>.
     */
    public void setFacilitatorId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>housinggame.group.facilitator_id</code>.
     */
    public Integer getFacilitatorId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, Integer, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Group.GROUP.ID;
    }

    @Override
    public Field<String> field2() {
        return Group.GROUP.NAME;
    }

    @Override
    public Field<String> field3() {
        return Group.GROUP.PASSWORD;
    }

    @Override
    public Field<Integer> field4() {
        return Group.GROUP.GAMESESSION_ID;
    }

    @Override
    public Field<Integer> field5() {
        return Group.GROUP.SCENARIO_ID;
    }

    @Override
    public Field<Integer> field6() {
        return Group.GROUP.FACILITATOR_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public Integer component4() {
        return getGamesessionId();
    }

    @Override
    public Integer component5() {
        return getScenarioId();
    }

    @Override
    public Integer component6() {
        return getFacilitatorId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public Integer value4() {
        return getGamesessionId();
    }

    @Override
    public Integer value5() {
        return getScenarioId();
    }

    @Override
    public Integer value6() {
        return getFacilitatorId();
    }

    @Override
    public GroupRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GroupRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GroupRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public GroupRecord value4(Integer value) {
        setGamesessionId(value);
        return this;
    }

    @Override
    public GroupRecord value5(Integer value) {
        setScenarioId(value);
        return this;
    }

    @Override
    public GroupRecord value6(Integer value) {
        setFacilitatorId(value);
        return this;
    }

    @Override
    public GroupRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupRecord
     */
    public GroupRecord() {
        super(Group.GROUP);
    }

    /**
     * Create a detached, initialised GroupRecord
     */
    public GroupRecord(Integer id, String name, String password, Integer gamesessionId, Integer scenarioId, Integer facilitatorId) {
        super(Group.GROUP);

        setId(id);
        setName(name);
        setPassword(password);
        setGamesessionId(gamesessionId);
        setScenarioId(scenarioId);
        setFacilitatorId(facilitatorId);
        resetChangedOnNotNull();
    }
}
