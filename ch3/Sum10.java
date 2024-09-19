package gr.aueb.cl.ch3;

/**
 * Υπολογίζει το 1+2+3+...+9+1,+10
 * με το while do
 */
public class Sum10 {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;

        while (i<=10) {
            result = result + i;
            i++;
        }

        System.out.println("Αποτέλεσμα:\t" + result);

    }
}
