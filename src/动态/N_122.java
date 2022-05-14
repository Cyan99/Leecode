package ��̬;

public class N_122 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2]; //dp[i][0]��ʾ��i����й�Ʊ���ֽ�dp[i][1]��ʾ��i�첻���й�Ʊ���ֽ�
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] - prices[i], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i] , dp[i - 1][1]);
        }
        return dp[prices.length -1][1];
    }
}
