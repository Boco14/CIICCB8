package my_activities.multi_arrays;

public class TwoDimension {
    public static void main(String[] args) {
        // 1D array
        int[] oneD = {10, 20, 30};
        System.out.println("1D Array:");
        for (int n : oneD) System.out.print(n + " ");
        System.out.println("\n");

        // 2D array
        int[][] twoD = {
                {1, 2},
                {3, 4}
        };
        System.out.println("2D Array:");
        for (int[] row : twoD) {
            for (int n : row) System.out.print(n + " ");
            System.out.println();
        }
        System.out.println();

        // 3D array
        int[][][] threeD = {
                {
                        {1, 2}, {3, 4}
                },
                {
                        {5, 6}, {7, 8}
                }
        };
        System.out.println("3D Array:");
        for (int[][] matrix : threeD) {
            for (int[] row : matrix) {
                for (int n : row) System.out.print(n + " ");
                System.out.println();
            }
            System.out.println("---");
    }
}}
