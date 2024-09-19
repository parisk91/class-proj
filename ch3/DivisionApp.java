package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει δύο ακεραίους και
 * υπολογίζει το πηλίκο
 */
public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator & denominator");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt(); // Έλεγχος αν είναι 0

            if (numerator != 0) {
                if (denominator !=0) {
                    result = numerator / denominator;
                } else {
                    System.out.println("Zero");
                }
            } else {
                System.out.println("Numerator cannot be zero");
                break;
            }

            System.out.println("Result:" + result);
        }


    }
}
