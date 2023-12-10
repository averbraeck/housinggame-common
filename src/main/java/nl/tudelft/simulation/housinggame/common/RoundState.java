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
    /** Logged in, GroupRecord created, waiting for sufficient number of players to log in. */
    LOGIN(10),

    /** Sufficient number of players logged in, allow players to look at their budget. */
    NEW_ROUND(20),

    /** Allow players to read the news. */
    ANNOUNCE_NEWS(30),

    /** Show available houses to players for selling (rounds 2 and up). */
    SHOW_HOUSES_SELL(40),

    /** Enabled the decision on selling house or staying (from round 2 onward). */
    ALLOW_SELLING(50),

    /** Show available houses to players for buying. */
    SHOW_HOUSES_BUY(60),

    /** Enabled the decision which house to buy (only for players who do not own a house). */
    ALLOW_BUYING(70),

    /** Indicate that buying is finished, all active players own a house. */
    BUYING_FINISHED(80),

    /** Allow the players to view and buy the improvements. */
    ALLOW_IMPROVEMENTS(90),

    /** Open the survey questions. */
    SHOW_SURVEY(100),

    /** Sufficient number of players have completed the survey. Close the survey to allow dice rolling. */
    SURVEY_COMPLETED(110),

    /** When all players have completed the survey, the dice rolls can be entered; players can view damage. */
    ROLLED_DICE(120),

    /** Open the summary view for the players. */
    SHOW_SUMMARY(130);

    /** After this, next round (if available) can be clicked, which moves the state to NEW_ROUND. */

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

    public boolean lt(final String state)
    {
        try
        {
            return this.nr < valueOf(state).nr;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean le(final String state)
    {
        try
        {
            return this.nr <= valueOf(state).nr;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean eq(final String state)
    {
        try
        {
            return this.nr == valueOf(state).nr;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean ne(final String state)
    {
        try
        {
            return this.nr != valueOf(state).nr;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean ge(final String state)
    {
        try
        {
            return this.nr >= valueOf(state).nr;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean gt(final String state)
    {
        try
        {
            return this.nr > valueOf(state).nr;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean equals(final String state)
    {
        return this.name().equals(state);
    }

}
