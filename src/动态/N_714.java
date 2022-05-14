package 动态;

public class N_714 {
    public int maxProfit(int[] prices, int fee) {
        //0:持有股票
        //1:不持有股票
        // dp 定义第i天持股/不持股 所得最多现金
        int[][] dp = new int[prices.length][2];
        dp[0][0] = -prices[0];
        for(int i =1; i < prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] -prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] +prices[i]-fee);
        }
        return dp[prices.length-1][1];
    }
}
