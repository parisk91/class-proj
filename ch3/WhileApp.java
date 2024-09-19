package gr.aueb.cl.ch3;

import java.util.Scanner;

public class WhileApp {
    public static void main(String[] args) {
        int i=1;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;


        while (i<=10) {
            System.out.println("Hello");
            i++;
        }

        System.out.println("Please insert choice");
        choice = scanner.nextInt();

        while (choice != 5) {
            System.out.println("Blah");
            System.out.println("Please insert choice");
            choice = scanner.nextInt();
        }

        System.out.println("Please insert choice"); // άλλος τρόπος για να μην έχουμε το από πάνω
        while ((choice= scanner.nextInt()) != 5) {
            System.out.println("Hello");

            System.out.println("Please insert choice");
        }



    }
}
