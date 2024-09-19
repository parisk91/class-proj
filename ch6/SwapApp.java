package gr.aueb.cl.ch6;

/**
 * Swap with arrays
 */
public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1,2};
        print(arr);
        System.out.println();

        swap(arr);
        print(arr);
    }

    public static void swap(int[] arr) {
        if (arr == null) return;
        if (arr.length != 2) return;

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }

    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
