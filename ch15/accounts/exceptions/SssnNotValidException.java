package gr.aueb.cl.ch15.accounts.exceptions;

public class SssnNotValidException extends  Exception{

    private static final long serialVersionUID = 1L;

    public SssnNotValidException(String ssn) {
        super("Ssn " + ssn + " not valid");
    }
}
