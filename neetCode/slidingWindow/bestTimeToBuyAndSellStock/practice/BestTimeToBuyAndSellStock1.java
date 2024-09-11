package neetCode.slidingWindow.bestTimeToBuyAndSellStock.practice;

class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        int[] prices = new int[] { 1, 2 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int l = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[l] > prices[i]) {
                prices[l] = prices[i];
            }

            if (prices[l] < prices[i]) {
                profit = Math.max(profit, prices[i] - prices[l]);
            }
        }
        return profit;
    }
}
