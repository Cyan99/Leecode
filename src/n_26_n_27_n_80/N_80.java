package n_26_n_27_n_80;

public class N_80 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 5, 6};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int i = 2;
        int cur = 2;
        for (; i < nums.length; i++) {
            if (nums[i] != nums[cur - 2]) {
                nums[cur] = nums[i];
                cur++;
            }
        }
//    	System.out.println(cur);
        return cur;
    }
}
