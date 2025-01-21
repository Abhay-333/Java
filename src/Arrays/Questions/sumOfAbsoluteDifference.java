package Arrays.Questions;

import java.util.Scanner;

public class sumOfAbsoluteDifference {
    public static void main(String[] args) {
        int arr[] = {3, 6, 9}, sumOfAbsoluteDiff = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int absoluteDiff = arr[j] - arr[i];
                sumOfAbsoluteDiff += absoluteDiff;
            }
        }

//        System.out.println(" hello " + "\n" + " World");
        System.out.println(15 + " " + 5 + " ");
        System.out.println(sumOfAbsoluteDiff);
    }
}
