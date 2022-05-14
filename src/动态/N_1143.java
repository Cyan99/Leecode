package ��̬;

public class N_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        //dp[i][j] ָ text1�±�Ϊi-1�� text2 �±�Ϊj-1������������г���
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        int result = 0;
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
         for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (t1[i - 1] == t2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                result = Math.max(dp[i][j], result);
            }
        }
        return result;
    }
}
