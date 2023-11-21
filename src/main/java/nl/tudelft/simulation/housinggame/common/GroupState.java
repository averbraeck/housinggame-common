package nl.tudelft.simulation.housinggame.common;

/**
 * GroupState.java.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public enum GroupState
{
    /** GroupRound record is created with state INIT as the default. */
    INIT(0),

    /** Logged in, GroupRecord created, waiting for sufficient players to log in. */
    LOGIN(10),

    /** Sufficient players logged in, allow players to look at their budget. */
    NEW_ROUND(20),

    /** Allow players to read the news, show further financial data. */
    ANNOUNCE_NEWS(30),

    /** Show the available houses to the players, where they can check which houses are possible. */
    SHOW_HOUSES(40),

    /** Show the result of buying and selling houses to the player (initiated by the facilitator). */
    ASSIGN_HOUSES(50),

    /** When all players have seen their house buy, taxes can be calculated. Show the calculated taxes. */
    CALCULATE_TAXES(60),

    /** Allow the players to view and buy the improvements. */
    ALLOW_IMPROVEMENTS(70),

    /** Open the survey questions. */
    ASK_PERCEPTIONS(80),

    /** When all players have completed the survey, the dice roll results can be entered. */
    ROLL_DICE(90),

    /** Open the view for the player where they are allowed to see damage results as a result of the dice rolls. */
    SHOW_DAMAGE(100);

    /** After this, next round (if avalable) can be clicked, which moves the state to LOGIN of SHOW_BUDGET. */

    public final int nr;

    private GroupState(final int nr)
    {
        this.nr = nr;
    }

    public boolean lt(final GroupState state)
    {
        return this.nr < state.nr;
    }

    public boolean le(final GroupState state)
    {
        return this.nr <= state.nr;
    }

    public boolean eq(final GroupState state)
    {
        return this.nr == state.nr;
    }

    public boolean ne(final GroupState state)
    {
        return this.nr != state.nr;
    }

    public boolean ge(final GroupState state)
    {
        return this.nr >= state.nr;
    }

    public boolean gt(final GroupState state)
    {
        return this.nr > state.nr;
    }

    public static boolean lt(final String state1, final String state2)
    {
        return GroupState.valueOf(state1).lt(GroupState.valueOf(state2));
    }

    public static boolean le(final String state1, final String state2)
    {
        return GroupState.valueOf(state1).le(GroupState.valueOf(state2));
    }

    public static boolean eq(final String state1, final String state2)
    {
        return GroupState.valueOf(state1).eq(GroupState.valueOf(state2));
    }

    public static boolean ne(final String state1, final String state2)
    {
        return GroupState.valueOf(state1).ne(GroupState.valueOf(state2));
    }

    public static boolean ge(final String state1, final String state2)
    {
        return GroupState.valueOf(state1).ge(GroupState.valueOf(state2));
    }

    public static boolean gt(final String state1, final String state2)
    {
        return GroupState.valueOf(state1).gt(GroupState.valueOf(state2));
    }

}
