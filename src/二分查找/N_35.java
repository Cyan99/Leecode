package ¶ş·Ö²éÕÒ;

public class N_35 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 3, 6, 7};
        int target = 2;
        System.out.print(searchInsert(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        int flag = 0;
        int l = -1;
        for (int e : nums) {
            if (e == target) {
                return i;
            }
            i++;
            if (e > target && flag < 1) {
                flag++;
                l = i - 1;
            }
        }
        if (l == -1) {
            l = nums.length;
        }
        return l;
    }
}
