package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] bruteForce(int arr[]) {
        int ans[] = new int[arr.length * 2];

        for (int i = 0, j = 0; i < ans.length; i++) {
            if (j == arr.length) {
                j = 0;
                ans[i] = arr[j];
            } else {
                ans[i] = arr[j];
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        System.out.print(Arrays.toString(bruteForce(arr)));
    }
}
