package ¶¯Ì¬;

public class N_188 {
    public int maxProfit(int k, int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int[][] dp = new int[prices.length][2 * k + 1];
        for (int i = 1; i < 2 * k + 1; ) {
            dp[0][i] = -prices[0];
            i += 2;
        }
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = dp[i - 1][0];
            for (int j = 1; j < 2 * k + 1; j++) {
                if (j % 2 == 1) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] - prices[i]);
                }
                if (j % 2 + 1 == 1) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] + prices[i]);
                }
            }
        }
        return dp[prices.length - 1][2 * k];
    }
}
