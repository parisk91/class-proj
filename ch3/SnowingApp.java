package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Διαβάζει μία θερμοκρασία και ένα boolean
 * για το αν βρέχει, από το stdin και
 * αποφασίζει αν χιονίζει
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Insert temp");
        temp = scanner.nextInt();
        System.out.println("is it raining?");
        isRaining = scanner.nextBoolean();

        isSnowing = isRaining && temp < 0;//short-circuit

        System.out.println("Is snowing:" + isSnowing);

    }
}
