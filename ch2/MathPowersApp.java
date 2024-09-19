package gr.aueb.cl.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει έναν ακέραιο από το stdin και
 * τυπώνει το τετράγωνο και το κύβο
 */
public class MathPowersApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num=0;

        System.out.println("δώσε έναν ακέραιο");
        num = scanner.nextInt();

        System.out.printf("num = %d, num^2 = %d, num^3 = %d",
                num, (int) Math.pow(num, 2), (int) Math.pow(num, 3));
    }
}
