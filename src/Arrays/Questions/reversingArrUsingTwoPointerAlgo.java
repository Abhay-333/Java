package Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class reversingArrUsingTwoPointerAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] copy = new int[n];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            copy[i] = arr[j--];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));

//        for (int i = 0; i < arr.length; i++) {
//
//        }

//        int arr[] = {1, 2, 3, 4, 5};
//        int n = arr.length;
//
//        for (int i = 0, j = arr.length - 1; i < arr.length - 1; i++) {
//            if (i < j) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

    }
}
