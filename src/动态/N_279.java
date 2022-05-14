package ��̬;

public class N_279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1]; //dp[i] ��Ϊi����ȫƽ��������������
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i * i <= n; i++) {
            // ������Ʒ
            for (int j = i * i; j <= n; j++) {
                // ��������
                dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
            }
        }
        return dp[n];
    }
}
