package DynamicArraysAndLists.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PivotIndex {
    public static int optimisedCode1(int arr[]) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

//            System.out.print(totalSum + " ");
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static int bruteForce(int arr[]) {
        // Time Complexity: O(n+j+k) => O(n)
        // Space Complexity: O(j + k)
        int pivot = 0, currentSum = arr[0];
        int arrLeft[] = new int[arr.length];
        int arrRight[] = new int[arr.length];

        int i = 1;
        while (i < arrLeft.length) {
            if (arrLeft[0] == 0) {
                arrLeft[0] = arr[0];
            }
            currentSum += arr[i];
            arrLeft[i++] = currentSum;
        }

        int j = arr.length - 2;
        currentSum = arr[arr.length - 1];
        arrRight[arr.length - 1] = currentSum;

        while (j >= 0) {
            currentSum += arr[j];
            arrRight[j--] = currentSum;
        }

        for (int k = 0; k < arr.length; k++) {
            if (arrLeft[k] == arrRight[k]) {
                System.out.print(k + " ");
            }
        }

        System.out.println(Arrays.toString(arrLeft));
        System.out.println(Arrays.toString(arrRight));
        return pivot;
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 3,6,5,6};
//        System.out.println(bruteForce(arr));
        System.out.println(optimisedCode1(arr));
    }

}
