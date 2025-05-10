package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class ProductOfArrayExceptiItself {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(bruteForce(arr)));
        System.out.println(Arrays.toString(optimisedCode1(arr)));
    }

    public static int[] bruteForce(int arr[]) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
        int newArr[] = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            int currentProduct = 1;
            for (int j = 0; j < newArr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    currentProduct *= arr[j];
                    System.out.print(currentProduct + " ");
                }
            }
            newArr[i] = currentProduct;
        }
        return newArr;
    }

    public static int[] optimisedCode1(int arr[]) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int i = 0, prefix = 1, postfix = 1, size = arr.length - 1;
        int extra[] = new int[arr.length];
        // First calculate the prefix array

        while (i < arr.length) {
            extra[i] = prefix;
            prefix *= arr[i++];
        }
        i--;
        while (i >= 0) {
            extra[i] *= postfix;
            postfix *= arr[i--];
        }

        return extra;
    }

}
