package gr.aueb.cl.ch5;

import java.util.Scanner;

public class EvenOrOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean result = false;
        System.out.println("Give n");
        n = scanner.nextInt();
        result = isEven(n);

        if (result) {

            System.out.println("Number: " + n + " is even: " + result);
        } else {
            System.out.println("Number: " + n + " is odd");
        }

    }

    /**
     * Evaluates
     * @param a     the input number
     * @return      true if it is even, false if it is false
     */
    public static boolean isEven (int a) {
        return a % 2 == 0; //boolean expression επιστρέφει στην main
    }
}
