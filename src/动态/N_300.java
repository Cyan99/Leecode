package ��̬;

import java.util.Arrays;

public class N_300 {
    public int lengthOfLIS(int[] nums) {
        //dp[i] �±�Ϊi�����е�����������г���
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(dp[i], result);
        }
        return result;
    }
}
