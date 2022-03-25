package ¹şÏ£±í;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_18 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {-3, -2, -1, 0, 0, 1, 2, 3};
        System.out.println(fourSum(nums, 0));

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    if ((nums[i] + nums[j] + nums[left] + nums[right]) < target) {
                        left++;
                    } else if ((nums[i] + nums[j] + nums[left] + nums[right]) > target) {
                        right--;
                    } else {
                        if (!result.contains(Arrays.asList(nums[i], nums[j], nums[left], nums[right]))) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        }
                        left++;
                        right--;

                    }
                }
            }
        }
        return result;
    }

}
