package Stack.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static ArrayList<Integer> greaterDilaDo(int arr[]) {
        Integer ans[] = new Integer[arr.length];
        Stack<Integer> st = new Stack<>();
        ans[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        ArrayList<Integer> ans1 = new ArrayList<>(Arrays.asList(ans));
        return ans1;
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(arr));
        System.out.println(greaterDilaDo(arr));
    }
}
