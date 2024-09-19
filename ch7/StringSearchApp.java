package gr.aueb.cl.ch7;

public class StringSearchApp {

    public static void main(String[] args) {
        String s = "Athens uni of Eco Uni and Bus";

        if (s.contains("Uni")) {
            System.out.println("Bingo");
        }

        int ch = 'a';
        int index = s.indexOf(ch);
        System.out.println(index);

        if (s.startsWith("Athens")) {
            System.out.println("Starts with Athens");
        }

        String athens = s.substring(0, 6);
        System.out.println(athens);
    }
}
