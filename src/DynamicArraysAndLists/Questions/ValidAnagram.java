package DynamicArraysAndLists.Questions;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean bruteForce(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int count[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int value : count){
            if(value != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "car";

        System.out.println(bruteForce(str1,str2));
    }
}
