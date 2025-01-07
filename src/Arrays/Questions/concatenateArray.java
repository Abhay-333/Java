package Arrays.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class concatenateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int copy[] = new int[size * 2];

        for (int i = 0; i < copy.length;) {
            for (int j = 0; j < arr.length; j++) {
                copy[i++] = arr[j];
            }
        }

        System.out.println(Arrays.toString(copy));

    }
}
