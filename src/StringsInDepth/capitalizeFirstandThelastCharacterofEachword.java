package StringsInDepth;

import java.lang.reflect.Array;
import java.util.Arrays;

public class capitalizeFirstandThelastCharacterofEachword {
    public static void main(String[] args) {
        String str = "Hello bhai kaise ho";
        String ans = "";
        String wordsArr[] = str.split(" ");

        for (String word : wordsArr) {
            char[] letters = word.toCharArray();
            int j = letters.length - 1;

            for (int i = 0; i < 1; i++) {
                if (Character.isLowerCase(letters[i])) {
                    letters[i] = (char) (letters[i] - 32);
                }

                if (Character.isLowerCase(letters[j])) {
                    letters[j] = (char) (letters[j] - 32);
                }
            }

            for (int i = 0; i < letters.length; i++) {
                ans += Character.toString(letters[i]);
            }
            ans += " ";
//            System.out.print(Arrays.toString(letters) + " ");
        }
            System.out.print(ans);
//            System.out.println(Arrays.toString(wordsArr) + " ");

    }
}
