package »ØËİ;

import java.util.ArrayList;
import java.util.List;

public class N_39 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates, target, new ArrayList<Integer>(), 0);
        return result;
    }

    int newStart;
    public int backTrack(int[] candidates, int target, List<Integer> single, int start){
        newStart = start;
        int temp = getYu(single, target);
        if(temp == 0){
            newStart++;
            result.add(new ArrayList<>(single));
            return newStart;
        }
        if(temp < 0){
            return newStart;
        }
        for(int i = newStart; i< candidates.length; i++){
            single.add(candidates[i]);
            backTrack(candidates, target, single, i);
            single.remove(single.size()-1);
        }
        return newStart;


    }

    public int getYu(List<Integer> single, int target){
        int yu = target;
        for(int e:single){
            yu -= e;
        }
        return yu;
    }

    public static void main(String[] args) {
        N_39 test = new N_39();
        int[] candidates = {2,3,5};
        System.out.println(test.combinationSum(candidates, 8));
    }
}
