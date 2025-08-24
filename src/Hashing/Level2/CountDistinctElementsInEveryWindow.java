package Hashing.Level2;

import java.util.*;

public class CountDistinctElementsInEveryWindow {
    public static List<Integer> optimalSolution(int arr[], int k) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map1.put(arr[i], map1.getOrDefault(arr[i], 0) + 1);
        }
        ans.add(map1.size());
//        System.out.println(map1);
        for (int j = k; j < arr.length; j++) {
            int outgoing = arr[j - k];
            map1.put(outgoing, map1.get(outgoing)-1);
            if (map1.get(outgoing) == 0) {
                map1.remove(outgoing);
            }
            int incoming = arr[j];
            map1.put(incoming, map1.getOrDefault(incoming, 0) + 1);
            ans.add(map1.size());
        }
        return ans;
    }

    public static List<Integer> bruteforce(int arr[], int k) {
        // Time Complexity: O(k*n)
        // Space Complexity: O(n)
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - k + 1; i++) {
            Set<Integer> set1 = new HashSet<>();
            for (int j = i; j <= i + k - 1; j++) {
                set1.add(arr[j]);
            }
            ans.add(set1.size());
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 0, 1, 3, 1, 2, 2, 1, 4};
        int k = 4;
//        int arr[] = {4, 1, 1};
//        int k = 2;
//        System.out.println(bruteforce(arr, k));
        System.out.println(optimalSolution(arr, k));
    }
}
