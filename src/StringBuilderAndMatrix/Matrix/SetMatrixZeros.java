package StringBuilderAndMatrix.Matrix;

import java.util.*;

public class SetMatrixZeros {

    public static int[][] optimalSolution(int matrix[][]) {
        // Time Complexity: O(m*n)
        // Space Complexity: O(1)
        boolean rowCheck = false;
        boolean colCheck = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                rowCheck = true;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                colCheck = true;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if (rowCheck) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (colCheck) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        return matrix;
    }

    public static int[][] bruteForce(int matrix[][]) {
        // Time Complexity: O(m*n + k*l) where k = size of rows set and l= size of columns set
        // Space Complexity: O(k+l) where k = size of rows set and l= size of columns set
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }


        for (int row : rows) {
            for (int i = 0; i < matrix[row].length; i++) {
                matrix[row][i] = 0;
            }
        }

        for (int column : columns) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][column] = 0;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
//        int matrix[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int matrix[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

//        System.out.println(Arrays.deepToString(bruteForce(matrix)));
        System.out.println(Arrays.deepToString(optimalSolution(matrix)));
    }
}