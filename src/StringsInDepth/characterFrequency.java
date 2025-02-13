package StringsInDepth;

import java.util.Arrays;

public class characterFrequency {
    public static void main(String[] args) {
        String str = "kabhi khushi kabhi gum";
        int[] frequency = new int[26];
        String originalString = str.replace(" ", "");

//        String originalString = str.trim();  this wont work because trim() trims leading and trailing spaces not
//        the spaces which are between the words

        System.out.println(originalString);

//        for (char ch : str.toCharArray()) {
//            frequency[ch - 97]++;
//            System.out.println(ch + ": " + frequency[ch-97]);
//        }

        char[] ch = originalString.toCharArray();

        for (int j = 0; j < ch.length; j++) {
            frequency[ch[j] - 97]++;  //ch[j] = 'h'-97 => ascii valueOf(h) - 97 => 104 - 97 = 7
//            System.out.println(ch[j] + ": " + frequency[ch[j] - 97]);
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) (i + 97) + ": " + frequency[i]);      // integer + integer = integer (type
                // casted into char)
            }
        }

    }
}