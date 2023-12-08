package nl.tudelft.simulation.housinggame.common;

/**
 * PlayerState. The first time the player logs in, the state will be LOGIN (round 0). As soon as the player moves to the state
 * READ_BUDGET, the round is also advanced to 1.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public enum PlayerState
{
    /** Logged in. PlayerRound record has NOT yet been created for the round, waiting for permission to proceed. */
    LOGIN(10),

    /** PlayerRound record for the new round has been created. Player can read their budget. */
    READ_BUDGET(20),

    /** View the news screen. */
    READ_NEWS(30),

    /** View the houses (available in round and owned by other players). */
    VIEW_SELL_HOUSE(40),

    /** Waiting screen after selling the house -- wait till all players are done. */
    SELL_HOUSE_WAIT(50),

    /** Waiting screen after staying in the house -- wait till all players are done. */
    STAY_HOUSE_WAIT(55),

    /** View the houses (available in round and sold by other players); decide on buying a house. */
    VIEW_BUY_HOUSE(60),

    /** Waiting screen after buying the house -- wait till all players are done. */
    BUY_HOUSE_WAIT(70),

    /** Information on the financial and satisfaction status after buying a (new) house. */
    BOUGHT_HOUSE(80),

    /** Information on the financial and satisfaction status after staying in the current house. */
    STAYED_HOUSE(85),

    /** Allow buying and selling of improvements (after taxes have been paid). */
    VIEW_IMPROVEMENTS(90),

    /** Answer the questions of the survey. */
    ANSWER_SURVEY(100),

    /** Survey has been completed. */
    SURVEY_COMPLETED(110),

    /** View the damage and effect on spendable income after the dice rolls. */
    VIEW_DAMAGE(120),

    /** View the summary screen and wait for the facilitator to proceed to the next round (if available). */
    VIEW_SUMMARY(130);

    public final int nr;

    private PlayerState(final int nr)
    {
        this.nr = nr;
    }

    public boolean lt(final PlayerState state)
    {
        return this.nr < state.nr;
    }

    public boolean le(final PlayerState state)
    {
        return this.nr <= state.nr;
    }

    public boolean eq(final PlayerState state)
    {
        return this.nr == state.nr;
    }

    public boolean ne(final PlayerState state)
    {
        return this.nr != state.nr;
    }

    public boolean ge(final PlayerState state)
    {
        return this.nr >= state.nr;
    }

    public boolean gt(final PlayerState state)
    {
        return this.nr > state.nr;
    }

    public static boolean lt(final String state1, final String state2)
    {
        return PlayerState.valueOf(state1).lt(PlayerState.valueOf(state2));
    }

    public static boolean le(final String state1, final String state2)
    {
        return PlayerState.valueOf(state1).le(PlayerState.valueOf(state2));
    }

    public static boolean eq(final String state1, final String state2)
    {
        return PlayerState.valueOf(state1).eq(PlayerState.valueOf(state2));
    }

    public static boolean ne(final String state1, final String state2)
    {
        return PlayerState.valueOf(state1).ne(PlayerState.valueOf(state2));
    }

    public static boolean ge(final String state1, final String state2)
    {
        return PlayerState.valueOf(state1).ge(PlayerState.valueOf(state2));
    }

    public static boolean gt(final String state1, final String state2)
    {
        return PlayerState.valueOf(state1).gt(PlayerState.valueOf(state2));
    }

    public boolean equals(final String state)
    {
        return this.name().equals(state);
    }

}
