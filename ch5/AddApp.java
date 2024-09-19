package gr.aueb.cl.ch5;

public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a, b); // το πλήρες όνομα είναι κανονικά AddApp.add(a, b)
        //δεν το χηριμοποιούμε εδώ επειδή είμαστε μέσα στην κλάση, αν την
        //καλούσαμε σε άλλη κλάση θα έπρεπε έτσι AddApp.add(a, b)

        System.out.printf("%d + %d = %d", a, b, result);

    }

    /** Returns the sum of two integers
     *
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {

        //Δήλωσ και αρχικοποίηση
        int sum = 0;

        //Εντολές
        sum = a  +b;

        //Επιστροφή αποτελέσματος
        return sum;

    }
}
