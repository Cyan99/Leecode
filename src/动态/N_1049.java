package 动态;

public class N_1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int e : stones) {
            sum += e;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1]; // dp[i]: 容量为i的背包，最多装dp[i]的石头
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum -dp[target] * 2;
    }
}
