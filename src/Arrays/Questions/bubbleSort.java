package Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int numberOfTests = sc.nextInt();
    // Input order: number of test cases, sizeOfArray,
        for (int i = 1; i <= numberOfTests; i++) {
            System.out.println("Enter size of Array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];

            System.out.println("Enter Array elements: ");
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(bubbleSorting(arr));
        }


    }

    public static int bubbleSorting(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    System.out.print(true + " ");
                }
            }

        }

        System.out.println(Arrays.toString(arr));
        return 0;
    }

}


// Use this relation for bubble sort
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//        for (int j = n; j >= 1; j--) {
//        if (j >= i) {
//        System.out.print("* ");
//                }
//                        }
//                        System.out.println();
//        }