package DynamicArraysAndLists.Questions;

public class bestTimeToBuyandSellStocksTwo {

    public static int bruteForce(int prices[]) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int currentProfit = 0;
        int buy = 0, sell = buy + 1, totalProfit = 0;

        while (buy < prices.length - 1) {
            if (prices[buy] < prices[sell]) {
                currentProfit = prices[sell++] - prices[buy++];
                totalProfit += currentProfit;
            } else {
                buy++;
                sell++;
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        System.out.println(bruteForce(prices));
    }
}
