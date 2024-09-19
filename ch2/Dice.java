package gr.aueb.cl.ch2;

/**
 * Εμφανίζει τυχαίες τιμές από ζάρι
 */

public class Dice {
    public static void main(String[] args) {

        int die = (int) (Math.random()*6) + 1;

        System.out.println("Ζάρι\t" + die);
    }
}
