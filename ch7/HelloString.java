package gr.aueb.cl.ch7;

public class HelloString {

    public static void main(String[] args) {
        char[] paris = {'P', 'a', 'r', 'i', 's'};
        String alice = "Alice";
        String bob = new String("Bob");

        System.out.println(alice + " " + bob + " " + paris);
        System.out.printf("%s %s", alice, bob);
        System.out.println("Total length " + alice.length());
    }
}
