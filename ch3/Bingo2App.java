package gr.aueb.cl.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει τιμές μέχρι να βρει το
 * secret
 */
public class Bingo2App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int inputNum = 0;
            final int SECRET = 12;
            boolean isBingo = false;

            while (true){

                System.out.println("Insert a num");
                inputNum = scanner.nextInt();

                if (inputNum == SECRET) {
                    System.out.println("BINGO");
                    isBingo=true;
                    break;
                }

                System.out.println("try again");

            }

            System.out.println("thanks for playing BINGO");
        }
}
