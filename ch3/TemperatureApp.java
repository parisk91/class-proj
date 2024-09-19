package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Αν η θερμοκρασία είναι < 0
 * τότε η isTempBelowZero γίνεται true
 * αλλιώς false
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("δώσε θερμοκρασία");
        temperature = scanner.nextInt();

        isTempBelowZero = (temperature<0);

        System.out.println("Temp is below zero:" + isTempBelowZero);
    }
}
