package ��̬;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class N_322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];//dp[i]���ܴճ��ܽ��Ϊi������Ӳ����
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
        }
        for (int i = 0; i < coins.length; i++) {
            //������Ʒ
            for (int j = coins[i]; j <= amount; j++) {
                //��������
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        if (dp[amount] == Integer.MAX_VALUE - 1) {
            dp[amount] = -1;
        }
        return dp[amount];
    }
}
