package n_1;

public class N_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 3, 4, 2};

        for (int i : twoSum(nums, 6)) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] a = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    a[0] = i;
                    a[1] = j;
                    break;
                }
                sum = 0;
            }
        }
        return a;
    }
}
