package 动态;

import java.util.Arrays;

public class N_518 {
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        if(coins.length == 1) {
            if (coins[0] < amount || coins[0] > amount) {
                return 0;
            } else {
                return 1;
            }
        }
        int[] dp = new int[amount + 1]; // dp[i]即凑成 总数为i的硬币组合数
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = dp[i]; j <= amount; j++) {
                dp[j] = Math.max(dp[j], dp[j - coins[i]] + 1);
            }
            System.out.println("i = "+i+" "+ dp[i]);
        }
        return dp[amount];
    }
}
