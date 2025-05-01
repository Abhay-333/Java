package DynamicArraysAndLists.Questions;


public class bestTimetoSellStocks {
    public static int optimisedCode1(int prices[]) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        int i = 0, maxProfit = 0, minPrice = prices[0];

        while (i < prices.length) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i++]);
            System.out.print(minPrice + " ");
        }
        return maxProfit;
    }

    public static int bruteForce(int prices[]) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        int profit = 0, buy = 0;

        while (buy < prices.length) {
            int sell = buy + 1;
            while (sell < prices.length) {
                if (prices[sell] - prices[buy] > profit) {
                    profit = prices[sell] - prices[buy];
                }
                sell++;
            }
            buy++;
        }

        return profit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
//        System.out.println(bruteForce(prices));
        System.out.println(optimisedCode1(prices));
    }
}
