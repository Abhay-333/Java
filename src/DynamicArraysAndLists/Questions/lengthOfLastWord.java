package DynamicArraysAndLists.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lengthOfLastWord {
    public static int bruteForce(String s){
        String words[] = s.trim().split(" ");
//        System.out.println(Arrays.toString());
        System.out.println(words[words.length-1].length());
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(bruteForce("   fly me   to   the moon  "));
        System.out.println(bruteForce("Hello World"));
        System.out.println(bruteForce("luffy is still joyboy"));
    }

}
