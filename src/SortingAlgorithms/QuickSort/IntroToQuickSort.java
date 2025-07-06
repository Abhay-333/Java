package SortingAlgorithms.QuickSort;

import java.util.Arrays;

public class IntroToQuickSort {
    public static int[] separateNumbers(int arr[]) {
        int i = 0, j = arr.length-1;
        while(i < j){
            if(arr[i] < 0){
                i++;
            }else if(arr[j] > 0){
                j--;
            }else{
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, -5, 3, 1, -2, -7, 13, 11, -3};
        System.out.print(Arrays.toString(separateNumbers(arr)));
    }
}

