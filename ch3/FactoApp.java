package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το n!
 */
public class FactoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        int facto = 1;
        int i = 1;

        System.out.println("please insert n");
        n = scanner.nextInt();

        while (i<=n) {
            facto *=i;
            i++;

        }
    System.out.printf("%d! = %d", n, facto);
    }
}
