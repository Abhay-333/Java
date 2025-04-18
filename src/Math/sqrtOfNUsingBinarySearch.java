package Math;

import java.util.Arrays;

public class sqrtOfNUsingBinarySearch {
    public static int binarySearchForSqrt(int n) {
        int start = 0, end = n, probableAnswer = 0;

        while (start <= end) {
            int mid = start + (end-start) / 2;
            long hugeMid = (long) mid * mid;
            if (hugeMid <= n){
                probableAnswer = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (arr[start] == n) return start;
//            else if (arr[end] == n) return end;
//            else if (arr[mid] == n) return mid;
//
//            if (arr[mid] < n) start = mid + 1;
//            else if (arr[mid] > n) end = mid - 1;
//        }

        return probableAnswer;
    }

    public static void main(String[] args) {
        // to find sqrt of n using binary Search we must understand what is binary search and must be able to code it
        // so first create a function for binary Search
        int x = 1000000;
        System.out.println(binarySearchForSqrt(x));
    }
}
