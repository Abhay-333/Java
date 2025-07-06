package SortingAlgorithms.MergeSort;

import java.util.Arrays;

public class technique1 {

    public static int[] merge3(int[] arr, int left, int mid, int right){
        int i = left, j = mid;

        while(i < mid && j <= right){
            if(arr[i] <= arr[j]){
                i++;
            }else{
                int temp = arr[j];
                for (int k = j; k != i; k--) {
                    arr[k] = arr[k-1];
                }
                arr[i] = temp;
                i++;
                j++;
                mid++;
            }
        }

        return arr;
    }

    public static int[] merge1(int arr[]) {
        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        int left = 0, right = arr.length - 1, mid = (left + right) / 2;
        int arr1[] = new int[mid - left + 1], arr2[] = new int[right - mid];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mid += 1;
            arr2[i] = arr[mid];
        }

        int i = 0, j = 0, k = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        while (i != arr1.length && j != arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }

        return arr;
    }

    public static int[] merge2(int arr[], int left, int mid, int right) {
        int temp[] = new int[right-left+1];
        int i = left, j = mid, k = 0;

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i < mid){
            temp[k++] = arr[i++];
        }

        while(j < right){
            temp[k++] = arr[j++];
        }

        for (int l = left; l <= right; l++) {
            arr[l] = temp[l-left];
        }

        return arr;
    }

    public static void main(String[] args) {
        // The Time Complexity for Merge Sort is: O(n log n)
        // The Space Complexity for Merge Sort is: O(n)
        int arr[] = {2, 4, 7, 9, 12, 1, 3, 4, 6, 7, 10};
//        System.out.println(Arrays.toString(merge1(arr)));
//        System.out.println(Arrays.toString(merge2(arr, 0, 5, 10)));
        System.out.println(Arrays.toString(merge3(arr, 0, 5, 10)));
    }

}
