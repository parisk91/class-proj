package gr.aueb.cl.ch4;

/**
 * Υπολογίζει το άθροισμα και γινόμενο 1-10
 */
public class ForMulSumApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i =1; i<=10; i++) {
            sum = sum +i; // sum += i
            mul = mul*i; // mul *= i

        }

        System.out.printf("Sum: %d , Mul: %d", sum, mul);
    }
}
