package StringsInDepth;

public class stringPalindrome {
    public static void main(String[] args) {
        String str = "madam", rev = "";

        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(str.equals(rev));

    }
}
