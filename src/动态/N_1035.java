package 动态;

public class N_1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        //dp[i][j] nums1下标i-1，nums2下标j-1的最大连线数
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int result = 0;
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
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
