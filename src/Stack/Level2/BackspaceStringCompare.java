package Stack.Level2;

import java.util.Stack;

public class BackspaceStringCompare {

    public static StringBuilder compareKr(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (ch != '#') {
                st.push(ch);
                sb.append(ch);
            } else {
                sb.deleteCharAt(sb.length()-1);
                st.pop();
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        StringBuilder ans1 = compareKr(s);
        StringBuilder ans2 = compareKr(t);
        System .out.println(ans1.toString().equals(ans2.toString()));
    }
}