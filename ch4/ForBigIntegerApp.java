package gr.aueb.cl.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Χρησιμοποιεί την κλάση BigInteger
 */
public class ForBigIntegerApp {

    public static void main(String[] args) {
        int a = 0;
        int n = 0;
        BigInteger result = BigInteger.ONE;

        System.out.print("Please insert a, n\n");
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        n = scanner.nextInt();

        for ( int i=1 ; i <= n ; i++ ) {
            result = result.multiply(BigInteger.valueOf(a)); // όχι εδώ * επειδή έχω BigInteger

        }

        System.out.printf("%,d", result);
    }


}
