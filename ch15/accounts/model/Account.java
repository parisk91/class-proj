package gr.aueb.cl.ch15.accounts.model;

import gr.aueb.cl.ch15.accounts.exceptions.InsufficientBalanceException;
import gr.aueb.cl.ch15.accounts.exceptions.NegativeAmountException;
import gr.aueb.cl.ch15.accounts.exceptions.SssnNotValidException;

public class Account extends IdentifiableEntity{
    private String iban;
    private User holder;
    private double balance;

    public Account() {

    }

    public Account(String iban, User holder, double balance) {
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return holder;
    }
    public void setHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    /*
     * Public API
     */

    /**
     *
     * @param amount
     * @throws NegativeAmountException
     *                  if the amount is negative
     */

    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException();
            }
            balance += amount;
        } catch (NegativeAmountException e) {
            System.out.println("Negative amount exception");
        }
    }

    public void withdraw(double amount, String ssn) throws  InsufficientBalanceException, SssnNotValidException{
        try {
            if (!isSsnValid(ssn)) {
                throw new SssnNotValidException(ssn);
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            balance -= amount;
        } catch (InsufficientBalanceException | SssnNotValidException e) {
            System.out.println("Error " + e.getMessage());
            throw e;
        }
    }

    public double getAccountBalance() {
        return balance;
    }

    protected boolean isSsnValid(String ssn) {
        if (ssn == null || getHolder().getSsn() == null) return false;

        return getHolder().getSsn().equals(ssn);
    }
}
