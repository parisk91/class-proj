package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει ως είσοδο true/false aπό το stain για δύο δεξαμενές
 * καυσίμων  ενός αεροπλάνου
 */
public class TankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert tank1 status");
        isEmptyTank1 = scanner.nextBoolean();

        System.out.println("Please insert tank1 status");
        isEmptyTank2 = scanner.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange" + isOrange + ", Red" + isRed);

    }
}
