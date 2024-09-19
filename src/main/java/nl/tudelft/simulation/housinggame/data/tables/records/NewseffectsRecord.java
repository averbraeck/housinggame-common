/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import nl.tudelft.simulation.housinggame.data.tables.Newseffects;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NewseffectsRecord extends UpdatableRecordImpl<NewseffectsRecord> implements Record15<Integer, String, Integer, Integer, Integer, Byte, Byte, Byte, Integer, Integer, Double, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>housinggame.newseffects.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>housinggame.newseffects.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>housinggame.newseffects.house_discount_round1</code>.
     * House discount year 1 after flooding, in Euros or as a percentage
     */
    public void setHouseDiscountRound1(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.house_discount_round1</code>.
     * House discount year 1 after flooding, in Euros or as a percentage
     */
    public Integer getHouseDiscountRound1() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>housinggame.newseffects.house_discount_round2</code>.
     * House discount year 2 after flooding, in Euros or as a percentage
     */
    public void setHouseDiscountRound2(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.house_discount_round2</code>.
     * House discount year 2 after flooding, in Euros or as a percentage
     */
    public Integer getHouseDiscountRound2() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>housinggame.newseffects.house_discount_round3</code>.
     * House discount year 3 after flooding, in Euros or as a percentage
     */
    public void setHouseDiscountRound3(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.house_discount_round3</code>.
     * House discount year 3 after flooding, in Euros or as a percentage
     */
    public Integer getHouseDiscountRound3() {
        return (Integer) get(4);
    }

    /**
     * Setter for
     * <code>housinggame.newseffects.house_discount_effect_pluvial</code>.
     */
    public void setHouseDiscountEffectPluvial(Byte value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>housinggame.newseffects.house_discount_effect_pluvial</code>.
     */
    public Byte getHouseDiscountEffectPluvial() {
        return (Byte) get(5);
    }

    /**
     * Setter for
     * <code>housinggame.newseffects.house_discount_effect_fluvial</code>.
     */
    public void setHouseDiscountEffectFluvial(Byte value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>housinggame.newseffects.house_discount_effect_fluvial</code>.
     */
    public Byte getHouseDiscountEffectFluvial() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>housinggame.newseffects.house_discount_community</code>.
     */
    public void setHouseDiscountCommunity(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.house_discount_community</code>.
     */
    public Byte getHouseDiscountCommunity() {
        return (Byte) get(7);
    }

    /**
     * Setter for
     * <code>housinggame.newseffects.pluvial_protection_change</code>.
     */
    public void setPluvialProtectionChange(Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>housinggame.newseffects.pluvial_protection_change</code>.
     */
    public Integer getPluvialProtectionChange() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>housinggame.newseffects.fluvial_protection_change</code>.
     */
    public void setFluvialProtectionChange(Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>housinggame.newseffects.fluvial_protection_change</code>.
     */
    public Integer getFluvialProtectionChange() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>housinggame.newseffects.tax_change</code>.
     */
    public void setTaxChange(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.tax_change</code>.
     */
    public Double getTaxChange() {
        return (Double) get(10);
    }

    /**
     * Setter for
     * <code>housinggame.newseffects.satisfaction_living_bonus</code>.
     */
    public void setSatisfactionLivingBonus(Integer value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>housinggame.newseffects.satisfaction_living_bonus</code>.
     */
    public Integer getSatisfactionLivingBonus() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>housinggame.newseffects.satisfaction_move_change</code>.
     */
    public void setSatisfactionMoveChange(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.satisfaction_move_change</code>.
     */
    public Integer getSatisfactionMoveChange() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>housinggame.newseffects.newsitem_id</code>.
     */
    public void setNewsitemId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.newsitem_id</code>.
     */
    public Integer getNewsitemId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>housinggame.newseffects.community_id</code>. When
     * community_id is NOT filled, all communities are affected equally.
     */
    public void setCommunityId(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>housinggame.newseffects.community_id</code>. When
     * community_id is NOT filled, all communities are affected equally.
     */
    public Integer getCommunityId() {
        return (Integer) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, String, Integer, Integer, Integer, Byte, Byte, Byte, Integer, Integer, Double, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Integer, String, Integer, Integer, Integer, Byte, Byte, Byte, Integer, Integer, Double, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Newseffects.NEWSEFFECTS.ID;
    }

    @Override
    public Field<String> field2() {
        return Newseffects.NEWSEFFECTS.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Newseffects.NEWSEFFECTS.HOUSE_DISCOUNT_ROUND1;
    }

    @Override
    public Field<Integer> field4() {
        return Newseffects.NEWSEFFECTS.HOUSE_DISCOUNT_ROUND2;
    }

    @Override
    public Field<Integer> field5() {
        return Newseffects.NEWSEFFECTS.HOUSE_DISCOUNT_ROUND3;
    }

    @Override
    public Field<Byte> field6() {
        return Newseffects.NEWSEFFECTS.HOUSE_DISCOUNT_EFFECT_PLUVIAL;
    }

    @Override
    public Field<Byte> field7() {
        return Newseffects.NEWSEFFECTS.HOUSE_DISCOUNT_EFFECT_FLUVIAL;
    }

    @Override
    public Field<Byte> field8() {
        return Newseffects.NEWSEFFECTS.HOUSE_DISCOUNT_COMMUNITY;
    }

    @Override
    public Field<Integer> field9() {
        return Newseffects.NEWSEFFECTS.PLUVIAL_PROTECTION_CHANGE;
    }

    @Override
    public Field<Integer> field10() {
        return Newseffects.NEWSEFFECTS.FLUVIAL_PROTECTION_CHANGE;
    }

    @Override
    public Field<Double> field11() {
        return Newseffects.NEWSEFFECTS.TAX_CHANGE;
    }

    @Override
    public Field<Integer> field12() {
        return Newseffects.NEWSEFFECTS.SATISFACTION_LIVING_BONUS;
    }

    @Override
    public Field<Integer> field13() {
        return Newseffects.NEWSEFFECTS.SATISFACTION_MOVE_CHANGE;
    }

    @Override
    public Field<Integer> field14() {
        return Newseffects.NEWSEFFECTS.NEWSITEM_ID;
    }

    @Override
    public Field<Integer> field15() {
        return Newseffects.NEWSEFFECTS.COMMUNITY_ID;
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
    public Integer component3() {
        return getHouseDiscountRound1();
    }

    @Override
    public Integer component4() {
        return getHouseDiscountRound2();
    }

    @Override
    public Integer component5() {
        return getHouseDiscountRound3();
    }

    @Override
    public Byte component6() {
        return getHouseDiscountEffectPluvial();
    }

    @Override
    public Byte component7() {
        return getHouseDiscountEffectFluvial();
    }

    @Override
    public Byte component8() {
        return getHouseDiscountCommunity();
    }

    @Override
    public Integer component9() {
        return getPluvialProtectionChange();
    }

    @Override
    public Integer component10() {
        return getFluvialProtectionChange();
    }

    @Override
    public Double component11() {
        return getTaxChange();
    }

    @Override
    public Integer component12() {
        return getSatisfactionLivingBonus();
    }

    @Override
    public Integer component13() {
        return getSatisfactionMoveChange();
    }

    @Override
    public Integer component14() {
        return getNewsitemId();
    }

    @Override
    public Integer component15() {
        return getCommunityId();
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
    public Integer value3() {
        return getHouseDiscountRound1();
    }

    @Override
    public Integer value4() {
        return getHouseDiscountRound2();
    }

    @Override
    public Integer value5() {
        return getHouseDiscountRound3();
    }

    @Override
    public Byte value6() {
        return getHouseDiscountEffectPluvial();
    }

    @Override
    public Byte value7() {
        return getHouseDiscountEffectFluvial();
    }

    @Override
    public Byte value8() {
        return getHouseDiscountCommunity();
    }

    @Override
    public Integer value9() {
        return getPluvialProtectionChange();
    }

    @Override
    public Integer value10() {
        return getFluvialProtectionChange();
    }

    @Override
    public Double value11() {
        return getTaxChange();
    }

    @Override
    public Integer value12() {
        return getSatisfactionLivingBonus();
    }

    @Override
    public Integer value13() {
        return getSatisfactionMoveChange();
    }

    @Override
    public Integer value14() {
        return getNewsitemId();
    }

    @Override
    public Integer value15() {
        return getCommunityId();
    }

    @Override
    public NewseffectsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public NewseffectsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public NewseffectsRecord value3(Integer value) {
        setHouseDiscountRound1(value);
        return this;
    }

    @Override
    public NewseffectsRecord value4(Integer value) {
        setHouseDiscountRound2(value);
        return this;
    }

    @Override
    public NewseffectsRecord value5(Integer value) {
        setHouseDiscountRound3(value);
        return this;
    }

    @Override
    public NewseffectsRecord value6(Byte value) {
        setHouseDiscountEffectPluvial(value);
        return this;
    }

    @Override
    public NewseffectsRecord value7(Byte value) {
        setHouseDiscountEffectFluvial(value);
        return this;
    }

    @Override
    public NewseffectsRecord value8(Byte value) {
        setHouseDiscountCommunity(value);
        return this;
    }

    @Override
    public NewseffectsRecord value9(Integer value) {
        setPluvialProtectionChange(value);
        return this;
    }

    @Override
    public NewseffectsRecord value10(Integer value) {
        setFluvialProtectionChange(value);
        return this;
    }

    @Override
    public NewseffectsRecord value11(Double value) {
        setTaxChange(value);
        return this;
    }

    @Override
    public NewseffectsRecord value12(Integer value) {
        setSatisfactionLivingBonus(value);
        return this;
    }

    @Override
    public NewseffectsRecord value13(Integer value) {
        setSatisfactionMoveChange(value);
        return this;
    }

    @Override
    public NewseffectsRecord value14(Integer value) {
        setNewsitemId(value);
        return this;
    }

    @Override
    public NewseffectsRecord value15(Integer value) {
        setCommunityId(value);
        return this;
    }

    @Override
    public NewseffectsRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Byte value6, Byte value7, Byte value8, Integer value9, Integer value10, Double value11, Integer value12, Integer value13, Integer value14, Integer value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NewseffectsRecord
     */
    public NewseffectsRecord() {
        super(Newseffects.NEWSEFFECTS);
    }

    /**
     * Create a detached, initialised NewseffectsRecord
     */
    public NewseffectsRecord(Integer id, String name, Integer houseDiscountRound1, Integer houseDiscountRound2, Integer houseDiscountRound3, Byte houseDiscountEffectPluvial, Byte houseDiscountEffectFluvial, Byte houseDiscountCommunity, Integer pluvialProtectionChange, Integer fluvialProtectionChange, Double taxChange, Integer satisfactionLivingBonus, Integer satisfactionMoveChange, Integer newsitemId, Integer communityId) {
        super(Newseffects.NEWSEFFECTS);

        setId(id);
        setName(name);
        setHouseDiscountRound1(houseDiscountRound1);
        setHouseDiscountRound2(houseDiscountRound2);
        setHouseDiscountRound3(houseDiscountRound3);
        setHouseDiscountEffectPluvial(houseDiscountEffectPluvial);
        setHouseDiscountEffectFluvial(houseDiscountEffectFluvial);
        setHouseDiscountCommunity(houseDiscountCommunity);
        setPluvialProtectionChange(pluvialProtectionChange);
        setFluvialProtectionChange(fluvialProtectionChange);
        setTaxChange(taxChange);
        setSatisfactionLivingBonus(satisfactionLivingBonus);
        setSatisfactionMoveChange(satisfactionMoveChange);
        setNewsitemId(newsitemId);
        setCommunityId(communityId);
        resetChangedOnNotNull();
    }
}
