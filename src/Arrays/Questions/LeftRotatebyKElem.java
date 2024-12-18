package Arrays.Questions;

import java.util.Arrays;

public class LeftRotatebyKElem {
    public static void main(String[] args) {
        int k = 5;
        int arr[] = {1, 2, 3, 4, 5}, copy[] = new int[arr.length];


        for (int i = 1; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
