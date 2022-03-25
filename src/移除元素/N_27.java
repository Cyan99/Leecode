package ÒÆ³ıÔªËØ;

public class N_27 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 3, 2, 2, 3};
        int val = 2;
        removeElement(nums, val);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int e : nums) {
            if (e != val) {
                nums[i] = e;
                i++;
            }
        }
//    	System.out.println(i);
        return i;
    }

}
