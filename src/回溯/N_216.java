package 回溯;

import java.util.*;

public class N_216 {
    static List<List<Integer>> result = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k,n, new LinkedList<Integer>(),1);
        return result;
    }

    public void backTrack(int k, int n, Deque<Integer> single, int start){
        if(sum > n){
            //剪枝
            return;
        }
        if(single.size() == k){
            if(sum == n){
                result.add(new ArrayList<>(single));
            }
            return;
        }
        for(int i = start; i <= 9 -(k-single.size()) + 1; i++){
            //原先是i<=9；现在多了剪枝
            //k-single.size() 是 还需要的数量
            // 9 -(k-single.size()) + 1 是最终for循环开始的位置，比这个大了剩余的数就不够k个了
            single.offer(i);
            sum += single.getLast();
            backTrack(k,n,single,i+1);
            sum -= single.pollLast();
        }
    }
//    public static void main(String[] args) {
//        N_216 test = new N_216();
//        test.combinationSum3(3,7);
//        System.out.println(result);
//    }
}
