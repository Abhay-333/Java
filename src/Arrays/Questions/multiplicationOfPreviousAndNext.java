package Arrays.Questions;

import java.util.Arrays;

public class multiplicationOfPreviousAndNext {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int copy[] = new int[arr.length];

        // this method works but failing for 2 test cases

//        for (int i = 1; i < arr.length - 1; i++) {
//            if (i - 1 == 0) { // this will not work as expected if the array elements are same but lets try if it works
//                copy[i - 1] = arr[i - 1] * arr[i];
//            }
//
//            copy[i] = arr[i - 1] * arr[i + 1];
//        }
//            copy[arr.length - 1] = arr[arr.length - 1] * arr[arr.length - 2];
//
//
//        System.out.println(Arrays.toString(copy));

        // lets try another method without creating a new array

        int previous = arr[0];

        arr[0] = arr[0] * arr[1];

        for(int i = 1; i < arr.length-1; i++){
            int current = arr[i];
            arr[i] = previous * arr[i+1];
            previous = current;
        }

        arr[arr.length-1] = previous * arr[arr.length-1];

        System.out.println(Arrays.toString(arr));

    }
}
