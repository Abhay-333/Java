package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class checkIfsentenceIsPanagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        char[] sentenceArr = sentence.toCharArray();

        // Brute Force: time -> o(n), space -> o(n) n for sentenceArr
//        sentenceArr[]: Takes O(n) space.
//                map1: Holds 26 key-value pairs → O(m) = O(26) = O(1).
//                Total: O(n + 1) → O(n). ✅

        Map<Character, Integer> map1 = new HashMap<>();

//        for (char i = 'a'; i <= 'z'; i++) {     //This loop runs 26 times (constant, since 'a' to 'z' is always 26).
//            map1.put(i, map1.getOrDefault(i, 0));
//        }
//
//        for (int i = 0; i < sentenceArr.length; i++) {      // loop runs till n
//            if(map1.containsKey(sentenceArr[i])){
//                int value = map1.get(sentenceArr[i]);
//                ++value;
//                map1.put(sentenceArr[i], value);
//            }
//        }
//
//        if(map1.containsValue(0)){
//            System.out.println(false);
//        }
//        System.out.println(map1);

        // Optimized solution
    }
}
