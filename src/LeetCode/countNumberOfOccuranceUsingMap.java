package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countNumberOfOccuranceUsingMap {
    public static void main(String[] args) {
        int arr[] = {112, 112, 21, 13,13, 13};

        Map<Integer, Integer> map1 = new HashMap<>();

        // Brute force
        for (int i = 0; i < arr.length; i++){
            map1.put(arr[i], map1.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map1);

//        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
//            System.out.print(entry.getKey() + "->" + entry.getValue());
//        }

//            map1.put(12,52);
//
//        for(Map.Entry<Integer, Integer> entry : map1.entrySet()){
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }

//        System.out.println(Arrays.toString(arr2));
    }
}
