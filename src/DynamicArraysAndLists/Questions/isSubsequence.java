package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class isSubsequence {
    //    public static boolean optimiseCode1(){
//        return true;
//    }
    public static boolean bruteForce(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return false;
        }
        boolean isSubsequence = true;
        int i = 0, j = 0;

        while (j < t.toCharArray().length) {
            if (s.toCharArray()[i] == t.toCharArray()[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if(i == s.length()){
            isSubsequence = true;
            return isSubsequence;
        } else if (j == t.length() && i != s.length()) {
            isSubsequence = false;
            return isSubsequence;
        }
        return isSubsequence;
    }

    public static void main(String[] args) {
//        System.out.print(bruteForce("ace", "abcde"));
//        System.out.print(bruteForce("abc", "ahbgdc"));
//        System.out.print(bruteForce("axc", "ahbgdc"));
//        System.out.print(bruteForce("", "ahbgdc"));
        System.out.print(bruteForce("abc", "abc"));
    }

}
