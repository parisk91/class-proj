package gr.aueb.cl.ch2;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/** Δέχεται temp και αν βρέχει
 * και εμφανίζει αν χιονίζει
 */
public class IsSnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Insert if it is raining");
        isRaining = scanner.nextBoolean();

        System.out.println("Temp");
        temp = scanner.nextInt();

        isSnowing = isRaining && (temp<0);

        System.out.println("Χιονίζει:" + isSnowing);

    }
}
