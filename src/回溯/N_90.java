package »ØËİ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_90 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTrack(nums,0, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    public void backTrack(int[] nums, int startIndex, List<Integer> single, boolean[] used){
        result.add(new ArrayList<>(single));
        if(startIndex >= nums.length){
            return;
        }
        for(int i = startIndex; i < nums.length; i++){
            if(i > 0 && used[i-1] == false && nums[i] == nums[i-1]){
                continue;
            }
            used[i] = true;
            single.add(nums[i]);
            backTrack(nums, i +1,single, used);
            single.remove(single.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        N_90 test = new N_90();
        int[] nums = {1,2,2};
        System.out.println(test.subsetsWithDup(nums));
    }

}
