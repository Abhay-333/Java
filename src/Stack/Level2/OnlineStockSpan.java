package Stack.Level2;

import java.util.ArrayList;
import java.util.Stack;

public class OnlineStockSpan {
    public static class StockSpanner {
        Stack<int[]> st;
        int i = -1;

        public StockSpanner() {
            st = new Stack<>();
        }

        public int next(int price) {
            ++i;
            while (!st.empty() && st.peek()[0] <= price) {
                st.pop();
            }
            int ans;
            if (st.empty()) {
                ans = i + 1;
            } else {
                ans = i - st.peek()[1];
            }
            st.push(new int[]{price, i});
            return ans;
        }
    }

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(100)); // return 1
        System.out.println(stockSpanner.next(80));  // return 1
        System.out.println(stockSpanner.next(60));  // return 1
        System.out.println(stockSpanner.next(70));  // return 2
        System.out.println(stockSpanner.next(60));  // return 1
        System.out.println(stockSpanner.next(75));  // return 4
        System.out.println(stockSpanner.next(85));  // return 4

    }
}
