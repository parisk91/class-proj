package gr.aueb.cl.ch15.accounts.model;

import gr.aueb.cl.ch15.accounts.exceptions.InsufficientBalanceException;
import gr.aueb.cl.ch15.accounts.exceptions.NegativeAmountException;
import gr.aueb.cl.ch15.accounts.exceptions.SssnNotValidException;

public class JointAccount extends IdentifiableEntity{
    private Account account;
    private User secondHolder;

    public JointAccount() {

    }

    public JointAccount(Account account, User secondHolder) {
        this.account = account;
        this.secondHolder = secondHolder;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public User getSecondHolder() {
        return secondHolder;
    }

    public void setSecondHolder(User secondHolder) {
        this.secondHolder = secondHolder;
    }

    public void deposit (double amount) throws NegativeAmountException {
        account.deposit(amount);
    }

    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SssnNotValidException {
        if (secondHolder.getSsn().equals(ssn)) {
            account.setHolder(secondHolder);
        }
        account.withdraw(amount, ssn);
    }

    public double getBalance() {
        return account.getAccountBalance()
;    }

}
