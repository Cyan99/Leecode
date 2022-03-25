package n_260;

import java.util.HashMap;

public class Official {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {0, 1};
//		singleNumber(nums);
        for (int e : singleNumber(nums))
            System.out.println(e);
    }

    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        int b = 0;
        int[] singleNumber = new int[2];
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                singleNumber[b] = i;
                b++;
            }
        }
        return singleNumber;
    }

}
