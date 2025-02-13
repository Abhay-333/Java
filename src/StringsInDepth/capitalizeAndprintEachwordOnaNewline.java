package StringsInDepth;

import java.util.Arrays;

public class capitalizeAndprintEachwordOnaNewline {
    public static void main(String[] args) {
        String str = "Hello bhai kaise ho";
        String str2 = "";
        String[] words = str.split(" "); // returns array of tokens based on the given regex and it removes the given
        // regex consider str = "bhaaaai" and the given regex is a then it will give empty tokens in the array

        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
//            System.out.println(Arrays.toString(words[i].toCharArray()));
            char[] word = words[i].toCharArray();

            for (int j = 0; j < 1; j++) {
                if (Character.isLowerCase(word[j])) {
                    word[j] = (char) (word[j] - 32);
                }
                    System.out.println(word);       // this works

//                if (word[0] >= 'a' && word[0] <= 'z') {     // this wont work because this will convert every
//                character into uppercase
//                    System.out.print(Character.toTitleCase(word[0]));
//                }
            }


//            if (words[i].charAt(0) >= 'a' && words[i].charAt(0) <= 'z') {
//
//            }
        }

    }
}
