package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το 1*2*...*n
 */
public class MulGenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endValue = 0;
        int i=1;
        int result=1;

        System.out.println("give n");
        endValue = scanner.nextInt();

        while (i<=endValue) {
            result *=i;
            i++;
        }
        System.out.printf("Mul = %,d", result);

    }
}
