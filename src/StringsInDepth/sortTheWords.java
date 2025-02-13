package StringsInDepth;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortTheWords {
    public static void main(String[] args) {
        String str1 = "taj mahal is situated at Agra", sortedStr = "";

        String[] words = str1.split(" ");


        for (int i = 0; i < words.length - 1; i++) {
        System.out.println(Arrays.toString(words));
//        System.out.print(words[i] + " ");

            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
            sortedStr = String.join(" ", words);
            sortedStr = sortedStr.trim();

        System.out.println(sortedStr);

    }
}
