package 动态;

public class N_416 {
    public boolean canPartition(int[] nums) {
        int target = 0;
        for(int e:nums){
            target += e;
        }
        int flag = target % 2;
        if(flag != 0){
            return false;
        }
        target /= 2;
        int[] dp = new int[target + 1]; //dp[i]即数组容量为i的最大子集和
        for(int i = 0; i < nums.length; i++){
            for(int j = target; j >= nums[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }
}
