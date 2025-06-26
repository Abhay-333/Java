package DynamicArraysAndLists.Questions;

import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(bruteForce(strs));
    }

    public static List<List<String>> bruteForce(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int alphabets[] = new int[26];
            for(char ch : strs[i].toCharArray()){
                alphabets[ch-'a']++;
            }
            String key = Arrays.toString(alphabets);
            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(strs[i]);
        }
        return new ArrayList<>(group.values());
    }
}
