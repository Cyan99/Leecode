package »ØËİ;

import java.util.ArrayList;
import java.util.List;

public class N_46 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backTrack(nums, new ArrayList<>(), new int[21]);
        return result;
    }

    public void backTrack(int[] nums, List<Integer> single, int[] used){
        if(single.size() == nums.length){
            result.add(new ArrayList<>(single));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i+10] == 1 ){
                continue;
            }else{
                used[i + 10] = 1;
                single.add(nums[i]);
                backTrack(nums,  single,used);
                single.remove(single.size()-1);
                used[i+10] = 0;
            }

        }
    }
    public static void main(String[] args) {
        N_46 test = new N_46();
        int[] nums = {1,2,3};
        System.out.println(test.permute(nums));
    }
}
