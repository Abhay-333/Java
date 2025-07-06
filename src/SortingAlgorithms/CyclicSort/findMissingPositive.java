package SortingAlgorithms.CyclicSort;

import java.util.Arrays;

public class findMissingPositive {
    public static int cyclicSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && i + 1 != arr[i] && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        int j = 0;
        while(j < arr.length){
            if(arr[j]-1 != j){
                return j+1;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, -1, 1};
        System.out.println(cyclicSort(arr));
    }
}
