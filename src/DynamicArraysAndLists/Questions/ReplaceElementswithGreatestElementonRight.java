package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRight {
    public static int[] optimisedCode1(int arr[]){
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int i = arr.length-1;
        int max = -1;

        for( ; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max){
                max = temp;
            }
        }

        return arr;
    }

    public static int[] bruteForce(int arr[]) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        try {
            for (int i = 0; i < arr.length - 1; i++) {
                int max = arr[i + 1];
                for (int j = i + 2; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
            arr[arr.length - 1] = -1;
        } catch (Exception e) {
            System.out.println(e);
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {17, 18, 5, 4, 6, 1};
//        System.out.println(Arrays.toString(bruteForce(arr)));
        System.out.println(Arrays.toString(optimisedCode1(arr)));
    }
}
