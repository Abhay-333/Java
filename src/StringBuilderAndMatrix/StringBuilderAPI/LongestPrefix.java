package StringBuilderAndMatrix.StringBuilderAPI;

public class LongestPrefix {
    public static StringBuilder commonPrefix(StringBuilder str1, String str2) {
        StringBuilder prefix = new StringBuilder();
        int i = 0;

        while (i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) == str2.charAt(i)) {
                prefix.append(str1.charAt(i));
                i++;
            } else {
                return prefix;
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        StringBuilder ans = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            ans = commonPrefix(ans, strs[i]);
        }
        System.out.print(ans + " ");

    }
}
