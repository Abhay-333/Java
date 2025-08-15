package Hashing.Level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestPalindrome {
    public static int usingHashMap(String s){
        Map<Character, Integer> map1 = new HashMap<>();
        int ans = 0;
        boolean isOdd = false;

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            if(entry.getValue() % 2 == 0){
                ans += entry.getValue();
            }else{
                isOdd = true;
                ans += entry.getValue()-1;
            }
        }
        return isOdd ? ans + 1 : ans;
    }

    public static int usingHashSet(String s){
        HashSet set1 = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if(!set1.contains(s.charAt(i))){
                set1.add(s.charAt(i));
            }else{
                set1.remove(s.charAt(i));
                ans += 2;
            }
        }

        return set1.size() > 0 ? ans + 1 : ans;
    }

    public static int usingArray(String s){
        int arr[] = new int[123];
        int ans = 0;

        for( char ch : s.toCharArray()){
            arr[ch]++;
        }

        for(int count : arr){
            if(count % 2 == 0){
                // Even
                ans += count;
            }else{
                // Odd
                ans += count -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        String str = "abccccdd";
//        String str = "abccccddaabb";
        String str = "bb";

//        System.out.println(usingHashMap(str));
//        System.out.println(usingHashSet(str));
        System.out.println(usingArray(str));
    }
}
