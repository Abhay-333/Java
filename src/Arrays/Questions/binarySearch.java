package Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int numberOfTests = sc.nextInt();

        // Input order: number of tests, size of array, array elements, target element

        for (int i = 1; i <= numberOfTests; i++) {
            System.out.print("Enter size of Array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];

            System.out.print("Enter Array elements: ");
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            System.out.println("Enter the element which you want to find in the Array: ");
            int target = sc.nextInt();
            System.out.println(binarySearching(arr, target));       // Sending arr[] and the target value as argument.
        }
    }

    public static int binarySearching(int arr[], int target) {  // Catching parameters

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }

}


// this method creates a redundancy, why we are checking the
//            arr[start] and arr[end] because as we are searching or traversing whole array we dont need to search
//            for it.

//            if (arr[start] == target) {
//                return start;
//            } else if (arr[end] == target) {
//                return end;
//            } else if (arr[mid] == target) {
//                return mid;
//            } else {
//                if (arr[mid] > target) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }