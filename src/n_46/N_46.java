package n_46;

import java.util.ArrayList;
import java.util.List;

public class N_46 {
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] n = {1, 2, 3};
        System.out.println(permute(n));

    }

    public static List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        return dfs(nums, used, 0, path, result);
    }

    static List<List<Integer>> dfs(int[] nums, boolean[] used, int depth, List<Integer> path, List<List<Integer>> result) {
        if (depth == nums.length) {
            result.add(new ArrayList<Integer>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, used, depth + 1, path, result);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }

        return result;

    }
}
