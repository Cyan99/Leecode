package »ØËÝ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_47 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backTrack(nums, new int[nums.length], new ArrayList<>());
        return result;
    }

    public void backTrack(int[] nums, int[] used, ArrayList<Integer> single){
        if(single.size() == nums.length){
            result.add(new ArrayList<>(single));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1] && used[i-1] == 0 || used[i] == 1){
                continue;
            }else{
                used[i] = 1;
                single.add(nums[i]);
                backTrack(nums, used, single);
                used[i] = 0;
                single.remove(single.size()-1);
            }

        }

    }

    public static void main(String[] args) {
//        N_47 test = new N_47();
//        int[] nums = {3,3,0,3};
//        System.out.println(test.permuteUnique(nums));
        String s = "";
        if(s.isEmpty()){
            s = "1";
        }
        System.out.println(s);
    }
}
