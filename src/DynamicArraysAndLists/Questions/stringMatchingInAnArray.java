package DynamicArraysAndLists.Questions;

import java.lang.reflect.Array;
import java.util.*;

public class stringMatchingInAnArray {
//    public static List<String> bruteforce(String[] words){
//
//    }

    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> list1 = new ArrayList<>();
//        System.out.println(words);

        for(String word : words){
            for (int i = 0; i < words.length; i++) {
                if(word.equals(words[i])){
                    continue;
                }

                if(word.contains(words[i])){
                    list1.add(words[i]);
                }
            }
        }

        System.out.println(list1);

    }
}
