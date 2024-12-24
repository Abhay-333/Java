package Arrays.Questions;

import java.util.Arrays;

public class copyAndReverseArr {
    public static void main(String[] args) {
        // Mostly asked in interview question
        int arr[] = {21, 23, 312, 524, 32635}, copy[] = new int[arr.length];

        // first way
//        for (int i = arr.length - 1, j = 0; i >= 0; i--) {
//            copy[j++] = arr[i];
//        }

        // Second Way using formula n-i-1, n = arr.length
        // arr[] = {1,2,3,4,5}

//        for (int i = arr.length - 1; i >= 0; i--) {
//            copy[arr.length-i-1] = arr[i];      // arr.length = 5, i = 4,3,2,1,0
//        }

        // Greatest Element
        // first method
//        int greatest = 0;

//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > arr[greatest]) {
//                greatest = i;
//            }
//        }

//        System.out.println("Greatest Element: " + arr[greatest] + " found at index " + greatest);


        // Second greatest Element
        // first method - this method works but it has some drawbacks such as for array = {21, 23, 3, 524, 5}
        // it does'nt check for arr[0] it checks all the elements but does'nt check for the first therefore there is
        // one drawback

//        int greatestElem = Math.max(arr[0], arr[1]), secondgreatest = Math.min(arr[0], arr[1]);
//
//        for (int i = 2; i < arr.length - 1; i++) {
//            if (arr[i] > greatestElem && arr[i] > secondgreatest) {
//                secondgreatest = greatestElem;
//                greatestElem = arr[i];
//            } else if (arr[i] > secondgreatest && arr[i] < greatestElem) {
//                secondgreatest = arr[i];
//            }
//        }
//        System.out.println(secondgreatest);


        // Second Method for finding second greatest element
        // This method is creates variables with the smallest integer value possible such that when we compare them
        // with another elements in the array we get appropriate result

//        int greatestElem = Integer.MIN_VALUE, secondGreatest = Integer.MIN_VALUE;
//
//        for(int i = 0; i < arr.length - 1; i++){
//            if(arr[i] > greatestElem && arr[i] > secondGreatest){
//                secondGreatest = greatestElem;
//                greatestElem = arr[i];
//            } else if (arr[i] > secondGreatest && arr[i] < greatestElem) {
//                secondGreatest = arr[i];
//            }
//        }

//        System.out.println(secondGreatest);

        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted ? "YES" : "NO");

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }
}
