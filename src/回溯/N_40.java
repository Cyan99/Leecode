package 回溯;

import java.util.*;

public class N_40 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // 排序是为了将重复的数字放到一起
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        backTrack(candidates,target, new ArrayList<Integer>(), 0, 0, used);
        return result;
    }
    public void backTrack(int[] candidates, int target, List<Integer> single, int sum, int startIndex, boolean[] used){
        //为了删除重复的元素，已经有了剪枝操作
        //所以sum > target可以省略
//        if(sum > target){
//            return;
//        }
        if(sum == target){
            result.add(new ArrayList<>(single));
            return;
        }
        for(int i = startIndex; i  < candidates.length; i++){
            if(i > 0 && used[i-1] == false && candidates[i] == candidates[i-1]){
                continue;
            }
            single.add(candidates[i]);
            used[i] = true;
            backTrack(candidates, target, single, sum+candidates[i],i+1, used);
            used[i] = false;
            single.remove(single.size()-1);
        }
    }

    public static void main(String[] args) {
        N_40 test = new N_40();
        int[] candidates = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(test.combinationSum2(candidates, 30));
    }
}
