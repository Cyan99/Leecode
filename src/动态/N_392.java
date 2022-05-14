package 动态;

import java.util.Arrays;

public class N_392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }        //dp[i][j] s下标为i-1是否为t下标为j-1的子序列
        boolean[][] dp = new boolean[s.length() + 1][t.length() + 1];
        dp[0][0] = true;
        char[] sC = s.toCharArray();
        char[] tC = t.toCharArray();
        for (int i = 1; i < t.length(); i++) {
            if (sC[0] == tC[i]) {
                dp[0][i] = true;
            }
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i; j <= t.length(); j++) {
                if (tC[j - 1] == sC[i - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
//    public boolean isSubsequence(String s, String t) {
    //暴力
//        char[] sC = s.toCharArray();
//        char[] tC = t.toCharArray();
//        int count = 0;
//        int flag = -1;
//        for (int j = 0; j < s.length(); j++) {
//            for (int i = j; i < t.length(); i++) {
//                if (tC[i] == sC[j] && i > flag) {
//                    count++;
//                    flag = i;
//                    break;
//                }
//            }
//        }
//        return count == s.length();
//    }
}
