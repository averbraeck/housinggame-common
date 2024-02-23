package nl.tudelft.simulation.housinggame.common;

/**
 * HouseGroupStatus.java.
 * <p>
 * Copyright (c) 2020-2024 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public class HouseGroupStatus
{
    public static final String AVAILABLE = "AVAILABLE";

    public static final String OCCUPIED = "OCCUPIED";

    public static final String NOT_AVAILABLE = "NOT_AVAILABLE";

    public static boolean isAvailableOrOccupied(final String status)
    {
        return AVAILABLE.equals(status) || OCCUPIED.equals(status);
    }

    public static boolean isNotAvailable(final String status)
    {
        return NOT_AVAILABLE.equals(status);
    }

    public static boolean isAvailable(final String status)
    {
        return AVAILABLE.equals(status);
    }

    public static boolean isOccupied(final String status)
    {
        return OCCUPIED.equals(status);
    }

    public static String[] values()
    {
        return new String[] {AVAILABLE, OCCUPIED, NOT_AVAILABLE};
    }

}
