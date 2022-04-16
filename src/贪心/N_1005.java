package 贪心;

import java.util.Arrays;

public class N_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int flag = -1; //表示nums中正负的交界处
        int sum = 0;
        for (int e : nums) {
            flag++;
            if (e >= 0) {
                break;
            }
        }
        if (flag > 0) {
            // nums有负数，把k个以内的负数全部变为相反数（局部最优：让绝对值大的负数变为正数，当前数值达到最大）
            for (int i = 0; i < Math.min(flag, k); i++) {
                nums[i] *= -1;
            }
        }
        int count = k - flag;
        if (count == k) {
            nums[0] *= k % 2 * (-1);
        } else if (count > 0) {
            //负数都变为正数，但还有要变符号的个数为count，再把正数里最小的变一下
            int temp = count % 2 * (-1);
            Arrays.sort(nums);
            if (temp != 0){
                nums[0] *= -1;
            }
        }
        for (int e : nums) {
            sum += e;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-8,3,-5,-3,-5,-2};
        N_1005 test = new N_1005();
        System.out.println(test.largestSumAfterKNegations(nums, 6));
    }
}
