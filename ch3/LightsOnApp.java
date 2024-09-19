package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν θα ανάψει τα φώτα ή όχι
 * με βάση αν βρέχει, αν είναι σκοτεινά
 * και αν η ταχύτητα είναι > 100χλμ/ώρα
 * Τις τιμές τις δίνει ο χρήστης από το stdin
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean isRunning = false;
        boolean lightsOn = false;

        System.out.println("Please insert if it is dark");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert if it is raining");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert car speed");
        speed = scanner.nextInt();

        lightsOn = isRaining && (isDark || (speed > MAX_SPEED));

        System.out.println("Lights on" + lightsOn);





    }
}
