package gr.aueb.cl.ch11;

public class AccountApp {
    public static void main(String[] args) {

    Account alice = new Account(1, "GR123", "Alice", "W.", "A103", 1000);
    //ή με setters και getters
        alice.setId(3);
        alice.setIban("GR456");

    try {
        alice.deposit(400.50);
        System.out.println("Successful deposit");

        System.out.println(alice.accountToString());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    }
}
