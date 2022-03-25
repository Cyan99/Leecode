package n_869;

import java.util.ArrayList;
import java.util.List;

public class N_869 {
    static List<Integer> list = new ArrayList<Integer>();
    static int length = 0;

    public static void main(String[] args) {
        System.out.println(reorderedPowerOf2(17));

    }

    public static boolean reorderedPowerOf2(int n) {
        while (n != 0) {
            length++;
            list.add(n % 10);
            n /= 10;
        }
        int[] nums = new int[length];
        boolean[] used = new boolean[length];
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<Integer>();
        int i = 0;
        for (int e : list) {
            nums[i] = e;
            i++;
        }
        dfs(0, nums, used, path, result);
        System.out.println(result);
        int[] re = new int[result.size()];
        for (int j = 0; j < re.length; j++) {
            for (int k = 0; k < length; k++) {
                re[j] = re[j] * 10 + result.get(j).get(k);
            }
        }
        if (re.length == 1 && re[0] == 1) {
            return true;
        }
        boolean r;
        for (int e : re) {
            r = PowerOf2(e);
            System.out.println(e + " " + r);
            if (r == true) {
                return true;
            }
        }
        return false;
    }

    static void dfs(int depth, int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> result) {
        if (depth == length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(depth + 1, nums, used, path, result);

                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    static boolean PowerOf2(int n) {
        int count = 0;
        int m = n;
        while (m != 1) {
            if (m % 2 == 0) {
                count++;
                m /= 2;
            } else {
                return false;
            }
        }
        if (Math.pow(2, count) == n) {
            if (n == 1) {
                return false;
            } else {
                return true;
            }

        } else {
            return false;
        }
    }

}
