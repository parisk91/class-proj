package gr.aueb.cl.ch6;

public class TwoDimArray {

    public static void main(String[] args) {
        int[][] grid = new int [3][4];
        int[][] arr = { {1,2},
                        {3,4},
                        {5,6}
        }; // αρχικοποίηση πίνακα

        //Jagged Arrays
        int [][] jagged = new int[3][];
        jagged[0] = new int[4];
        jagged[1] = new int[10];
        jagged[2] = new int[20];

        grid[0][0] = 5;
        grid[2][3] = 10;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; i++) {
                System.out.println(grid[i][j] + " ");
            }
        }

        for (int[] row : jagged) {
            for (int num : row) {
                System.out.print(num + " ");
            }
        }

    }
}
