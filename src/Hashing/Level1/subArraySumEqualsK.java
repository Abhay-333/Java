package Hashing.Level1;

import java.util.HashMap;
import java.util.Map;

public class subArraySumEqualsK {
    public static void main(String[] args) {
//        int arr[] = {10, 2, -2, -20, 10, 1, 1, 2};
        int arr[] = {1,2,3};
        int k = 3, currentSum = 0, ans = 0;

        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(currentSum, map1.getOrDefault(currentSum, 0) + 1);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            int difference = currentSum - k;

            if (map1.containsKey(difference)) {
                ans += map1.get(difference);
                System.out.print(ans + " ");
            }
            map1.put(currentSum, map1.getOrDefault(currentSum, 0)+1);
        }

    }
}
