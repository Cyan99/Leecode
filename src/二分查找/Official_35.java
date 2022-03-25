package ¶ş·Ö²éÕÒ;

public class Official_35 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.print(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = 0;
        while (l <= r) {
            mid = (r + l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return l;
    }
}
