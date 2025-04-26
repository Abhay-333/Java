package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class removeDuplicatesFromSortedArray {
    public static int[] optimisedCode1(int arr[]) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int i = 0, j = i + 1, counter = 0;
        while (j < arr.length) {
            if (arr[j] != arr[i]) {
                counter++;
                arr[++i] = arr[j++];
            } else {
                j++;
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int bruteForce(int arr[]) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        int i = 1, size = arr.length, counter = 0;
        while (i < size) {
            if (arr[i] == arr[i - 1]) {
                counter++;
                for (int j = i + 1; j < size; j++) {
                    arr[j - 1] = arr[j];
                }
                size--;
            } else {
                i++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        optimisedCode1(arr);
        bruteForce(arr);
    }
}
