package DynamicArraysAndLists.Questions;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TrappingRainWater {

    public static int optimisedCode2(int arr[]) {
        int waterCounter = 0, left = 0, right = arr.length - 1, leftMax = arr[left], rightMax = arr[right];

        while (left <= right) {

            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                }else {
                    waterCounter += Math.min(leftMax, rightMax) - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                }else{
                    waterCounter += Math.min(leftMax, rightMax) - arr[right];
                    System.out.print(waterCounter + " ");
                }

                right--;
            }
        }
        return waterCounter;
    }

    public static int optimisedCode1(int arr[]) {
        // By Using Prefix Sum Algorithm
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        int prefix[] = new int[arr.length];

        int waterCounter = 0, leftMax = 0, rightMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > leftMax) {
                leftMax = arr[i];
            }
            prefix[i] = leftMax;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            if (temp > rightMax) {
                rightMax = temp;
            }
            waterCounter += Math.min(prefix[i], rightMax) - arr[i];
            System.out.print(waterCounter + " ");
        }
        System.out.print(Arrays.toString(prefix));
        return waterCounter;
    }

    public static int bruteForce(int arr[]) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        int leftmax = arr[0], waterCounter = 0, totalWater = 0, rightMax = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= leftmax) {
                    leftmax = arr[j];
                }
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightMax = Math.max(arr[j], rightMax);
            }
            waterCounter = Math.min(leftmax, rightMax) - arr[i];
            totalWater += waterCounter;
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int arr[] = {4, 2, 0, 3, 2, 5};
//        System.out.print(bruteForce(arr));
//        System.out.print(optimisedCode1(arr));
        System.out.print(optimisedCode2(arr));
    }
}
