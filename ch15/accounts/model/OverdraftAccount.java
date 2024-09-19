package gr.aueb.cl.ch15.accounts.model;

import gr.aueb.cl.ch15.accounts.exceptions.SssnNotValidException;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {

    }

    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws SssnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SssnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);
        } catch (SssnNotValidException e) {
            System.out.println("Error " + e.getMessage());
            throw e;
        }
    }
}
