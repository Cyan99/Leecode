package ��̬;

public class N_121 {
    //    public int maxProfit(int[] prices) {
    //̰��
//        int min = Integer.MAX_VALUE;
//        int result = 0;
//        for(int i = 0; i < prices.length; i++){
//            min = Math.min(prices[i], min);
//            result = Math.max(result, prices[i]-min);
//        }
//        return result;
//    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2]; //dp[i][0]��ʾ��i����й�Ʊ��������룬dp[i][1]��ʾ��i�첻���й�Ʊ���������
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][1]);
    }

}
