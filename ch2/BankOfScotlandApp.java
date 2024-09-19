package gr.aueb.cl.ch2;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Λαμβάνει από το stdinp έναν ακέραιο που αναπαραστά
 * λίρες Σκοτίας και τις μετατρέπει σε δολάρια και λεπτά USD
 * όπου (1$=100cent)
 * και εκτυπώνει το αποτέλεσμα ως εξής, για παράδειγμα:
 * 10 λίρες Σκοτίας = χχ δολάρια USD και yy cents
 */
public class BankOfScotlandApp {
    public static void main(String[] args) {

    int scottishPounds = 0;
    int usdDollars = 0;
    int usdCents = 0;
    int totalUsdCents=0;
    final int PARITY = 137;
    Scanner scanner = new Scanner(System.in);

    System.out.println("δώσε pounds");
    scottishPounds = scanner.nextInt();

    totalUsdCents = scottishPounds * PARITY;
    usdDollars = totalUsdCents / 100;
    usdCents = totalUsdCents % 100;

    System.out.printf("\u00A3%d Scottish Pounds = \u0024%d USD Dollars and %d USD Cents", scottishPounds , usdDollars, usdCents);


    }

}
