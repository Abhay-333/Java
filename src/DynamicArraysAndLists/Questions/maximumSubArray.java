package DynamicArraysAndLists.Questions;

public class maximumSubArray {
    public static int optimisedCode1(int arr[]){
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int maxSum = arr[0];
        // Using Kadane's Algorithm
        // It stats that when u get a negative element while traversing the currentSum Pointer then drop its value to
        // 0 because negative + negative = negative Or negative + positive = negative then why to carry the negative
        // number, so skip it.

        int i = 0, currentSum = 0;
        while(i < arr.length){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += arr[i++];
            maxSum = Math.max(currentSum,maxSum);
        }

        return maxSum;
    }

    public static int bruteForce(int arr[]) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)

        int maxSum = arr[0], currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                maxSum = Math.max(currentSum,maxSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};
//        System.out.println(bruteForce(arr));
        System.out.println(optimisedCode1(arr));
    }
}
