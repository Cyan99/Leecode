package 动态;

public class N_647 {
    // 暴力
//    public int countSubstrings(String s) {
//        int result = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                if(isHuiWen(s,i,j)){
//                    result++;
//                }
//            }
//        }
//        return result;
//    }
//
//    public boolean isHuiWen(String s, int start, int end) {
//        for (int i = 0; i < end - start + 1; i++) {
//            if (s.charAt(start+i) != s.charAt(end-i)) {
//                return false;
//            }
//        }
//        return true;
//    }

    public int countSubstrings(String s) {
        //dp[i][j] 即s的[i, j]是否为回文子串
        boolean[][] dp = new boolean[s.length()][s.length()];
        int result = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) {
                        dp[i][j] = true;
                        result++;
                    } else if (dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N_647 test = new N_647();
        System.out.println(test.countSubstrings("abc"));
    }
}
