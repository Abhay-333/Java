package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        // Solution 1: using set, complexity - o(n)
        int arr[] = {2, 7, 11, 15};
        int target = 9;
//
//        Set<Integer> set1 = new HashSet<>();
//
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i-1] + arr[i] == target){
//                set1.add(arr[i-1]);
//                set1.add(arr[i]);
//            }else{
//                System.out.println(false);
//            }
//        }
//        System.out.println(set1);

        // Solution 2: using map
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map1.containsKey(complement)) {
//                map1.put(i, map1.get(complement)); // if this was a function then we should return new map from
//                here, dont use sout.
            } else {
                map1.put(arr[i], i);
            }
        }

        System.out.println(map1);

        //Solution 3: brute force

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.print(i + " " + i);
//                }
//            }
//        }

    }
}
