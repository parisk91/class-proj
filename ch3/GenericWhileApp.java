package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει αρχική τιμή, τελική τιμή,
 * και βήμα αύξησης (step) και υπολογίζει τον
 * αριθμό των επαναλήψεων
 */
public class GenericWhileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;
        int j = 1;

        while (j<=3) {



        System.out.println("insert begin value, end value, step");
        start = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();
        iterations = 0;

        while (start <= endValue) {
            iterations ++;
            start+=step;
        }
        System.out.println("Αποτέλεσμα" + iterations);
        j++;

        }
    }
}
