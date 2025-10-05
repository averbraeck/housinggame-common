package nl.tudelft.simulation.housinggame.common;

/**
 * HtmlUtils.java.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public class HtmlUtils
{

    public static String plusmin(final int n)
    {
        if (n >= 0)
            return "+" + String.valueOf(n);
        return "&minus;" + String.valueOf(Math.abs(n));
    }

    public static String plusmin0(final int n)
    {
        if (n > 0)
            return "+" + String.valueOf(n);
        else if (n == 0)
            return "0";
        return "&minus;" + String.valueOf(Math.abs(n));
    }

}
