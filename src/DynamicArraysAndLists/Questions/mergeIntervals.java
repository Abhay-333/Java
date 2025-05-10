package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class mergeIntervals {
    public static int[][] bruteForce(int arr[][]) {
        for (int[] newArr : arr) {
            Arrays.sort(newArr);
            System.out.println(Arrays.toString(newArr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        System.out.print(Arrays.deepToString(bruteForce(arr)));
    }

}
