package 长度最小的子数组;

public class N_209 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 4, 4};
        System.out.print(minSubArrayLen(8, nums));

    }

    public static int minSubArrayLen(int target, int[] nums) {

        int len = 0;
        int result = Integer.MAX_VALUE;
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int temp = i;
            int flag = 0;
            for (int j = i; j < nums.length; j++) {
                while (temp <= j) {
                    sum += nums[temp];
                    flag++;
                    temp++;
                    if (sum >= target) {
                        m++;
                        len = flag;
                        if (len < result) {
                            result = len;
                        }
                    }
                }
            }
        }
        if (m == 0) {
            return 0;
        }
        return result;
    }
}
