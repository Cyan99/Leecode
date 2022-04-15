package Ì°ÐÄ;

public class N_376 {
    public int wiggleMaxLength(int[] nums) {
        int pre = 0;
        int result = 1;
        if (nums.length <= 1) {
            return nums.length;
        }
        int cur = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            cur = nums[i + 1] - nums[i];
            if (cur > 0 && pre <= 0 || cur < 0 && pre >= 0) {
                result++;
                pre = cur;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        N_376 test = new N_376();
        System.out.println(test.wiggleMaxLength(nums));
    }
}
