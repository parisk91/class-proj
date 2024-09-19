package gr.aueb.cl.ch6;

public class ReducingApp {

    public static void main(String[] args) {


    }

    /**
     * Returns the sum ofall elements
     *
     * @param arr the source array
     * @return
     */
    public static int getTotal(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        return total;
    }

    public static double getAverage(int[] arr) {
        if (arr == null) return 0.0;
        if (arr.length == 0) return 0.0;
        int total = 0;
        double average = 0.0;
        for (int item : arr) {
            total += item;
        }

        average = (double) total / arr.length;

        return average;
    }
}
