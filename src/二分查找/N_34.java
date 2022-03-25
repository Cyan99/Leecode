package 二分查找;

public class N_34 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 1, 2};
        int target = 2;
        for (int e : searchRange(nums, target))
            System.out.println(e);
    }

    public static int[] searchRange(int[] nums, int target) {
        int l = 0, mid = 0, temp = -1, i = 0, j = 0;
        int r = nums.length - 1;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                temp = mid;
                break;
            }
        }
        int[] a = {i, j};
        if (temp == -1) {
            a[0] = -1;
            a[1] = -1;
            return a;
        } else if (temp == 0) {
            if (nums.length != 1) {
                for (j = temp; j < nums.length && nums[j] == target; j++) ;
                a[0] = 0;
                a[1] = j - 1;
                return a;
            } else {
                return a;
            }
        } else if (temp == nums.length - 1) {
            for (i = temp; i > -1 && nums[i] == target; i--) ;
            a[0] = i + 1;
            a[1] = temp;
            return a;
        } else {
            for (i = temp; i > -1 && nums[i] == target; i--) {
                for (j = temp; j < nums.length && nums[j] == target; j++) ;
            }
            a[0] = i + 1;
            a[1] = j - 1;
            return a;
        }
    }
}
