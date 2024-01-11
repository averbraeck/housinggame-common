package nl.tudelft.simulation.housinggame.common;

/**
 * TransactionStatus.java.
 * <p>
 * Copyright (c) 2020-2020 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://opentrafficsim.org/docs/current/license.html">OpenTrafficSim License</a>.
 * </p>
 * @author <a href="https://www.tudelft.nl/averbraeck">Alexander Verbraeck</a>
 */
public class TransactionStatus
{
    public static final String UNAPPROVED_BUY = "UNAPPROVED_BUY";

    public static final String APPROVED_BUY = "APPROVED_BUY";

    public static final String REJECTED_BUY = "REJECTED_BUY";

    public static final String UNAPPROVED_SELL = "UNAPPROVED_SELL";

    public static final String APPROVED_SELL = "APPROVED_SELL";

    public static final String REJECTED_SELL = "REJECTED_SELL";

    public static final String UNAPPROVED_STAY = "UNAPPROVED_STAY";

    public static final String APPROVED_STAY = "APPROVED_STAY";

    public static final String REJECTED_STAY = "REJECTED_STAY";

    public static boolean isBuy(final String status)
    {
        return status.equals(UNAPPROVED_BUY) || status.equals(APPROVED_BUY) || status.equals(REJECTED_BUY);
    }

    public static boolean isSell(final String status)
    {
        return status.equals(UNAPPROVED_SELL) || status.equals(APPROVED_SELL) || status.equals(REJECTED_SELL);
    }

    public static boolean isStay(final String status)
    {
        return status.equals(UNAPPROVED_STAY) || status.equals(APPROVED_STAY) || status.equals(REJECTED_STAY);
    }

    public static boolean isApproved(final String status)
    {
        return status.equals(APPROVED_BUY) || status.equals(APPROVED_SELL) || status.equals(APPROVED_STAY);
    }

    public static boolean isUnapproved(final String status)
    {
        return status.equals(UNAPPROVED_BUY) || status.equals(UNAPPROVED_SELL) || status.equals(UNAPPROVED_STAY);
    }

    public static boolean isRejected(final String status)
    {
        return status.equals(REJECTED_BUY) || status.equals(REJECTED_SELL) || status.equals(REJECTED_STAY);
    }

    public static String[] values()
    {
        return new String[] {UNAPPROVED_BUY, APPROVED_BUY, REJECTED_BUY, UNAPPROVED_SELL, APPROVED_SELL, REJECTED_SELL,
                UNAPPROVED_STAY, APPROVED_STAY, REJECTED_STAY};
    }
}
