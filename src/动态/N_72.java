package 动态;

public class N_72 {
    public int minDistance(String word1, String word2) {
        //dp[i][j] 表示以下标i-1为结尾的字符串word1，和以下标j-1为结尾的字符串word2，最近编辑距离为dp[i][j]
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i = 1; i <= word1.length(); i++){
            dp[i][0] +=i;
        }
        for(int i = 1; i <= word2.length(); i++){
            dp[0][i] +=i;
        }
        for(int i = 1; i <= word1.length(); i++){
            for(int j = 1; j <= word2.length(); j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    //word1增
//                    dp[i][j] = dp[i][j-1]+1;
//                    //word1删
//                    dp[i][j] = dp[i-1][j]+1;
//                    //word1替换
//                    dp[i][j] = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1],dp[i-1][j]))+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
