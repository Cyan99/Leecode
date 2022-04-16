package 贪心;

public class N_55 {
    public boolean canJump(int[] nums) {
        //跳跃覆盖范围究竟可不可以覆盖到终点
        if (nums.length == 1) {
            return true;
        }
        int cur = nums[0];
        for (int i = 0; i <= cur; i++) {
            cur = Math.max(cur, nums[i] + i );
            if(cur >= nums.length - 1  ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 3,2,1,0,4};
        N_55 test = new N_55();
        System.out.println(test.canJump(nums));
    }
}
