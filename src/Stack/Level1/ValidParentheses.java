package Stack.Level1;

import java.util.Stack;

public class ValidParentheses {
    public static boolean valid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
            if (ch == ')') {
                if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            }

            if (ch == ']') {
                if (st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }

            if (ch == '}') {
                if (st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        if (!st.empty()) return false;
        System.out.println(st);

        return true;
    }

    public static boolean optimized(String s) {
        if (s.length() <= 1) return false;
        Stack<Character> st = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (st.empty()) {
                return false;
            } else if ((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']') || (st.peek() == '{' && ch == '}')) {
                st.pop();
            } else {
                return false;
            }
        }

        return st.empty();
    }

    public static void main(String[] args) {
        String s = "({})";
        System.out.println(valid(s));
        System.out.println(optimized(s));
    }
}
