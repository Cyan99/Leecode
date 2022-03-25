package ÒÆ³ıÔªËØ;

import java.util.Arrays;

public class N_977 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {-7, -3, 2, 3, 6};

        for (int e : sortedSquares(nums)) {
            System.out.println(e);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        for (int e : nums) {
            nums[i] = e * e;
            i++;
        }
//    	int temp = 0;
//    	for(int j = 0;  j < nums.length - 1; j++) {
//    		for(int k = 0; k < nums.length - 1; k++) {
//    			if(nums[k+1] < nums[k]) {
//    				temp = nums[k];
//    				nums[k] = nums[k+1];
//    				nums[k+1] = temp;
//    			}
//    		}
//    	}
        Arrays.sort(nums);
        return nums;
    }
}
