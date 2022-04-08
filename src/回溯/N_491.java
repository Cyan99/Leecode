package »ØËİ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class N_491 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backTrack(nums,0, new ArrayList<Integer>());
        return result;
    }

    public void backTrack(int[] nums, int startIndex, ArrayList<Integer> single){
        if(single.size() > 1){
            result.add(new ArrayList<>(single));
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = startIndex; i < nums.length;i++){
            if( !single.isEmpty() && nums[i] < single.get(single.size()-1) || set.contains(nums[i]) ) {
                continue;
            }else{
                set.add(nums[i]);
                single.add(nums[i]);
                backTrack(nums,i+1,single);
                single.remove(single.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        N_491 test = new N_491();
        int[] nums = {4,4,3,2,1};
        System.out.println(test.findSubsequences(nums));
    }

}
