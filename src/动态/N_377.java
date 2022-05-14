package 动态;

public class N_377 {
    public int combinationSum4(int[] nums, int target) {
//        if(nums.length == 1 && target < nums[0]){
//            return 0;
//        }

        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 0; i <= target; i++){
            //遍历容量
            for(int j = 0; j < nums.length; j++){
                //遍历物品
                if(i - nums[j] >= 0){
                    dp[i] += dp[i-nums[i]];
                }
            }
        }
        return dp[target];
    }

}
