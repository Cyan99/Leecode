package 动态;

import java.util.Arrays;

public class N_53 {
    public int maxSubArray(int[] nums) {
        //dp[i] 下标为i-1的连续子数组最大和
        int[] dp = new int[nums.length + 1];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i-1], nums[i-1]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
