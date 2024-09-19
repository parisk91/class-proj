package gr.aueb.cl.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please insert a,b");
        a = BigInteger.valueOf(scanner.nextInt());
        b = BigInteger.valueOf(scanner.nextInt());

        for (int i=1; i<=b.intValue(); i++) {
            result = result.multiply(a);
        }

        System.out.printf("%d^%d = %,d" ,a, b, result);
    }
}
