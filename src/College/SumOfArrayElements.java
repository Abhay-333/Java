package College;

import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum =sum+ num;
        }
        System.out.println("Sum of elements: " + sum);
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array elements in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
