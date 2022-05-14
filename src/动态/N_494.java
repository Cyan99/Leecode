package ��̬;

public class N_494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int e : nums) {
            sum += e;
        }
        int goal = (sum + target) / 2; // left + right = sum; left - right = target,  goal = left
        if ((sum + target) % 2 != 0) {
            return 0;
        }
        if(Math.abs(target) > sum){
            return 0;
        }
        int[] dp = new int[goal + 1]; // dp[i] ��װ������Ϊ i �ı����м��ַ���
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = goal; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[target];
    }
}
