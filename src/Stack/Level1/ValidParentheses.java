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
                if(st.peek() == '['){
                    st.pop();
                }else {
                    return false;
                }
            }

            if(ch == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        if(!st.empty())return false;
        System.out.println(st);

        return true;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(valid(s));
    }
}
