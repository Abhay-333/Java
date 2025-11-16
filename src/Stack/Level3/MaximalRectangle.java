package Stack.Level3;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {

    public static int findMaxArea(int ans[]) {
        int left[] = new int[ans.length];
        int right[] = new int[ans.length];
        Stack<int[]> st = new Stack<>();

        left[0] = -1;
        st.push(new int[]{ans[0], 0});
        for (int i = 0; i < left.length; i++) {
            while (!st.empty() && st.peek()[0] >= ans[i]) {
                st.pop();
            }

            if (st.empty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek()[1];
            }
            st.push(new int[]{ans[i], i});
        }
        st.clear();
        for (int i = right.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek()[0] >= ans[i]) {
                st.pop();
            }

            if (st.empty()) {
                right[i] = right.length;
            } else {
                right[i] = st.peek()[1];
            }
            st.push(new int[]{ans[i], i});
        }
        int area = 0;
        for(int i = 0; i < ans.length; i++){
            area = ((right[i] - left[i]) -1)*ans[i];
        }
        return area;
    }

    public static void main(String[] args) {
        char arr[][] = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        int ans[] = new int[arr[0].length];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ans[j] = arr[i][j] == '0' ? 0 : ans[j] + arr[i][j] - '0';
                System.out.print(ans[j] + " ");
            }
            System.out.println();
            max = Math.max(max, findMaxArea(ans));
        }
        System.out.println(max);
    }
}
