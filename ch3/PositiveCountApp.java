package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Όσο ο χρήστης δίνει θετικούς ακεραίους
 * τους μετράμε μέχρι ο χρήστης να δώσει
 * αρνητικό (sentinel value)
 */
public class PositiveCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int positives = 0;

        System.out.println("give num");
        inputNum = scanner.nextInt();

        while (inputNum>=0) {
            positives++;
            System.out.println("give num");
            inputNum = scanner.nextInt();

        }

        System.out.println("Positives count:" + positives);
    }
}
