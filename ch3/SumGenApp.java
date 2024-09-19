package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Το n το δίνει ο χρήστης
 */
public class SumGenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endvalue = 0;
        int i =1;
        int result = 0;

        System.out.println("Insert num");
        endvalue = scanner.nextInt();

        while (i<= endvalue) {
            result +=i;
            i++;
        }

        System.out.println("Sum = " + result);
    }
}
