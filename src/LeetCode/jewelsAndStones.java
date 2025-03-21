package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class jewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        char[] jewelsArr = jewels.toCharArray();
        char[] stonesArr = stones.toCharArray();
        int counter = 0;
        System.out.println(Arrays.toString(jewelsArr));
        System.out.println(Arrays.toString(stonesArr));

        // Brute force Solution: time complexity -> o(n^2), space complexity -> o(n + m) where n = jewelsArr, m =
        // stonesArr and o(1) for counter;
//        for (int i = 0; i < jewelsArr.length; i++) {
//            for (int j = 0; j < stonesArr.length; j++) {
//                if(jewelsArr[i] == stonesArr[j]){
//                    counter++;
//                }
//            }
//        }
//        System.out.println(counter);


        // Solution 2: using hashSet, time-> o(n+m), space-> o(n)

        Set<Character> set1 = new HashSet<>();

        for (int i = 0; i < jewelsArr.length; i++) {
            set1.add(jewelsArr[i]);
        }

        for (int i = 0; i < stonesArr.length; i++) {
            if(set1.contains(stonesArr[i])){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
