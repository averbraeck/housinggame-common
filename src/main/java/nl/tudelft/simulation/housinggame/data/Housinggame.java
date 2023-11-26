/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data;


import java.util.Arrays;
import java.util.List;

import nl.tudelft.simulation.housinggame.data.tables.Community;
import nl.tudelft.simulation.housinggame.data.tables.Gamesession;
import nl.tudelft.simulation.housinggame.data.tables.Gameversion;
import nl.tudelft.simulation.housinggame.data.tables.Group;
import nl.tudelft.simulation.housinggame.data.tables.Groupround;
import nl.tudelft.simulation.housinggame.data.tables.House;
import nl.tudelft.simulation.housinggame.data.tables.Houseround;
import nl.tudelft.simulation.housinggame.data.tables.Initialhousemeasure;
import nl.tudelft.simulation.housinggame.data.tables.Label;
import nl.tudelft.simulation.housinggame.data.tables.Language;
import nl.tudelft.simulation.housinggame.data.tables.Languagegroup;
import nl.tudelft.simulation.housinggame.data.tables.Measure;
import nl.tudelft.simulation.housinggame.data.tables.Measuretype;
import nl.tudelft.simulation.housinggame.data.tables.Newseffects;
import nl.tudelft.simulation.housinggame.data.tables.Newsitem;
import nl.tudelft.simulation.housinggame.data.tables.Player;
import nl.tudelft.simulation.housinggame.data.tables.Playerround;
import nl.tudelft.simulation.housinggame.data.tables.Question;
import nl.tudelft.simulation.housinggame.data.tables.Questionscore;
import nl.tudelft.simulation.housinggame.data.tables.Scenario;
import nl.tudelft.simulation.housinggame.data.tables.Scenarioparameters;
import nl.tudelft.simulation.housinggame.data.tables.Tax;
import nl.tudelft.simulation.housinggame.data.tables.User;
import nl.tudelft.simulation.housinggame.data.tables.Welfaretype;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Housinggame extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>housinggame</code>
     */
    public static final Housinggame HOUSINGGAME = new Housinggame();

    /**
     * The table <code>housinggame.community</code>.
     */
    public final Community COMMUNITY = Community.COMMUNITY;

    /**
     * The table <code>housinggame.gamesession</code>.
     */
    public final Gamesession GAMESESSION = Gamesession.GAMESESSION;

    /**
     * The table <code>housinggame.gameversion</code>.
     */
    public final Gameversion GAMEVERSION = Gameversion.GAMEVERSION;

    /**
     * The table <code>housinggame.group</code>.
     */
    public final Group GROUP = Group.GROUP;

    /**
     * The table <code>housinggame.groupround</code>.
     */
    public final Groupround GROUPROUND = Groupround.GROUPROUND;

    /**
     * The table <code>housinggame.house</code>.
     */
    public final House HOUSE = House.HOUSE;

    /**
     * The table <code>housinggame.houseround</code>.
     */
    public final Houseround HOUSEROUND = Houseround.HOUSEROUND;

    /**
     * The table <code>housinggame.initialhousemeasure</code>.
     */
    public final Initialhousemeasure INITIALHOUSEMEASURE = Initialhousemeasure.INITIALHOUSEMEASURE;

    /**
     * The table <code>housinggame.label</code>.
     */
    public final Label LABEL = Label.LABEL;

    /**
     * The table <code>housinggame.language</code>.
     */
    public final Language LANGUAGE = Language.LANGUAGE;

    /**
     * The table <code>housinggame.languagegroup</code>.
     */
    public final Languagegroup LANGUAGEGROUP = Languagegroup.LANGUAGEGROUP;

    /**
     * The table <code>housinggame.measure</code>.
     */
    public final Measure MEASURE = Measure.MEASURE;

    /**
     * The table <code>housinggame.measuretype</code>.
     */
    public final Measuretype MEASURETYPE = Measuretype.MEASURETYPE;

    /**
     * The table <code>housinggame.newseffects</code>.
     */
    public final Newseffects NEWSEFFECTS = Newseffects.NEWSEFFECTS;

    /**
     * The table <code>housinggame.newsitem</code>.
     */
    public final Newsitem NEWSITEM = Newsitem.NEWSITEM;

    /**
     * The table <code>housinggame.player</code>.
     */
    public final Player PLAYER = Player.PLAYER;

    /**
     * The table <code>housinggame.playerround</code>.
     */
    public final Playerround PLAYERROUND = Playerround.PLAYERROUND;

    /**
     * The table <code>housinggame.question</code>.
     */
    public final Question QUESTION = Question.QUESTION;

    /**
     * The table <code>housinggame.questionscore</code>.
     */
    public final Questionscore QUESTIONSCORE = Questionscore.QUESTIONSCORE;

    /**
     * The table <code>housinggame.scenario</code>.
     */
    public final Scenario SCENARIO = Scenario.SCENARIO;

    /**
     * The table <code>housinggame.scenarioparameters</code>.
     */
    public final Scenarioparameters SCENARIOPARAMETERS = Scenarioparameters.SCENARIOPARAMETERS;

    /**
     * The table <code>housinggame.tax</code>.
     */
    public final Tax TAX = Tax.TAX;

    /**
     * The table <code>housinggame.user</code>.
     */
    public final User USER = User.USER;

    /**
     * The table <code>housinggame.welfaretype</code>.
     */
    public final Welfaretype WELFARETYPE = Welfaretype.WELFARETYPE;

    /**
     * No further instances allowed
     */
    private Housinggame() {
        super("housinggame", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Community.COMMUNITY,
            Gamesession.GAMESESSION,
            Gameversion.GAMEVERSION,
            Group.GROUP,
            Groupround.GROUPROUND,
            House.HOUSE,
            Houseround.HOUSEROUND,
            Initialhousemeasure.INITIALHOUSEMEASURE,
            Label.LABEL,
            Language.LANGUAGE,
            Languagegroup.LANGUAGEGROUP,
            Measure.MEASURE,
            Measuretype.MEASURETYPE,
            Newseffects.NEWSEFFECTS,
            Newsitem.NEWSITEM,
            Player.PLAYER,
            Playerround.PLAYERROUND,
            Question.QUESTION,
            Questionscore.QUESTIONSCORE,
            Scenario.SCENARIO,
            Scenarioparameters.SCENARIOPARAMETERS,
            Tax.TAX,
            User.USER,
            Welfaretype.WELFARETYPE
        );
    }
}
