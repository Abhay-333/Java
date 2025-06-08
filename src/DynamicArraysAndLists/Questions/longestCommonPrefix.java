package DynamicArraysAndLists.Questions;

public class longestCommonPrefix {
    public static String bruteForce(String[] strs) {
        String firstWord = strs[0];
        int i = 1;
        while (i < strs.length) {
            int j = 0;
            while (j < Math.min(firstWord.length(), strs[i].length())) {
                if (firstWord.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }
            i++;
            firstWord = firstWord.substring(0, j);
        }
        return firstWord;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(bruteForce(strs));
    }
}
