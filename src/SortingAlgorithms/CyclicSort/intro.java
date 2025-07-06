package SortingAlgorithms.CyclicSort;

import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
//        int arr[] = {5, 2, 3, 1, 4, 6};
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
