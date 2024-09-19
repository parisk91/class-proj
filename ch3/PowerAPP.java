package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το a^n
 * πχ 3^3 = 27
 */
public class PowerAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 0;

        System.out.println("give base, power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i<=power) {
            result *=base;
            i++;
        }
        System.out.printf("Power of %d ^ %d = %d", base, power, result);

    }
}
