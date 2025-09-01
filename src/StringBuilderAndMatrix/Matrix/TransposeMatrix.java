package StringBuilderAndMatrix.Matrix;

import java.util.Arrays;

public class TransposeMatrix {

    public static int[][] bruteForce(int matrix[][]) {
        // Time Complexity: O(m*n)
        // Space Complexity: O(m*n)
        int rows = matrix.length, columns = matrix[0].length;
        int transpose[][] = new int[columns][rows];

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        return transpose;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(bruteForce(matrix));
    }
}
