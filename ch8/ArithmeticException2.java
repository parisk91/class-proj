package gr.aueb.cl.ch8;

import java.util.Scanner;

public class ArithmeticException2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true)
        result = div(5,0);

    }

    public static int div(int numerator, int denominator) { //throws Arithmetic Exception, δεν χρειάζεται επειδή είναι runtime, αλλά βοηθάει στην
        int result = 0;
        try {
            result = numerator / denominator; //arithmetic exception
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }

        return result;
    }
}
