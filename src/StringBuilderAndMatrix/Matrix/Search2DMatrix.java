package StringBuilderAndMatrix.Matrix;

public class Search2DMatrix {
    public static boolean bruteForce(int matrix[][], int target) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0, end = matrix[i].length - 1;
            for (int j = 0; j < matrix[i].length; j++) {
                int mid = (start + end) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        System.out.println(bruteForce(matrix, target));
    }
}
