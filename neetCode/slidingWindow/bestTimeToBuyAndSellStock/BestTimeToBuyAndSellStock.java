package neetCode.slidingWindow.bestTimeToBuyAndSellStock;

/**
 * 121. Best Time to Buy and Sell Stock
 * {@link} <a href=
 * "https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best
 * Time to Buy and Sell Stock</a>
 */
class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        int[] prices = new int[] { 1, 2 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
