package 动态;

public class N_279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1]; //dp[i] 和为i的完全平方数的最少数量
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i * i <= n; i++) {
            // 遍历物品
            for (int j = i * i; j <= n; j++) {
                // 遍历背包
                dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
            }
        }
        return dp[n];
    }
}
