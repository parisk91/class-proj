package gr.aueb.cl.ch6;

/**
 * Filtering Demo
 */
public class Filtering {

    public static void main(String[] args) {
        int[] grades = {4, 2, 6, 9, 10, 1, 1, 3, 5};
        final int PASS_LIMIT = 5;

        int[] passed = getPassGrades(grades, PASS_LIMIT);
        for (int pass : passed) {
            System.out.println(pass + "");
        }



    }

    /**
     * Returns a new array that contains the
     * pass grades of the source array
     *
     * @param grades the source of array.
     * @param limit the threshold over which the pass grades
     *              are compared to.
     * @return
     */
    public static int[] getPassGrades(int[] grades, int limit) {
        int count = 0;
        if (grades == null) return null;
        for (int grade:grades) {
            if (grade >= limit) {
                count++;
            }
        }

        int[] passOut = new int[count];
        int pivot = -1; //int pivot=0
        for (int grade : grades) {
            if (grade>=limit) {
                //pivot++
                passOut[++pivot] = grade; // passOut[pivot++] = grade
            }
        }
        return passOut;
    }

}
