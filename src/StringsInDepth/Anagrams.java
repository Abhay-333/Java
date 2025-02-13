package StringsInDepth;

public class Anagrams {
    public static void main(String[] args) {
//        An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once. Two words are considered anagrams if they have the same length and the same character frequency.
//
//        Write a program to check if two given strings are anagrams of each other.
//
//        Input Format:
//
//        T : Number of test cases
//        s1 : First input string for each test case
//        s2 : First input string for each test case


        String str1 = "arc";
        String str2 = "car";

        if (str1.length() != str2.length()) {
            System.out.println(false); // return false and terminate the program here
        }

//        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagramWithOptimization(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2){
        int frequencyOfStr1[] = new int[26];
        int frequencyOfStr2[] = new int[26];
        // we can do this question with using one array for optimization and for efficiency

        for (char ch : str1.toCharArray()) {
            frequencyOfStr1[ch - 97]++;
        }

        for (char ch : str2.toCharArray()) {
            frequencyOfStr2[ch - 97]++;
        }

        for (int i = 0; i < frequencyOfStr1.length; i++) {
            if(frequencyOfStr1[i] != frequencyOfStr2[i]){
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramWithOptimization(String str1, String str2){
        int frequencyOfStr1[] = new int[26];

        for (char ch : str1.toCharArray()) {
            frequencyOfStr1[ch - 97]++;
        }

        for (char ch : str2.toCharArray()) {
            frequencyOfStr1[ch - 97]--;
        }

        for (int i = 0; i < frequencyOfStr1.length; i++) {
            if(frequencyOfStr1[i] != 0){
                return false;
            }
        }

        return true;
    }

}
