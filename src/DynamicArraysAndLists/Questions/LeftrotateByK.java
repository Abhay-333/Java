package DynamicArraysAndLists.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftrotateByK {
    public static int[] bruteForce(int arr[], int k) {
        // Brute Force

        // Time Complexity => O(n^2)
        // Space Complexity => O(1)

        while (k-- > 0) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }

    public static int[] optimisedCode1(int arr[], int k) {

        // Time Complexity => O(n)
        // Space Complexity => O(n)

        int newArr[] = new int[arr.length];
        int lastIndex = 0;
        int pointer = 0;

        for (int i = k; i < arr.length; i++) {
            newArr[lastIndex++] = arr[i];
        }

        for (int i = lastIndex; i < arr.length; i++) {
            newArr[i] = arr[pointer++];
        }
        return newArr;
    }

    public static int[] optimisedCode2(int arr[], int k) {
        // Uses Block Reversal Algorithm
        // Time Complexity => O(n)
        // Space Complexity => O(1)
        System.out.println(Arrays.toString(reverse(arr, 0, k-1)));
        System.out.println(Arrays.toString(reverse(arr, k, arr.length-1)));
        System.out.println(Arrays.toString(reverse(arr, 0, arr.length-1)));
        return arr;
    }

    public static int[] reverse(int arr[], int start, int end) {
        // Using Two Pointer Algo here

        while (start < end) {
            if (start == end) break;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

//        System.out.println(Arrays.toString(bruteForce(arr,k)));
//        System.out.println(Arrays.toString(optimisedCode1(arr, k)));
        System.out.println(Arrays.toString(optimisedCode2(arr, k)));
    }
}
