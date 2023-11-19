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
    INIT(1),
    ANNOUNCE_NEWS(2),
    HOUSE_BUY(3),
    CALCULATE_TAXES(4),
    SHOW_MEASURES(5),
    ALLOW_MEASURES(6),
    SURVEY(7),
    ROLL_DICE(8),
    DAMAGE(9);

    public final int nr;

    private GroupState(final int nr)
    {
        this.nr = nr;
    }

}
