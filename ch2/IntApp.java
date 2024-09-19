package gr.aueb.cl.ch2;

/**
 * Demonstrates int data types
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Type: %s, Size: %2d bits, \t Min: %d, Max: %d\n", Integer.TYPE, Integer.BYTES *8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, \tSize: %3d bits\tMin: %d, Max: %d\n", Byte.TYPE, Byte.BYTES *8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %s, \tSize: %8d bits\tMin: %d, Max: %d\n", Short.TYPE, Short.BYTES *8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, \tSize: %04d bits\tMin: %d, Max: %d\n", Long.TYPE, Long.BYTES *8, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
