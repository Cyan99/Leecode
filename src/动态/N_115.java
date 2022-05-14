package 动态;

public class N_115 {
    public int numDistinct(String s, String t) {
        // dp[i][j] 以j-1为结尾的s子序列中，出现以i-1为结尾的t的个数
        int[][] dp = new int[t.length()+1][s.length()+1];
        for(int i = 0; i <= s.length(); i++){
            dp[0][i] = 1;
        }
        for(int i = 1;i <= t.length(); i++){
            for(int j = 1; j <= s.length();j++){
                if(t.charAt(i-1) == s.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+dp[i][j-1];
                }else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}
