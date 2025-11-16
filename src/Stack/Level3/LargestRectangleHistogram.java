package Stack.Level3;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleHistogram {
    // find nearest smallest to the right
    // find nearest smallest to the left
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        Stack<int[]> st = new Stack<>();
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        left[0] = -1;
        st.push(new int[]{arr[0], 0});
        for (int i = 1; i < arr.length; i++) {
            while (!st.empty() && st.peek()[0] > arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek()[1];
            }
            st.push(new int[]{arr[i], i});
        }

//        right[right.length-1] = right.length;
        st.clear();
        for (int i = right.length-1; i >= 0; i--) {
            while (!st.empty() && st.peek()[0] > arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                right[i] = right.length;
            } else {
                right[i] = st.peek()[1];
            }
            st.push(new int[]{arr[i], i});
        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(right));
        int ans[] = new int[arr.length];
    int max = 0;
        for(int i = 0; i < ans.length; i++){
            ans[i] = ((right[i] - left[i]) - 1)* arr[i];
            max = Math.max(ans[i], max);
        }

        System.out.println(Arrays.toString(ans));
        System.out.println(max);
    }
}
