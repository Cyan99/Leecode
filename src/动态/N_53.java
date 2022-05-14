package ��̬;

import java.util.Arrays;

public class N_53 {
    public int maxSubArray(int[] nums) {
        //dp[i] �±�Ϊi-1����������������
        int[] dp = new int[nums.length + 1];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i-1], nums[i-1]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
