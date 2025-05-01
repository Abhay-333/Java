package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class duplicateZeros {
    public static int[] optimisedCode1(int arr[]) {
        // Time Complexity: O(n);
        // Space Complexity: O(1);
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) counter++;
        }

        int i = arr.length - 1, j = arr.length - 1 + counter;

        while(i != j){
            if (arr[i] == 0) {
                write(arr, i, j--);
                write(arr, i, j--);
            } else {
                write(arr, i, j--);
            }
            i--;
        }

        return arr;
    }

    public static int[] write(int arr[], int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
        return arr;
    }

    public static int[] bruteForce(int arr[]) {
        // Time Complexity: O(n^2);
        // Space Complexity: O(1);

        int i = 0, j = arr.length - 1;
        while (i < arr.length - 1) {
            if (arr[i] == 0) {
                while (j > i) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                j = arr.length - 1;
                i += 2;
                System.out.print(i + " ");
            } else {
                j = arr.length - 1;
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {0, 4, 1, 0, 0, 8, 0, 0, 3};

//        System.out.println(Arrays.toString(bruteForce(arr)));
        System.out.println(Arrays.toString(optimisedCode1(arr)));
    }
}
