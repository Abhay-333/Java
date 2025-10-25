package Stack.Level1;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    private Stack<Integer> st1, st2;


    ImplementQueueUsingStacks() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        while (!st1.empty()) {
            st2.push(st1.pop());
        }
        int ans = st2.pop();
        while (!st2.empty()) {
            st1.push(st2.pop());
        }
        return ans;
    }

    public int peek() {
        while (!st1.empty()) {
            st2.push(st1.pop());
        }
        int ans = st2.peek();
        while (!st2.empty()) {
            st1.push(st2.pop());
        }
        return ans;
    }

    public boolean empty() {
        return st1.empty();
    }

    @Override
    public String toString() {
        return st1.toString();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks q1 = new ImplementQueueUsingStacks();
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);

        System.out.println(q1.peek());
//        System.out.println(q1.pop());
        System.out.println(q1.empty());
        System.out.println(q1);
    }
}
