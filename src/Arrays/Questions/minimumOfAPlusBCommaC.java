package Arrays.Questions;

import java.util.Arrays;

public class minimumOfAPlusBCommaC {
    public static void main(String[] args) {
        int arr[] = {3, 6, 4, 5, 6};
        int charArr[] = {'a', 'c', 'b', 'b', 'a'};
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE, minC = Integer.MAX_VALUE;

// This Approach is good but when the size of arr or CharArr is < 3 then the program might give unexpected Bugs,
// errors, or output.

        // This case does'nt pass all the test cases when sizeOfArray= 2 || < 3
//        int sumOfAB=0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (charArr[i] == 'a' && arr[i] < minA) {
//                minA = arr[i];
//            }else if (charArr[i] == 'b' && arr[i] < minB){
//                minB = arr[i];
//            }else if (charArr[i] == 'c' && arr[i] < minC){
//                minC = arr[i];
//            }
//        }
//            sumOfAB = minA + minB;
//            System.out.println(Math.min(sumOfAB,minC));

    // Second Approach

        if(arr.length < 3){
            for (int i = 0; i < arr.length; i++) {
                minA = Math.min(arr[i], minA);      // if n < 3 then return the value of minA
            }
            System.out.println(minA);       // return minA i have sout it
        }

        for(int i = 0; i < arr.length; i++){
            switch (charArr[i]){
                case 'a': minA = Math.min(arr[i], minA);
                break;

                case 'b': minB = Math.min(arr[i], minB);
                break;

                case 'c': minC = Math.min(arr[i], minC);
                break;
            }
        }

        System.out.println( (int) Math.min((long)(minA+minB), minC));
    }
}
