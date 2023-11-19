package nl.tudelft.simulation.housinggame.common;

/**
 * PlayerState.java.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public enum PlayerState
{
    INIT(1),
    READ_NEWS(2),
    CHECK_HOUSE(3),
    HOUSE(4),
    BOUGHT_HOUSE(5),
    MOVED_IN(6),
    BOUGHT_MEASURES(7),
    SURVEY(8),
    DAMAGE(9);

    public final int nr;

    private PlayerState(final int nr)
    {
        this.nr = nr;
    }
}
