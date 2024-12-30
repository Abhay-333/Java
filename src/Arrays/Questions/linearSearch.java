package Arrays.Questions;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int numberOftest = sc.nextInt();  // input order: numberOftest, sizeOfarray,
        // arrayElements, targetElement

        for (int j = 1; j <= numberOftest; j++) {
            System.out.println("Enter the size of Array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter Array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the element you want to find in the Array : ");
            int target = sc.nextInt();
            System.out.println(linearSearching(arr, target));
        }

    }

    public static int linearSearching(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
