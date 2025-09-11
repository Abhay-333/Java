package StringBuilderAndMatrix.StringBuilderAPI;

public class rotateString {
    public static boolean bruteforce(String s, String goal) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;

        while (i < str.length()) {
            if (str.toString().equals(goal)) {
                return true;
            }
            char temp = str.charAt(0);
            str.deleteCharAt(0);
            str.append(temp);
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";

        System.out.println(bruteforce(s, goal));
    }
}
