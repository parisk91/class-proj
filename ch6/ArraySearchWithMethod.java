package gr.aueb.cl.ch6;

/**
 * Searches for a specific element value
 * in an array using a method
 */
public class ArraySearchWithMethod {

    public static void main(String[] args) {

    }

    /**
     * Returns the position of the element if found,
     * -1 otherwise
     * @param arr       the input array
     * @param value     the element value to find
     * @return          the position of the element in the array,
     * -1 otherwise
     */
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }
}
