package gr.aueb.cl.ch15.accounts.exceptions;

public class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 15467L;

    //default constructor
    public NegativeAmountException() {
        super("Amount insufficient");
    }

    //υπερφορτωμένος
    public NegativeAmountException(double amount) {
        super("Amount " + amount + "is not sufficient");
    }
}
