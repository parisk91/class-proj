package gr.aueb.cl.ch2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους από το stdin
 * Προσθέτει τους ακεραίους
 * Εκτυπώνει το αποτέλεσμα στην κονσόλα
 */

public class AddApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1=0;
        int num2=0;
        int result=0;

        //Εντολές
        System.out.println("Please insert");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println();
        System.out.printf("Το αποτέλεσμα των %d και %d είναι %d", num1, num2, result );
    }
}
