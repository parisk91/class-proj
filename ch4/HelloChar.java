package gr.aueb.cl.ch4;

/**
 * Demonstration. Declare, init chars
 */
public class HelloChar {

    public static void main(String[] args) {
        char star = '*';
        char alpha = 'a';
        char upperAlpha = 'A';
        char dot = '.';
        final char EMPTY_SPACE = ' ';
        int hash = '#';

        System.out.print(star);
        System.out.println(alpha);
        System.out.println("Hash:" + hash);

        if (alpha > upperAlpha) {
            System.out.println("a is greater (greater ordinal) than" + upperAlpha);
        } else {
            System.out.println("A is greater than a");
        }

    }
}
