package SortingAlgorithms.QuickSort;

import java.util.Arrays;

public class quickSort {

    public static int findPivot(int[] arr, int left, int right) {
        int pivot = arr[left], i = left + 1, j = right;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) i++;
            while (i <= j && arr[j] > pivot) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static int[] doQuickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivot = findPivot(arr, left, right);
            doQuickSort(arr, left, pivot-1);
            doQuickSort(arr, pivot+1, right);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, -5, 3, 1, -2, -7, 13, 11, -3};

        System.out.println(Arrays.toString(doQuickSort(arr, 0, arr.length - 1)));
    }
}
