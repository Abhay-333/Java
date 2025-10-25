package Stack;

public class ImplementationWithArray {
    private int arr[];
    private int size, capacity, top;

    ImplementationWithArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
        top = -1;
    }

    public void push(int val) {
        if (++top < capacity) {
            arr[top] = val;
            size++;
        } else {
            System.out.println("Stack Overflow");
        }

    }

    public Integer pop() {
        if (top != -1) {
            int ans = 0;
            ans = arr[top];
            arr[top--] = 0;
            size--;
            return ans;
        } else {
            System.out.println("Stack Underflow");
            return null;
        }
    }

    public Integer peek() {
        return top != -1 ? arr[top] : null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (size == 0) return "[]";

        sb.append("[");
        for (int i = 0; i < capacity; i++) {
            sb.append(arr[i]);
            if (i < capacity - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        ImplementationWithArray st = new ImplementationWithArray(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st);
    }
}
