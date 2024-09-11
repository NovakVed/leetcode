package neetCode.slidingWindow.bestTimeToBuyAndSellStock;

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
