package Arrays.Questions;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 1, -23};

        for (int i = 1; i < arr.length; i++) {      // we start the index from 1 because we assume that first index
            // is already sorted
            int j = i - 1, key = arr[i];

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j--];
            }
            arr[j+1] = key;

        }

        System.out.println(Arrays.toString(arr));

    }
}
