package SortingAlgorithms.MergeSort;

import java.util.Arrays;

public class mergeSortAlgo {

    public static int[] sort(int arr[], int left, int mid) {
        int i = left, j = mid;
        while (i < j) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = arr[i];
                i++;
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 9, 11, 6, 15, 13, 12, 9};
        int left = 0, right = arr.length - 1, mid = (left + right) / 2;
//        System.out.print(mid + " ");
        System.out.print(Arrays.toString(sort(arr, left, mid)));

//        sort(arr,mid+1, right);
    }

}
