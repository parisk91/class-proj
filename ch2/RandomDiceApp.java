package gr.aueb.cl.ch2;

/**
 * Προσομοιώνουμε δύο ζάρια
 */
public class RandomDiceApp {
    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1; //* (max - min +1) * min
        int die2 = (int) (Math.random() * 6) + 1;

        System.out.println("Die1:\t" + die1 + "\tDie2:\t" + die2);
    }
}
