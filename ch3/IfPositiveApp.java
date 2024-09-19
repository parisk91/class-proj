package gr.aueb.cl.ch3;

import java.util.Scanner;

public class IfPositiveApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter number");
        num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("Positive");
        } else System.out.println("Negative");
    }
}
