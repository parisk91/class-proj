package gr.aueb.cl.ch5;

import java.util.Scanner;

/**
 * Power a^n Demo
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 0;

        System.out.println("Please insert base and power");
        a = scanner.nextInt();
        n = scanner.nextInt();

        result = pow(a , n);

        System.out.printf("%d ^ %d = %d", a, n, result);

    }


    /**
     * returns the result of a^n
     *
     * @param a     the base.
     * @param n     the power.
     * @return      the result
     */
    public static int pow(int a, int n) {
        int result = 1;

        for (int i = 1; i<= n; i++){
            result = result * a; //result *= a
        }

        return result;
    }
}
