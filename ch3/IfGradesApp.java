package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Ελέ
 */
public class IfGradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please insert Grade");
        grade = scanner.nextInt();

        if (grade >= 8) {
            System.out.println("Excellent");
        } else if ( grade >= 6) {
            System.out.println("Very Good");
        } else if (grade >= 4) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
