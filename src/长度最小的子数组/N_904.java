package 长度最小的子数组;

import java.util.HashMap;

public class N_904 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 2, 3, 2, 2};
        System.out.print(totalFruit(nums));

    }

    public static int totalFruit(int[] fruits) {
        int l = 0;
        int result = Integer.MIN_VALUE;
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int r = 0; r < fruits.length; r++) {
            set.put(fruits[r], set.getOrDefault(fruits[r], 0) + 1);
            while (set.size() > 2) {
                set.put(fruits[l], set.get(fruits[l]) - 1);
                if (set.get(fruits[l]) == 0) {
                    set.remove(fruits[l]);
                }
                l++;
            }
            result = Math.max(result, r - l + 1);

        }
        return result == Integer.MIN_VALUE ? 0 : result;
    }
}
