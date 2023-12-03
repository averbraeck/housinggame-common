package nl.tudelft.simulation.housinggame.common;

/**
 * GroupState.java.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public enum RoundState
{
    /** Logged in, GroupRecord created, waiting for sufficient players to log in. */
    LOGIN(10),

    /** Sufficient players logged in, allow players to look at their budget. */
    NEW_ROUND(20),

    /** Allow players to read the news. */
    ANNOUNCE_NEWS(30),

    /** Show the available houses to the players, decide on selling house or staying (from round 2 onward). */
    ALLOW_SELLING(40),

    /** Show the available houses to the player, decide on buying house. */
    ALLOW_BUYING(50),

    /** When all players have sold/bought their houses, taxes can be calculated. Show the calculated taxes. */
    CALCULATE_TAXES(60),

    /** Allow the players to view and buy the improvements. */
    ALLOW_IMPROVEMENTS(70),

    /** Open the survey questions. */
    SHOW_SURVEY(80),

    /** When all players have completed the survey, the dice roll results can be entered; players can view damage. */
    ROLL_DICE(90),

    /** Open the summary view for the players. */
    SHOW_SUMMARY(100);

    /** After this, next round (if available) can be clicked, which moves the state to SHOW_BUDGET. */

    public final int nr;

    private RoundState(final int nr)
    {
        this.nr = nr;
    }

    public boolean lt(final RoundState state)
    {
        return this.nr < state.nr;
    }

    public boolean le(final RoundState state)
    {
        return this.nr <= state.nr;
    }

    public boolean eq(final RoundState state)
    {
        return this.nr == state.nr;
    }

    public boolean ne(final RoundState state)
    {
        return this.nr != state.nr;
    }

    public boolean ge(final RoundState state)
    {
        return this.nr >= state.nr;
    }

    public boolean gt(final RoundState state)
    {
        return this.nr > state.nr;
    }

    public static boolean lt(final String state1, final String state2)
    {
        return RoundState.valueOf(state1).lt(RoundState.valueOf(state2));
    }

    public static boolean le(final String state1, final String state2)
    {
        return RoundState.valueOf(state1).le(RoundState.valueOf(state2));
    }

    public static boolean eq(final String state1, final String state2)
    {
        return RoundState.valueOf(state1).eq(RoundState.valueOf(state2));
    }

    public static boolean ne(final String state1, final String state2)
    {
        return RoundState.valueOf(state1).ne(RoundState.valueOf(state2));
    }

    public static boolean ge(final String state1, final String state2)
    {
        return RoundState.valueOf(state1).ge(RoundState.valueOf(state2));
    }

    public static boolean gt(final String state1, final String state2)
    {
        return RoundState.valueOf(state1).gt(RoundState.valueOf(state2));
    }

    public boolean equals(final String state)
    {
        return this.name().equals(state);
    }
}
