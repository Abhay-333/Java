package Hashing.Level1;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int bruteForce(int arr[]) {
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        int ans = 1,maxStreak = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) continue;
            if (arr[i] + 1 == arr[i + 1]) {
                ans++;
            }else{
                ans = 1;
            }
            maxStreak = Math.max(maxStreak, ans);
        }

        return maxStreak;
    }

    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        System.out.println(bruteForce(arr));
    }
}
