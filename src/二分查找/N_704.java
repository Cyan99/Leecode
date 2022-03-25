package ¶ş·Ö²éÕÒ;

public class N_704 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(a, 14));
    }

    public static int search(int[] nums, int target) {
        int mid = 0;
        int l = 0;
        int r = nums.length;
        while (l < r) {
            mid = (r + l) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        if (l < nums.length) {
            if (nums[l] == target) {
                return l;
            }
        }
        return -1;
    }
}
