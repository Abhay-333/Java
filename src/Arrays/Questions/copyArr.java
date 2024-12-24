package Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class copyArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int arr[] = {1, 2, 3, 4, 5};
        int k = 5;
        k = k % 10;
//        int arr[] = new int[n];

        int[] copy = new int[arr.length];   // Deep copy of arr[],next Step to rotate it by one element in the left.

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

//        for (int j = 1; j < k; j++) {
//
//            int temp = arr[0];
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[arr.length - 1] = temp;
//        }

        for (int i = 0, j = arr.length - 1; i < arr.length ; i++) {
            copy[i] = arr[j--];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }
}
