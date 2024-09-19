package gr.aueb.cl.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Διαβάζει ακεραίους από .txt και εκτυπώνει
 * το Μ.Ο. σε άλλο .txt που δημιουργεί
 *
 * @author paris
 */
public class IOIntDemo {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/Users/paris/OneDrive/Υπολογιστής/Coding Factory/1. Java/8η εβδομάδα/insert.txt.txt"));
        PrintStream ps = new PrintStream("C:/Users/paris/OneDrive/Υπολογιστής/Coding Factory/1. Java/8η εβδομάδα/output.txt.txt");

        String token;
        int num = 0, sum = 0, count = 0;
        double average = 0.0;

        while (sc.hasNext()) {
            token = sc.next();
            if (isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum+=num;
            }
        }

        average = (double) sum / count;
        ps.printf("Άθροισμα: %d", sum);
        ps.printf("M.O. :%.2f", average);
        System.out.println("Ολοκλήρωση");


    }

    public static boolean isInt(String tok) {
        try {
            Integer.parseInt(tok);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
