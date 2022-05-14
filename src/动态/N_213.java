package ��̬;

public class N_213 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        //�ֳ������֣�һ���ֿ��ǲ������һ�䷿����һ���ֿ��ǲ�����һ�䷿
        return Math.max(robPart(0, nums.length - 2, nums), robPart(1, nums.length - 1, nums));
    }

    public int robPart(int start, int end, int[] nums) {
        if (start == end) {
            return nums[start];
        }
        int[] dp = new int[end - start + 1]; //dp[i]�Ƿ��Ӱ����±�i��ǰ��͵�Ե��������
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i + start]);
        }
        return dp[dp.length - 1];
    }
}
