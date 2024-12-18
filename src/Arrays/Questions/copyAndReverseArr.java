package Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class copyAndReverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int arr[] = {1, 2, 3, 4, 5};

//        int arr[] = new int[n];

        int[] copy = new int[arr.length];   // Deep copy of arr[],next Step to rotate it by one element in the left.
        int temp =  arr[0];

        for(int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }
}
