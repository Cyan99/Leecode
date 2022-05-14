package 动态;

public class N_198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1]; //dp[i]是房间个数为i的偷窃的最大金额
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i<= nums.length;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }
        return dp[nums.length];
    }
}
