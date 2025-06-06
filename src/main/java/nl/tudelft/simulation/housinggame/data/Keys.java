/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import nl.tudelft.simulation.housinggame.data.tables.Community;
import nl.tudelft.simulation.housinggame.data.tables.Gamesession;
import nl.tudelft.simulation.housinggame.data.tables.Gameversion;
import nl.tudelft.simulation.housinggame.data.tables.Group;
import nl.tudelft.simulation.housinggame.data.tables.Groupround;
import nl.tudelft.simulation.housinggame.data.tables.Groupstate;
import nl.tudelft.simulation.housinggame.data.tables.House;
import nl.tudelft.simulation.housinggame.data.tables.Housegroup;
import nl.tudelft.simulation.housinggame.data.tables.Housemeasure;
import nl.tudelft.simulation.housinggame.data.tables.Housetransaction;
import nl.tudelft.simulation.housinggame.data.tables.Initialhousemeasure;
import nl.tudelft.simulation.housinggame.data.tables.Label;
import nl.tudelft.simulation.housinggame.data.tables.Language;
import nl.tudelft.simulation.housinggame.data.tables.Languagegroup;
import nl.tudelft.simulation.housinggame.data.tables.Measurecategory;
import nl.tudelft.simulation.housinggame.data.tables.Measuretype;
import nl.tudelft.simulation.housinggame.data.tables.Movingreason;
import nl.tudelft.simulation.housinggame.data.tables.Newseffects;
import nl.tudelft.simulation.housinggame.data.tables.Newsitem;
import nl.tudelft.simulation.housinggame.data.tables.Personalmeasure;
import nl.tudelft.simulation.housinggame.data.tables.Player;
import nl.tudelft.simulation.housinggame.data.tables.Playerround;
import nl.tudelft.simulation.housinggame.data.tables.Playerstate;
import nl.tudelft.simulation.housinggame.data.tables.Question;
import nl.tudelft.simulation.housinggame.data.tables.Questionitem;
import nl.tudelft.simulation.housinggame.data.tables.Questionscore;
import nl.tudelft.simulation.housinggame.data.tables.Scenario;
import nl.tudelft.simulation.housinggame.data.tables.Scenarioparameters;
import nl.tudelft.simulation.housinggame.data.tables.Tax;
import nl.tudelft.simulation.housinggame.data.tables.User;
import nl.tudelft.simulation.housinggame.data.tables.Welfaretype;
import nl.tudelft.simulation.housinggame.data.tables.records.CommunityRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.GamesessionRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.GameversionRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.GroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.GrouproundRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.GroupstateRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HouseRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousegroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousemeasureRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.HousetransactionRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.InitialhousemeasureRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.LabelRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.LanguageRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.LanguagegroupRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasurecategoryRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MeasuretypeRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.MovingreasonRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.NewseffectsRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.NewsitemRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PersonalmeasureRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerroundRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.PlayerstateRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.QuestionRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.QuestionitemRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.QuestionscoreRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.ScenarioRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.ScenarioparametersRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.TaxRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.UserRecord;
import nl.tudelft.simulation.housinggame.data.tables.records.WelfaretypeRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * housinggame.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CommunityRecord> KEY_COMMUNITY_ID_UNIQUE = Internal.createUniqueKey(Community.COMMUNITY, DSL.name("KEY_community_id_UNIQUE"), new TableField[] { Community.COMMUNITY.ID }, true);
    public static final UniqueKey<CommunityRecord> KEY_COMMUNITY_PRIMARY = Internal.createUniqueKey(Community.COMMUNITY, DSL.name("KEY_community_PRIMARY"), new TableField[] { Community.COMMUNITY.ID }, true);
    public static final UniqueKey<GamesessionRecord> KEY_GAMESESSION_ID_UNIQUE = Internal.createUniqueKey(Gamesession.GAMESESSION, DSL.name("KEY_gamesession_Id_UNIQUE"), new TableField[] { Gamesession.GAMESESSION.ID }, true);
    public static final UniqueKey<GamesessionRecord> KEY_GAMESESSION_NAME_UNIQUE = Internal.createUniqueKey(Gamesession.GAMESESSION, DSL.name("KEY_gamesession_name_UNIQUE"), new TableField[] { Gamesession.GAMESESSION.NAME }, true);
    public static final UniqueKey<GamesessionRecord> KEY_GAMESESSION_PRIMARY = Internal.createUniqueKey(Gamesession.GAMESESSION, DSL.name("KEY_gamesession_PRIMARY"), new TableField[] { Gamesession.GAMESESSION.ID }, true);
    public static final UniqueKey<GameversionRecord> KEY_GAMEVERSION_ID_UNIQUE = Internal.createUniqueKey(Gameversion.GAMEVERSION, DSL.name("KEY_gameversion_id_UNIQUE"), new TableField[] { Gameversion.GAMEVERSION.ID }, true);
    public static final UniqueKey<GameversionRecord> KEY_GAMEVERSION_NAME_UNIQUE = Internal.createUniqueKey(Gameversion.GAMEVERSION, DSL.name("KEY_gameversion_name_UNIQUE"), new TableField[] { Gameversion.GAMEVERSION.NAME }, true);
    public static final UniqueKey<GameversionRecord> KEY_GAMEVERSION_PRIMARY = Internal.createUniqueKey(Gameversion.GAMEVERSION, DSL.name("KEY_gameversion_PRIMARY"), new TableField[] { Gameversion.GAMEVERSION.ID }, true);
    public static final UniqueKey<GroupRecord> KEY_GROUP_FACILITATOR_UNIQUE = Internal.createUniqueKey(Group.GROUP, DSL.name("KEY_group_facilitator_UNIQUE"), new TableField[] { Group.GROUP.GAMESESSION_ID, Group.GROUP.FACILITATOR_ID }, true);
    public static final UniqueKey<GroupRecord> KEY_GROUP_ID_UNIQUE = Internal.createUniqueKey(Group.GROUP, DSL.name("KEY_group_Id_UNIQUE"), new TableField[] { Group.GROUP.ID }, true);
    public static final UniqueKey<GroupRecord> KEY_GROUP_NAME_UNIQUE = Internal.createUniqueKey(Group.GROUP, DSL.name("KEY_group_name_UNIQUE"), new TableField[] { Group.GROUP.GAMESESSION_ID, Group.GROUP.NAME }, true);
    public static final UniqueKey<GroupRecord> KEY_GROUP_PRIMARY = Internal.createUniqueKey(Group.GROUP, DSL.name("KEY_group_PRIMARY"), new TableField[] { Group.GROUP.ID }, true);
    public static final UniqueKey<GrouproundRecord> KEY_GROUPROUND_ID_UNIQUE = Internal.createUniqueKey(Groupround.GROUPROUND, DSL.name("KEY_groupround_id_UNIQUE"), new TableField[] { Groupround.GROUPROUND.ID }, true);
    public static final UniqueKey<GrouproundRecord> KEY_GROUPROUND_PRIMARY = Internal.createUniqueKey(Groupround.GROUPROUND, DSL.name("KEY_groupround_PRIMARY"), new TableField[] { Groupround.GROUPROUND.ID }, true);
    public static final UniqueKey<GrouproundRecord> KEY_GROUPROUND_ROUND_UNIQUE = Internal.createUniqueKey(Groupround.GROUPROUND, DSL.name("KEY_groupround_round_UNIQUE"), new TableField[] { Groupround.GROUPROUND.GROUP_ID, Groupround.GROUPROUND.ROUND_NUMBER }, true);
    public static final UniqueKey<GroupstateRecord> KEY_GROUPSTATE_ID_UNIQUE = Internal.createUniqueKey(Groupstate.GROUPSTATE, DSL.name("KEY_groupstate_id_UNIQUE"), new TableField[] { Groupstate.GROUPSTATE.ID }, true);
    public static final UniqueKey<GroupstateRecord> KEY_GROUPSTATE_PRIMARY = Internal.createUniqueKey(Groupstate.GROUPSTATE, DSL.name("KEY_groupstate_PRIMARY"), new TableField[] { Groupstate.GROUPSTATE.ID }, true);
    public static final UniqueKey<HouseRecord> KEY_HOUSE_ID_UNIQUE = Internal.createUniqueKey(House.HOUSE, DSL.name("KEY_house_id_UNIQUE"), new TableField[] { House.HOUSE.ID }, true);
    public static final UniqueKey<HouseRecord> KEY_HOUSE_PRIMARY = Internal.createUniqueKey(House.HOUSE, DSL.name("KEY_house_PRIMARY"), new TableField[] { House.HOUSE.ID }, true);
    public static final UniqueKey<HousegroupRecord> KEY_HOUSEGROUP_ID_UNIQUE = Internal.createUniqueKey(Housegroup.HOUSEGROUP, DSL.name("KEY_housegroup_id_UNIQUE"), new TableField[] { Housegroup.HOUSEGROUP.ID }, true);
    public static final UniqueKey<HousegroupRecord> KEY_HOUSEGROUP_PRIMARY = Internal.createUniqueKey(Housegroup.HOUSEGROUP, DSL.name("KEY_housegroup_PRIMARY"), new TableField[] { Housegroup.HOUSEGROUP.ID }, true);
    public static final UniqueKey<HousemeasureRecord> KEY_HOUSEMEASURE_ID_UNIQUE = Internal.createUniqueKey(Housemeasure.HOUSEMEASURE, DSL.name("KEY_housemeasure_id_UNIQUE"), new TableField[] { Housemeasure.HOUSEMEASURE.ID }, true);
    public static final UniqueKey<HousemeasureRecord> KEY_HOUSEMEASURE_PRIMARY = Internal.createUniqueKey(Housemeasure.HOUSEMEASURE, DSL.name("KEY_housemeasure_PRIMARY"), new TableField[] { Housemeasure.HOUSEMEASURE.ID }, true);
    public static final UniqueKey<HousetransactionRecord> KEY_HOUSETRANSACTION_ID_UNIQUE = Internal.createUniqueKey(Housetransaction.HOUSETRANSACTION, DSL.name("KEY_housetransaction_id_UNIQUE"), new TableField[] { Housetransaction.HOUSETRANSACTION.ID }, true);
    public static final UniqueKey<HousetransactionRecord> KEY_HOUSETRANSACTION_PRIMARY = Internal.createUniqueKey(Housetransaction.HOUSETRANSACTION, DSL.name("KEY_housetransaction_PRIMARY"), new TableField[] { Housetransaction.HOUSETRANSACTION.ID }, true);
    public static final UniqueKey<InitialhousemeasureRecord> KEY_INITIALHOUSEMEASURE_ID_UNIQUE = Internal.createUniqueKey(Initialhousemeasure.INITIALHOUSEMEASURE, DSL.name("KEY_initialhousemeasure_id_UNIQUE"), new TableField[] { Initialhousemeasure.INITIALHOUSEMEASURE.ID }, true);
    public static final UniqueKey<InitialhousemeasureRecord> KEY_INITIALHOUSEMEASURE_PRIMARY = Internal.createUniqueKey(Initialhousemeasure.INITIALHOUSEMEASURE, DSL.name("KEY_initialhousemeasure_PRIMARY"), new TableField[] { Initialhousemeasure.INITIALHOUSEMEASURE.ID }, true);
    public static final UniqueKey<LabelRecord> KEY_LABEL_ID_UNIQUE = Internal.createUniqueKey(Label.LABEL, DSL.name("KEY_label_id_UNIQUE"), new TableField[] { Label.LABEL.ID }, true);
    public static final UniqueKey<LabelRecord> KEY_LABEL_KEY_UNIQUE = Internal.createUniqueKey(Label.LABEL, DSL.name("KEY_label_key_UNIQUE"), new TableField[] { Label.LABEL.LANGUAGEGROUP_ID, Label.LABEL.KEY }, true);
    public static final UniqueKey<LabelRecord> KEY_LABEL_PRIMARY = Internal.createUniqueKey(Label.LABEL, DSL.name("KEY_label_PRIMARY"), new TableField[] { Label.LABEL.ID }, true);
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_CODE_UNIQUE = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("KEY_language_code_UNIQUE"), new TableField[] { Language.LANGUAGE.CODE }, true);
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_ID_UNIQUE = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("KEY_language_id_UNIQUE"), new TableField[] { Language.LANGUAGE.ID }, true);
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_NAME_UNIQUE = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("KEY_language_name_UNIQUE"), new TableField[] { Language.LANGUAGE.NAME }, true);
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("KEY_language_PRIMARY"), new TableField[] { Language.LANGUAGE.ID }, true);
    public static final UniqueKey<LanguagegroupRecord> KEY_LANGUAGEGROUP_ID_UNIQUE = Internal.createUniqueKey(Languagegroup.LANGUAGEGROUP, DSL.name("KEY_languagegroup_id_UNIQUE"), new TableField[] { Languagegroup.LANGUAGEGROUP.ID }, true);
    public static final UniqueKey<LanguagegroupRecord> KEY_LANGUAGEGROUP_NAME_UNIQUE = Internal.createUniqueKey(Languagegroup.LANGUAGEGROUP, DSL.name("KEY_languagegroup_name_UNIQUE"), new TableField[] { Languagegroup.LANGUAGEGROUP.NAME }, true);
    public static final UniqueKey<LanguagegroupRecord> KEY_LANGUAGEGROUP_PRIMARY = Internal.createUniqueKey(Languagegroup.LANGUAGEGROUP, DSL.name("KEY_languagegroup_PRIMARY"), new TableField[] { Languagegroup.LANGUAGEGROUP.ID }, true);
    public static final UniqueKey<MeasurecategoryRecord> KEY_MEASURECATEGORY_ID_UNIQUE = Internal.createUniqueKey(Measurecategory.MEASURECATEGORY, DSL.name("KEY_measurecategory_id_UNIQUE"), new TableField[] { Measurecategory.MEASURECATEGORY.ID }, true);
    public static final UniqueKey<MeasurecategoryRecord> KEY_MEASURECATEGORY_PRIMARY = Internal.createUniqueKey(Measurecategory.MEASURECATEGORY, DSL.name("KEY_measurecategory_PRIMARY"), new TableField[] { Measurecategory.MEASURECATEGORY.ID }, true);
    public static final UniqueKey<MeasuretypeRecord> KEY_MEASURETYPE_ID_UNIQUE = Internal.createUniqueKey(Measuretype.MEASURETYPE, DSL.name("KEY_measuretype_id_UNIQUE"), new TableField[] { Measuretype.MEASURETYPE.ID }, true);
    public static final UniqueKey<MeasuretypeRecord> KEY_MEASURETYPE_PRIMARY = Internal.createUniqueKey(Measuretype.MEASURETYPE, DSL.name("KEY_measuretype_PRIMARY"), new TableField[] { Measuretype.MEASURETYPE.ID }, true);
    public static final UniqueKey<MovingreasonRecord> KEY_MOVINGREASON_ID_UNIQUE = Internal.createUniqueKey(Movingreason.MOVINGREASON, DSL.name("KEY_movingreason_id_UNIQUE"), new TableField[] { Movingreason.MOVINGREASON.ID }, true);
    public static final UniqueKey<MovingreasonRecord> KEY_MOVINGREASON_KEY_UNIQUE = Internal.createUniqueKey(Movingreason.MOVINGREASON, DSL.name("KEY_movingreason_key_UNIQUE"), new TableField[] { Movingreason.MOVINGREASON.GAMEVERSION_ID, Movingreason.MOVINGREASON.KEY }, true);
    public static final UniqueKey<MovingreasonRecord> KEY_MOVINGREASON_PRIMARY = Internal.createUniqueKey(Movingreason.MOVINGREASON, DSL.name("KEY_movingreason_PRIMARY"), new TableField[] { Movingreason.MOVINGREASON.ID }, true);
    public static final UniqueKey<MovingreasonRecord> KEY_MOVINGREASON_SEQUENCE_UNIQUE = Internal.createUniqueKey(Movingreason.MOVINGREASON, DSL.name("KEY_movingreason_sequence_UNIQUE"), new TableField[] { Movingreason.MOVINGREASON.GAMEVERSION_ID, Movingreason.MOVINGREASON.SEQUENCE_NUMBER }, true);
    public static final UniqueKey<NewseffectsRecord> KEY_NEWSEFFECTS_ID_UNIQUE = Internal.createUniqueKey(Newseffects.NEWSEFFECTS, DSL.name("KEY_newseffects_id_UNIQUE"), new TableField[] { Newseffects.NEWSEFFECTS.ID }, true);
    public static final UniqueKey<NewseffectsRecord> KEY_NEWSEFFECTS_PRIMARY = Internal.createUniqueKey(Newseffects.NEWSEFFECTS, DSL.name("KEY_newseffects_PRIMARY"), new TableField[] { Newseffects.NEWSEFFECTS.ID }, true);
    public static final UniqueKey<NewsitemRecord> KEY_NEWSITEM_ID_UNIQUE = Internal.createUniqueKey(Newsitem.NEWSITEM, DSL.name("KEY_newsitem_id_UNIQUE"), new TableField[] { Newsitem.NEWSITEM.ID }, true);
    public static final UniqueKey<NewsitemRecord> KEY_NEWSITEM_PRIMARY = Internal.createUniqueKey(Newsitem.NEWSITEM, DSL.name("KEY_newsitem_PRIMARY"), new TableField[] { Newsitem.NEWSITEM.ID }, true);
    public static final UniqueKey<PersonalmeasureRecord> KEY_PERSONALMEASURE_ID_UNIQUE = Internal.createUniqueKey(Personalmeasure.PERSONALMEASURE, DSL.name("KEY_personalmeasure_id_UNIQUE"), new TableField[] { Personalmeasure.PERSONALMEASURE.ID }, true);
    public static final UniqueKey<PersonalmeasureRecord> KEY_PERSONALMEASURE_PRIMARY = Internal.createUniqueKey(Personalmeasure.PERSONALMEASURE, DSL.name("KEY_personalmeasure_PRIMARY"), new TableField[] { Personalmeasure.PERSONALMEASURE.ID }, true);
    public static final UniqueKey<PlayerRecord> KEY_PLAYER_ID_UNIQUE = Internal.createUniqueKey(Player.PLAYER, DSL.name("KEY_player_id_UNIQUE"), new TableField[] { Player.PLAYER.ID }, true);
    public static final UniqueKey<PlayerRecord> KEY_PLAYER_PRIMARY = Internal.createUniqueKey(Player.PLAYER, DSL.name("KEY_player_PRIMARY"), new TableField[] { Player.PLAYER.ID }, true);
    public static final UniqueKey<PlayerroundRecord> KEY_PLAYERROUND_ID_UNIQUE = Internal.createUniqueKey(Playerround.PLAYERROUND, DSL.name("KEY_playerround_id_UNIQUE"), new TableField[] { Playerround.PLAYERROUND.ID }, true);
    public static final UniqueKey<PlayerroundRecord> KEY_PLAYERROUND_PRIMARY = Internal.createUniqueKey(Playerround.PLAYERROUND, DSL.name("KEY_playerround_PRIMARY"), new TableField[] { Playerround.PLAYERROUND.ID }, true);
    public static final UniqueKey<PlayerstateRecord> KEY_PLAYERSTATE_ID_UNIQUE = Internal.createUniqueKey(Playerstate.PLAYERSTATE, DSL.name("KEY_playerstate_id_UNIQUE"), new TableField[] { Playerstate.PLAYERSTATE.ID }, true);
    public static final UniqueKey<PlayerstateRecord> KEY_PLAYERSTATE_PRIMARY = Internal.createUniqueKey(Playerstate.PLAYERSTATE, DSL.name("KEY_playerstate_PRIMARY"), new TableField[] { Playerstate.PLAYERSTATE.ID }, true);
    public static final UniqueKey<QuestionRecord> KEY_QUESTION_ID_UNIQUE = Internal.createUniqueKey(Question.QUESTION, DSL.name("KEY_question_id_UNIQUE"), new TableField[] { Question.QUESTION.ID }, true);
    public static final UniqueKey<QuestionRecord> KEY_QUESTION_PRIMARY = Internal.createUniqueKey(Question.QUESTION, DSL.name("KEY_question_PRIMARY"), new TableField[] { Question.QUESTION.ID }, true);
    public static final UniqueKey<QuestionitemRecord> KEY_QUESTIONITEM_CODE_UNIQUE = Internal.createUniqueKey(Questionitem.QUESTIONITEM, DSL.name("KEY_questionitem_code_UNIQUE"), new TableField[] { Questionitem.QUESTIONITEM.QUESTION_ID, Questionitem.QUESTIONITEM.CODE }, true);
    public static final UniqueKey<QuestionitemRecord> KEY_QUESTIONITEM_ID_UNIQUE = Internal.createUniqueKey(Questionitem.QUESTIONITEM, DSL.name("KEY_questionitem_id_UNIQUE"), new TableField[] { Questionitem.QUESTIONITEM.ID }, true);
    public static final UniqueKey<QuestionitemRecord> KEY_QUESTIONITEM_PRIMARY = Internal.createUniqueKey(Questionitem.QUESTIONITEM, DSL.name("KEY_questionitem_PRIMARY"), new TableField[] { Questionitem.QUESTIONITEM.ID }, true);
    public static final UniqueKey<QuestionscoreRecord> KEY_QUESTIONSCORE_ID_PLAYERROUND_QUESTION = Internal.createUniqueKey(Questionscore.QUESTIONSCORE, DSL.name("KEY_questionscore_id_playerround_question"), new TableField[] { Questionscore.QUESTIONSCORE.PLAYERROUND_ID, Questionscore.QUESTIONSCORE.QUESTION_ID }, true);
    public static final UniqueKey<QuestionscoreRecord> KEY_QUESTIONSCORE_ID_UNIQUE = Internal.createUniqueKey(Questionscore.QUESTIONSCORE, DSL.name("KEY_questionscore_id_UNIQUE"), new TableField[] { Questionscore.QUESTIONSCORE.ID }, true);
    public static final UniqueKey<QuestionscoreRecord> KEY_QUESTIONSCORE_PRIMARY = Internal.createUniqueKey(Questionscore.QUESTIONSCORE, DSL.name("KEY_questionscore_PRIMARY"), new TableField[] { Questionscore.QUESTIONSCORE.ID }, true);
    public static final UniqueKey<ScenarioRecord> KEY_SCENARIO_ID_UNIQUE = Internal.createUniqueKey(Scenario.SCENARIO, DSL.name("KEY_scenario_id_UNIQUE"), new TableField[] { Scenario.SCENARIO.ID }, true);
    public static final UniqueKey<ScenarioRecord> KEY_SCENARIO_PRIMARY = Internal.createUniqueKey(Scenario.SCENARIO, DSL.name("KEY_scenario_PRIMARY"), new TableField[] { Scenario.SCENARIO.ID }, true);
    public static final UniqueKey<ScenarioparametersRecord> KEY_SCENARIOPARAMETERS_ID_UNIQUE = Internal.createUniqueKey(Scenarioparameters.SCENARIOPARAMETERS, DSL.name("KEY_scenarioparameters_Id_UNIQUE"), new TableField[] { Scenarioparameters.SCENARIOPARAMETERS.ID }, true);
    public static final UniqueKey<ScenarioparametersRecord> KEY_SCENARIOPARAMETERS_NAME_UNIQUE = Internal.createUniqueKey(Scenarioparameters.SCENARIOPARAMETERS, DSL.name("KEY_scenarioparameters_name_UNIQUE"), new TableField[] { Scenarioparameters.SCENARIOPARAMETERS.NAME }, true);
    public static final UniqueKey<ScenarioparametersRecord> KEY_SCENARIOPARAMETERS_PRIMARY = Internal.createUniqueKey(Scenarioparameters.SCENARIOPARAMETERS, DSL.name("KEY_scenarioparameters_PRIMARY"), new TableField[] { Scenarioparameters.SCENARIOPARAMETERS.ID }, true);
    public static final UniqueKey<TaxRecord> KEY_TAX_ID_UNIQUE = Internal.createUniqueKey(Tax.TAX, DSL.name("KEY_tax_id_UNIQUE"), new TableField[] { Tax.TAX.ID }, true);
    public static final UniqueKey<TaxRecord> KEY_TAX_PRIMARY = Internal.createUniqueKey(Tax.TAX, DSL.name("KEY_tax_PRIMARY"), new TableField[] { Tax.TAX.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_ID_UNIQUE = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_id_UNIQUE"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_USERNAME_UNIQUE = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_username_UNIQUE"), new TableField[] { User.USER.USERNAME }, true);
    public static final UniqueKey<WelfaretypeRecord> KEY_WELFARETYPE_ID_UNIQUE = Internal.createUniqueKey(Welfaretype.WELFARETYPE, DSL.name("KEY_welfaretype_id_UNIQUE"), new TableField[] { Welfaretype.WELFARETYPE.ID }, true);
    public static final UniqueKey<WelfaretypeRecord> KEY_WELFARETYPE_PRIMARY = Internal.createUniqueKey(Welfaretype.WELFARETYPE, DSL.name("KEY_welfaretype_PRIMARY"), new TableField[] { Welfaretype.WELFARETYPE.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CommunityRecord, GameversionRecord> FK_COMMUNITY_GAMEVERSION1 = Internal.createForeignKey(Community.COMMUNITY, DSL.name("fk_community_gameversion1"), new TableField[] { Community.COMMUNITY.GAMEVERSION_ID }, Keys.KEY_GAMEVERSION_PRIMARY, new TableField[] { Gameversion.GAMEVERSION.ID }, true);
    public static final ForeignKey<GamesessionRecord, GameversionRecord> FK_GAMESESSION_GAMEVERSION1 = Internal.createForeignKey(Gamesession.GAMESESSION, DSL.name("fk_gamesession_gameversion1"), new TableField[] { Gamesession.GAMESESSION.GAMEVERSION_ID }, Keys.KEY_GAMEVERSION_PRIMARY, new TableField[] { Gameversion.GAMEVERSION.ID }, true);
    public static final ForeignKey<GameversionRecord, LanguagegroupRecord> FK_GAMEVERSION_LANGUAGEGROUP1 = Internal.createForeignKey(Gameversion.GAMEVERSION, DSL.name("fk_gameversion_languagegroup1"), new TableField[] { Gameversion.GAMEVERSION.LANGUAGEGROUP_ID }, Keys.KEY_LANGUAGEGROUP_PRIMARY, new TableField[] { Languagegroup.LANGUAGEGROUP.ID }, true);
    public static final ForeignKey<GroupRecord, GamesessionRecord> FK_GROUP_GAMESESSION1 = Internal.createForeignKey(Group.GROUP, DSL.name("fk_group_gamesession1"), new TableField[] { Group.GROUP.GAMESESSION_ID }, Keys.KEY_GAMESESSION_PRIMARY, new TableField[] { Gamesession.GAMESESSION.ID }, true);
    public static final ForeignKey<GroupRecord, ScenarioRecord> FK_GROUP_SCENARIO1 = Internal.createForeignKey(Group.GROUP, DSL.name("fk_group_scenario1"), new TableField[] { Group.GROUP.SCENARIO_ID }, Keys.KEY_SCENARIO_PRIMARY, new TableField[] { Scenario.SCENARIO.ID }, true);
    public static final ForeignKey<GroupRecord, UserRecord> FK_GROUP_USER1 = Internal.createForeignKey(Group.GROUP, DSL.name("fk_group_user1"), new TableField[] { Group.GROUP.FACILITATOR_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<GrouproundRecord, GroupRecord> FK_GROUPROUND_GROUP1 = Internal.createForeignKey(Groupround.GROUPROUND, DSL.name("fk_groupround_group1"), new TableField[] { Groupround.GROUPROUND.GROUP_ID }, Keys.KEY_GROUP_PRIMARY, new TableField[] { Group.GROUP.ID }, true);
    public static final ForeignKey<GroupstateRecord, GrouproundRecord> FK_GROUPSTATE_GROUPROUND1 = Internal.createForeignKey(Groupstate.GROUPSTATE, DSL.name("fk_groupstate_groupround1"), new TableField[] { Groupstate.GROUPSTATE.GROUPROUND_ID }, Keys.KEY_GROUPROUND_PRIMARY, new TableField[] { Groupround.GROUPROUND.ID }, true);
    public static final ForeignKey<HouseRecord, CommunityRecord> FK_HOUSE_COMMUNITY1 = Internal.createForeignKey(House.HOUSE, DSL.name("fk_house_community1"), new TableField[] { House.HOUSE.COMMUNITY_ID }, Keys.KEY_COMMUNITY_PRIMARY, new TableField[] { Community.COMMUNITY.ID }, true);
    public static final ForeignKey<HousegroupRecord, GroupRecord> FK_HOUSEGROUP_GROUP1 = Internal.createForeignKey(Housegroup.HOUSEGROUP, DSL.name("fk_housegroup_group1"), new TableField[] { Housegroup.HOUSEGROUP.GROUP_ID }, Keys.KEY_GROUP_PRIMARY, new TableField[] { Group.GROUP.ID }, true);
    public static final ForeignKey<HousegroupRecord, HouseRecord> FK_HOUSEROUND_HOUSE1 = Internal.createForeignKey(Housegroup.HOUSEGROUP, DSL.name("fk_houseround_house1"), new TableField[] { Housegroup.HOUSEGROUP.HOUSE_ID }, Keys.KEY_HOUSE_PRIMARY, new TableField[] { House.HOUSE.ID }, true);
    public static final ForeignKey<HousegroupRecord, PlayerRecord> FK_HOUSEROUND_PLAYER1 = Internal.createForeignKey(Housegroup.HOUSEGROUP, DSL.name("fk_houseround_player1"), new TableField[] { Housegroup.HOUSEGROUP.OWNER_ID }, Keys.KEY_PLAYER_PRIMARY, new TableField[] { Player.PLAYER.ID }, true);
    public static final ForeignKey<HousemeasureRecord, HousegroupRecord> FK_MEASURE_HOUSEROUND1 = Internal.createForeignKey(Housemeasure.HOUSEMEASURE, DSL.name("fk_measure_houseround1"), new TableField[] { Housemeasure.HOUSEMEASURE.HOUSEGROUP_ID }, Keys.KEY_HOUSEGROUP_PRIMARY, new TableField[] { Housegroup.HOUSEGROUP.ID }, true);
    public static final ForeignKey<HousemeasureRecord, MeasuretypeRecord> FK_MEASURE_MEASURETYPE1 = Internal.createForeignKey(Housemeasure.HOUSEMEASURE, DSL.name("fk_measure_measuretype1"), new TableField[] { Housemeasure.HOUSEMEASURE.MEASURETYPE_ID }, Keys.KEY_MEASURETYPE_PRIMARY, new TableField[] { Measuretype.MEASURETYPE.ID }, true);
    public static final ForeignKey<HousetransactionRecord, GrouproundRecord> FK_HOUSETRANSACTION_GROUPROUND1 = Internal.createForeignKey(Housetransaction.HOUSETRANSACTION, DSL.name("fk_housetransaction_groupround1"), new TableField[] { Housetransaction.HOUSETRANSACTION.GROUPROUND_ID }, Keys.KEY_GROUPROUND_PRIMARY, new TableField[] { Groupround.GROUPROUND.ID }, true);
    public static final ForeignKey<HousetransactionRecord, HousegroupRecord> FK_HOUSETRANSACTION_HOUSEGROUP1 = Internal.createForeignKey(Housetransaction.HOUSETRANSACTION, DSL.name("fk_housetransaction_housegroup1"), new TableField[] { Housetransaction.HOUSETRANSACTION.HOUSEGROUP_ID }, Keys.KEY_HOUSEGROUP_PRIMARY, new TableField[] { Housegroup.HOUSEGROUP.ID }, true);
    public static final ForeignKey<HousetransactionRecord, PlayerroundRecord> FK_HOUSETRANSACTION_PLAYERROUND1 = Internal.createForeignKey(Housetransaction.HOUSETRANSACTION, DSL.name("fk_housetransaction_playerround1"), new TableField[] { Housetransaction.HOUSETRANSACTION.PLAYERROUND_ID }, Keys.KEY_PLAYERROUND_PRIMARY, new TableField[] { Playerround.PLAYERROUND.ID }, true);
    public static final ForeignKey<InitialhousemeasureRecord, HouseRecord> FK_INITIALHOUSEMEASURE_HOUSE1 = Internal.createForeignKey(Initialhousemeasure.INITIALHOUSEMEASURE, DSL.name("fk_initialhousemeasure_house1"), new TableField[] { Initialhousemeasure.INITIALHOUSEMEASURE.HOUSE_ID }, Keys.KEY_HOUSE_PRIMARY, new TableField[] { House.HOUSE.ID }, true);
    public static final ForeignKey<InitialhousemeasureRecord, MeasuretypeRecord> FK_INITIALHOUSEMEASURE_MEASURETYPE1 = Internal.createForeignKey(Initialhousemeasure.INITIALHOUSEMEASURE, DSL.name("fk_initialhousemeasure_measuretype1"), new TableField[] { Initialhousemeasure.INITIALHOUSEMEASURE.MEASURETYPE_ID }, Keys.KEY_MEASURETYPE_PRIMARY, new TableField[] { Measuretype.MEASURETYPE.ID }, true);
    public static final ForeignKey<LabelRecord, LanguagegroupRecord> FK_LABEL_LANGUAGEGROUP1 = Internal.createForeignKey(Label.LABEL, DSL.name("fk_label_languagegroup1"), new TableField[] { Label.LABEL.LANGUAGEGROUP_ID }, Keys.KEY_LANGUAGEGROUP_PRIMARY, new TableField[] { Languagegroup.LANGUAGEGROUP.ID }, true);
    public static final ForeignKey<LanguagegroupRecord, LanguageRecord> FK_LANGUAGES_LANGUAGE1 = Internal.createForeignKey(Languagegroup.LANGUAGEGROUP, DSL.name("fk_languages_language1"), new TableField[] { Languagegroup.LANGUAGEGROUP.LANGUAGE_ID1 }, Keys.KEY_LANGUAGE_PRIMARY, new TableField[] { Language.LANGUAGE.ID }, true);
    public static final ForeignKey<LanguagegroupRecord, LanguageRecord> FK_LANGUAGES_LANGUAGE2 = Internal.createForeignKey(Languagegroup.LANGUAGEGROUP, DSL.name("fk_languages_language2"), new TableField[] { Languagegroup.LANGUAGEGROUP.LANGUAGE_ID2 }, Keys.KEY_LANGUAGE_PRIMARY, new TableField[] { Language.LANGUAGE.ID }, true);
    public static final ForeignKey<LanguagegroupRecord, LanguageRecord> FK_LANGUAGES_LANGUAGE3 = Internal.createForeignKey(Languagegroup.LANGUAGEGROUP, DSL.name("fk_languages_language3"), new TableField[] { Languagegroup.LANGUAGEGROUP.LANGUAGE_ID3 }, Keys.KEY_LANGUAGE_PRIMARY, new TableField[] { Language.LANGUAGE.ID }, true);
    public static final ForeignKey<LanguagegroupRecord, LanguageRecord> FK_LANGUAGES_LANGUAGE4 = Internal.createForeignKey(Languagegroup.LANGUAGEGROUP, DSL.name("fk_languages_language4"), new TableField[] { Languagegroup.LANGUAGEGROUP.LANGUAGE_ID4 }, Keys.KEY_LANGUAGE_PRIMARY, new TableField[] { Language.LANGUAGE.ID }, true);
    public static final ForeignKey<MeasurecategoryRecord, ScenarioRecord> FK_MEASURECATEGORY_SCENARIO1 = Internal.createForeignKey(Measurecategory.MEASURECATEGORY, DSL.name("fk_measurecategory_scenario1"), new TableField[] { Measurecategory.MEASURECATEGORY.SCENARIO_ID }, Keys.KEY_SCENARIO_PRIMARY, new TableField[] { Scenario.SCENARIO.ID }, true);
    public static final ForeignKey<MeasuretypeRecord, MeasurecategoryRecord> FK_MEASURETYPE_MEASURECATEGORY1 = Internal.createForeignKey(Measuretype.MEASURETYPE, DSL.name("fk_measuretype_measurecategory1"), new TableField[] { Measuretype.MEASURETYPE.MEASURECATEGORY_ID }, Keys.KEY_MEASURECATEGORY_PRIMARY, new TableField[] { Measurecategory.MEASURECATEGORY.ID }, true);
    public static final ForeignKey<MovingreasonRecord, GameversionRecord> FK_MOVINGREASON_GAMEVERSION1 = Internal.createForeignKey(Movingreason.MOVINGREASON, DSL.name("fk_movingreason_gameversion1"), new TableField[] { Movingreason.MOVINGREASON.GAMEVERSION_ID }, Keys.KEY_GAMEVERSION_PRIMARY, new TableField[] { Gameversion.GAMEVERSION.ID }, true);
    public static final ForeignKey<NewseffectsRecord, CommunityRecord> FK_NEWSEFFECTS_COMMUNITY1 = Internal.createForeignKey(Newseffects.NEWSEFFECTS, DSL.name("fk_newseffects_community1"), new TableField[] { Newseffects.NEWSEFFECTS.COMMUNITY_ID }, Keys.KEY_COMMUNITY_PRIMARY, new TableField[] { Community.COMMUNITY.ID }, true);
    public static final ForeignKey<NewseffectsRecord, NewsitemRecord> FK_NEWSEFFECTS_NEWSITEM1 = Internal.createForeignKey(Newseffects.NEWSEFFECTS, DSL.name("fk_newseffects_newsitem1"), new TableField[] { Newseffects.NEWSEFFECTS.NEWSITEM_ID }, Keys.KEY_NEWSITEM_PRIMARY, new TableField[] { Newsitem.NEWSITEM.ID }, true);
    public static final ForeignKey<NewsitemRecord, ScenarioRecord> FK_NEWSITEM_SCENARIO1 = Internal.createForeignKey(Newsitem.NEWSITEM, DSL.name("fk_newsitem_scenario1"), new TableField[] { Newsitem.NEWSITEM.SCENARIO_ID }, Keys.KEY_SCENARIO_PRIMARY, new TableField[] { Scenario.SCENARIO.ID }, true);
    public static final ForeignKey<PersonalmeasureRecord, MeasuretypeRecord> FK_PERSONALMEASURE_MEASURETYPE1 = Internal.createForeignKey(Personalmeasure.PERSONALMEASURE, DSL.name("fk_personalmeasure_measuretype1"), new TableField[] { Personalmeasure.PERSONALMEASURE.MEASURETYPE_ID }, Keys.KEY_MEASURETYPE_PRIMARY, new TableField[] { Measuretype.MEASURETYPE.ID }, true);
    public static final ForeignKey<PersonalmeasureRecord, PlayerroundRecord> FK_PERSONALMEASURE_PLAYERROUND1 = Internal.createForeignKey(Personalmeasure.PERSONALMEASURE, DSL.name("fk_personalmeasure_playerround1"), new TableField[] { Personalmeasure.PERSONALMEASURE.PLAYERROUND_ID }, Keys.KEY_PLAYERROUND_PRIMARY, new TableField[] { Playerround.PLAYERROUND.ID }, true);
    public static final ForeignKey<PlayerRecord, GroupRecord> FK_PLAYER_GROUP1 = Internal.createForeignKey(Player.PLAYER, DSL.name("fk_player_group1"), new TableField[] { Player.PLAYER.GROUP_ID }, Keys.KEY_GROUP_PRIMARY, new TableField[] { Group.GROUP.ID }, true);
    public static final ForeignKey<PlayerRecord, UserRecord> FK_PLAYER_USER1 = Internal.createForeignKey(Player.PLAYER, DSL.name("fk_player_user1"), new TableField[] { Player.PLAYER.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<PlayerRecord, WelfaretypeRecord> FK_PLAYER_WELFARETYPE1 = Internal.createForeignKey(Player.PLAYER, DSL.name("fk_player_welfaretype1"), new TableField[] { Player.PLAYER.WELFARETYPE_ID }, Keys.KEY_WELFARETYPE_PRIMARY, new TableField[] { Welfaretype.WELFARETYPE.ID }, true);
    public static final ForeignKey<PlayerroundRecord, GrouproundRecord> FK_PLAYERROUND_GROUPROUND1 = Internal.createForeignKey(Playerround.PLAYERROUND, DSL.name("fk_playerround_groupround1"), new TableField[] { Playerround.PLAYERROUND.GROUPROUND_ID }, Keys.KEY_GROUPROUND_PRIMARY, new TableField[] { Groupround.GROUPROUND.ID }, true);
    public static final ForeignKey<PlayerroundRecord, HousegroupRecord> FK_PLAYERROUND_HOUSEGROUP1 = Internal.createForeignKey(Playerround.PLAYERROUND, DSL.name("fk_playerround_housegroup1"), new TableField[] { Playerround.PLAYERROUND.START_HOUSEGROUP_ID }, Keys.KEY_HOUSEGROUP_PRIMARY, new TableField[] { Housegroup.HOUSEGROUP.ID }, true);
    public static final ForeignKey<PlayerroundRecord, HousegroupRecord> FK_PLAYERROUND_HOUSEGROUP2 = Internal.createForeignKey(Playerround.PLAYERROUND, DSL.name("fk_playerround_housegroup2"), new TableField[] { Playerround.PLAYERROUND.FINAL_HOUSEGROUP_ID }, Keys.KEY_HOUSEGROUP_PRIMARY, new TableField[] { Housegroup.HOUSEGROUP.ID }, true);
    public static final ForeignKey<PlayerroundRecord, HousetransactionRecord> FK_PLAYERROUND_HOUSETRANSACTION1 = Internal.createForeignKey(Playerround.PLAYERROUND, DSL.name("fk_playerround_housetransaction1"), new TableField[] { Playerround.PLAYERROUND.ACTIVE_TRANSACTION_ID }, Keys.KEY_HOUSETRANSACTION_PRIMARY, new TableField[] { Housetransaction.HOUSETRANSACTION.ID }, true);
    public static final ForeignKey<PlayerroundRecord, MovingreasonRecord> FK_PLAYERROUND_MOVINGREASON1 = Internal.createForeignKey(Playerround.PLAYERROUND, DSL.name("fk_playerround_movingreason1"), new TableField[] { Playerround.PLAYERROUND.MOVINGREASON_ID }, Keys.KEY_MOVINGREASON_PRIMARY, new TableField[] { Movingreason.MOVINGREASON.ID }, true);
    public static final ForeignKey<PlayerroundRecord, PlayerRecord> FK_PLAYERROUND_PLAYER1 = Internal.createForeignKey(Playerround.PLAYERROUND, DSL.name("fk_playerround_player1"), new TableField[] { Playerround.PLAYERROUND.PLAYER_ID }, Keys.KEY_PLAYER_PRIMARY, new TableField[] { Player.PLAYER.ID }, true);
    public static final ForeignKey<PlayerstateRecord, PlayerroundRecord> FK_PLAYERSTATE_PLAYERROUND1 = Internal.createForeignKey(Playerstate.PLAYERSTATE, DSL.name("fk_playerstate_playerround1"), new TableField[] { Playerstate.PLAYERSTATE.PLAYERROUND_ID }, Keys.KEY_PLAYERROUND_PRIMARY, new TableField[] { Playerround.PLAYERROUND.ID }, true);
    public static final ForeignKey<QuestionRecord, ScenarioRecord> FK_QUESTION_SCENARIO1 = Internal.createForeignKey(Question.QUESTION, DSL.name("fk_question_scenario1"), new TableField[] { Question.QUESTION.SCENARIO_ID }, Keys.KEY_SCENARIO_PRIMARY, new TableField[] { Scenario.SCENARIO.ID }, true);
    public static final ForeignKey<QuestionitemRecord, QuestionRecord> FK_QUESTIONITEM_QUESTION1 = Internal.createForeignKey(Questionitem.QUESTIONITEM, DSL.name("fk_questionitem_question1"), new TableField[] { Questionitem.QUESTIONITEM.QUESTION_ID }, Keys.KEY_QUESTION_PRIMARY, new TableField[] { Question.QUESTION.ID }, true);
    public static final ForeignKey<QuestionscoreRecord, PlayerroundRecord> FK_QUESTIONSCORE_PLAYERROUND1 = Internal.createForeignKey(Questionscore.QUESTIONSCORE, DSL.name("fk_questionscore_playerround1"), new TableField[] { Questionscore.QUESTIONSCORE.PLAYERROUND_ID }, Keys.KEY_PLAYERROUND_PRIMARY, new TableField[] { Playerround.PLAYERROUND.ID }, true);
    public static final ForeignKey<QuestionscoreRecord, QuestionRecord> FK_QUESTIONSCORE_QUESTION1 = Internal.createForeignKey(Questionscore.QUESTIONSCORE, DSL.name("fk_questionscore_question1"), new TableField[] { Questionscore.QUESTIONSCORE.QUESTION_ID }, Keys.KEY_QUESTION_PRIMARY, new TableField[] { Question.QUESTION.ID }, true);
    public static final ForeignKey<ScenarioRecord, GameversionRecord> FK_SCENARIO_GAMEVERSION1 = Internal.createForeignKey(Scenario.SCENARIO, DSL.name("fk_scenario_gameversion1"), new TableField[] { Scenario.SCENARIO.GAMEVERSION_ID }, Keys.KEY_GAMEVERSION_PRIMARY, new TableField[] { Gameversion.GAMEVERSION.ID }, true);
    public static final ForeignKey<ScenarioRecord, ScenarioparametersRecord> FK_SCENARIO_SCENARIOPARAMETERS1 = Internal.createForeignKey(Scenario.SCENARIO, DSL.name("fk_scenario_scenarioparameters1"), new TableField[] { Scenario.SCENARIO.SCENARIOPARAMETERS_ID }, Keys.KEY_SCENARIOPARAMETERS_PRIMARY, new TableField[] { Scenarioparameters.SCENARIOPARAMETERS.ID }, true);
    public static final ForeignKey<ScenarioparametersRecord, LanguageRecord> FK_SCENARIOPARAMETERS_LANGUAGE1 = Internal.createForeignKey(Scenarioparameters.SCENARIOPARAMETERS, DSL.name("fk_scenarioparameters_language1"), new TableField[] { Scenarioparameters.SCENARIOPARAMETERS.DEFAULT_LANGUAGE_ID }, Keys.KEY_LANGUAGE_PRIMARY, new TableField[] { Language.LANGUAGE.ID }, true);
    public static final ForeignKey<TaxRecord, CommunityRecord> FK_TAX_COMMUNITY1 = Internal.createForeignKey(Tax.TAX, DSL.name("fk_tax_community1"), new TableField[] { Tax.TAX.COMMUNITY_ID }, Keys.KEY_COMMUNITY_PRIMARY, new TableField[] { Community.COMMUNITY.ID }, true);
    public static final ForeignKey<WelfaretypeRecord, ScenarioRecord> FK_WELFARETYPE_SCENARIO1 = Internal.createForeignKey(Welfaretype.WELFARETYPE, DSL.name("fk_welfaretype_scenario1"), new TableField[] { Welfaretype.WELFARETYPE.SCENARIO_ID }, Keys.KEY_SCENARIO_PRIMARY, new TableField[] { Scenario.SCENARIO.ID }, true);
}
