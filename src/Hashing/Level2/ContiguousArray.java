package Hashing.Level2;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static int optimalSolution(int arr[]) {

        Map<Integer, Integer> map1 = new HashMap<>();
        int currentSum = 0, longest = 0;
        map1.put(currentSum, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
            currentSum += arr[i];

            if (!map1.containsKey(currentSum)) {
                map1.put(currentSum, i);
            }

            if(map1.containsKey(currentSum)){
                longest = Math.max(longest, i - map1.get(currentSum));
            }
        }
        System.out.print(map1 + " ");
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(optimalSolution(arr));
    }
}
