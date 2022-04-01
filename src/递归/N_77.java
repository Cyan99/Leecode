package 递归;

import java.util.ArrayList;
import java.util.List;

public class N_77 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> single = new ArrayList<>();
        backTrack(n,k, single, 1);

        return result;
    }

    public void backTrack(int n, int k, List<Integer> single, int start){
        if(single.size() == k){
            result.add(new ArrayList(single));
            return;
        }

//        for (int i = start; i <= n; i++) {
        //优化剪枝
        // 还需要的节点数：k-single.size()
        // 起始位置：n - (k -single.size()) + 1，start大于这个位置后面的就不足以满足k个了
        for (int i = start; i <= n - (k -single.size()) + 1 ; i++) {
            single.add(i);
            backTrack(n, k, single, i+1);
            single.remove(single.size()-1);
        }

    }

    public static void main(String[] args) {
        N_77 test = new N_77();
        test.combine(4,2);
    }
}
