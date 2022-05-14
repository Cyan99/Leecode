package 动态;

public class N_309 {
    public int maxProfit(int[] prices) {
        // 0: 持有股票
        // 1: 不持有股票，在冷冻期
        // 2: 不持有股票，不在冷冻期
        int[][] dp = new int[prices.length][3];
        dp[0][0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][1] - prices[i], dp[i - 1][2] - prices[i]));
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i], dp[i - 1][2] + prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);
        }
        return dp[prices.length - 1][2];
    }
}
