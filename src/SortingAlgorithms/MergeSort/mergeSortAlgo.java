package SortingAlgorithms.MergeSort;

import java.util.Arrays;

public class mergeSortAlgo {

    public static void merge1(int arr[], int left, int mid, int right) {
        int arr1[] = new int[mid - left + 1], arr2[] = new int[right - mid];
        int copyOfmid = mid;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[left + i];
        }

        for (int i = 0; i < arr2.length; i++) {
            copyOfmid+=1;
            arr2[i] = arr[copyOfmid];
        }

        int i = 0, j = 0, k = left;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]){
                arr[k++] = arr1[i++];
            }else{
                arr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }

//        System.out.print(Arrays.toString(arr));
//        System.out.print(Arrays.toString(arr1));
//        System.out.print(Arrays.toString(arr2));
    }

    public static int[] mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge1(arr, left, mid, right);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 9, 11, 6, 15, 13, 12, 9};
        System.out.print(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
//        int left = 0, right = arr.length - 1, mid = (left + right) / 2;
//        merge1(arr, left, mid, right);
    }
}
