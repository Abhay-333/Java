package Hashing.Level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int bruteForce(int arr[]) {
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        int ans = 1, maxStreak = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) continue;
            if (arr[i] + 1 == arr[i + 1]) {
                ans++;
            } else {
                ans = 1;
            }
            maxStreak = Math.max(maxStreak, ans);
        }

        return maxStreak;
    }

    public static int optimalCode(int arr[]) {
        int longestStreak = 0;

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }

        for (int num : set1) {

            if (!set1.contains(num - 1)) {
                int currentStreak = 1, currentNum = num;
                while (set1.contains(currentNum + 1)) {
                    currentStreak++;
                    currentNum++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
//        int arr[] = {100, 4, 200, 1, 3, 2};
        int arr[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
//        System.out.println(bruteForce(arr));
        System.out.println(optimalCode(arr));
    }
}
