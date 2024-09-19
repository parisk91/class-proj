package gr.aueb.cl.ch17;

public class Main {

    public static void main(String[] args) {
        Book bookNetworks = new Book.Builder(1, "12345").build();

        Book bookJava = new Book.Builder(2, "123456")
                .author("Alice W.")
                .title("Java in Action")
                .build();//επιστρέφει το instance

        // bookNetworks = new Book.Builder(2, "345678").build();

        System.out.println(bookNetworks);
        System.out.println(bookJava);
    }
}