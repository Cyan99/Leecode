package ÒÆ³ıÔªËØ;

public class N_283 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int e : nums) {
            System.out.println(e);
        }

    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == 0) {
                while (nums[j] == 0) {
                    j++;
                    if (j >= nums.length) {

                        break;
                    }
                }
                if (j >= nums.length) {
                    break;
                }
                nums[i] = nums[j];
                nums[j] = 0;
            } else {
                i++;
                j++;
            }
        }
    }
}
