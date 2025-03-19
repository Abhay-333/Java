package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class sumOfuniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int sum = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        // Brute force: time -> o(n), space -> o(n)


        for (int num : nums) {
            map1.put(num, map1.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map1.entrySet()){
            if(entry.getValue() == 1){
                sum += entry.getKey();
            }
        }

        System.out.println(map1);
        System.out.println(sum);
    }
}
