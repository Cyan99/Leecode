package 动态;

public class N_70 {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n;i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // 背包版本
//    public int climbStairs(int n) {
//        int[] dp = new int[n+1]; //爬n阶的不同方法
//        int[] stairs = {1,2};
//
//        dp[0] = 1;
//        for(int i = 0; i <= n; i++){
//            for(int j = 0; j < stairs.length; j++){
//                if(i >= stairs[j]){
//                    dp[i] += dp[i-stairs[j]];
//                }
//            }
//        }
//        return dp[n];
//    }
}
