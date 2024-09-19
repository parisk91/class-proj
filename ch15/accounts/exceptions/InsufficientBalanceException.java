package gr.aueb.cl.ch15.accounts.exceptions;

public class InsufficientBalanceException extends Exception{
    public static final long serialVersionID = 1L;

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance " + balance + " for amount" + amount);
    }
}
