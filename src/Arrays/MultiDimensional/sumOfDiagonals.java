package Arrays.MultiDimensional;

public class sumOfDiagonals {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumOfLeftDiagonal = 0, sumOfRightDiagonal = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (i == j) {
                    sumOfLeftDiagonal += arr[i][j];
                }

                if (i + j == arr.length-1) {
                    sumOfRightDiagonal += arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sumOfLeftDiagonal);
        System.out.println(sumOfRightDiagonal);
    }
}
