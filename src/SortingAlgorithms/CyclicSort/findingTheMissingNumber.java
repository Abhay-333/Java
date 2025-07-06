package SortingAlgorithms.CyclicSort;

import java.util.Arrays;

public class findingTheMissingNumber {
    public static int bruteForce(int arr[]) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        int j = 0;
        while (j < arr.length) {
            if (arr[j] != j) {
                return j;
            }
            j++;
        }

        System.out.println(Arrays.toString(arr));
        return arr.length;
    }

    public static void main(String[] args) {
//        int arr[] = {3, 0, 1};
        int arr[] = {0,1};
//        int arr[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(bruteForce(arr));
    }
}
