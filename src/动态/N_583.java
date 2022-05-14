package ��̬;

public class N_583 {
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)){
            return 0;
        }
        // �൱���������������
        //dp[i][j] word1�±�Ϊi-1��word2�±�Ϊi-������������г���
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        int result = 0;
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
                result = Math.max(result,dp[i][j]);
            }
        }
        return word1.length() + word2.length()-2*result;
    }
}
