package neetCode.slidingWindow.bestTimeToBuyAndSellStock.practice;

class BestTimeToBuyAndSellStock1 {
    public static void main(String[] args) {
        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int l = 0, profit = 0;
        for (int r = 1; r < prices.length; r++) {
            if (prices[l] > prices[r])
                l = r;
            profit = Math.max(profit, prices[r] - prices[l]);
        }
        return profit;
    }
}
