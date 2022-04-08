package »ØËİ;

import java.util.ArrayList;
import java.util.List;

public class N_78 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums, new ArrayList<>(),0);
        return result;
    }

    public void backTrack(int[] nums, List<Integer> single, int startIndex){
        result.add(new ArrayList<>(single));
        if(startIndex >= nums.length){
            return;
        }
        for(int i = startIndex; i < nums.length; i++){
            single.add(nums[i]);
            backTrack(nums, single, i + 1);
            single.remove(single.size()-1);
        }

    }

    public static void main(String[] args) {
        N_78 test = new N_78();
        int[] nums = {1,2,3};
        System.out.println(test.subsets(nums));
    }
}
