package Arrays.Questions;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int numberOfTests = sc.nextInt();

        for (int i = 1; i <= numberOfTests; i++) {
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println(bubbleSorting(arr));
        }


    }

    public static int bubbleSorting(int arr[]) {
        int bubble = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(bubble > arr[i]){
                int temp = bubble;
                bubble = arr[i];
            }
        }

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