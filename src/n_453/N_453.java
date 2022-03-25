package n_453;

public class N_453 {
//最小操作次数使数组元素相等
    //官方思路：因为只需要找出让数组所有元素相等的最小操作次数，所以我们不需要考虑数组中各个元素的绝对大小，
    //即不需要真正算出数组中所有元素相等时的元素值，只需要考虑数组中元素相对大小的变化即可

//对n-1个数加1，相当于对一个数减1

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 2, 3};
        System.out.print(minMoves(nums));
    }

    public static int minMoves(int[] nums) {
        int min = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < min) {
                min = nums[i + 1];
            }
        }
        for (int j = 0; j < nums.length; j++) {
            count += nums[j] - min;
        }
        return count;
    }
}
