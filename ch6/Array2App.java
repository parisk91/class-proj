package gr.aueb.cl.ch6;

/**
 * Unsized initialization
 */
public class Array2App {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
