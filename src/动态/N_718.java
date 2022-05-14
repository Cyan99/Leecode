package 动态;

public class N_718 {
    //    public int findLength(int[] nums1, int[] nums2) {
//        // dp[i][j] nums1下标为i，nums2下标为j的最长公共子数组
//        int[][] dp = new int[nums1.length][nums2.length];
//        int result = 0;
//        for (int i = 0; i < nums1.length; i++) {
//            if (nums1[i] == nums2[0]) {
//                dp[i][0] = 1;
//                result = 1;
//            }
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            if (nums1[0] == nums2[i]) {
//                dp[0][i] = 1;
//                result = 1;
//            }
//        }
//        for (int i = 1; i < nums1.length; i++) {
//            for (int j = 1; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                    result = Math.max(result, dp[i][j]);
//                }
//            }
//        }
//        return result;
//    }
    public int findLength(int[] nums1, int[] nums2) {
        // dp[i][j] nums1下标为i-1，nums2下标为j-1的最长公共子数组
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int result = 0;
        for (int i = 1; i < nums1.length + 1; i++) {
            for (int j = 1; j < nums2.length + 1; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return result;
    }
}
