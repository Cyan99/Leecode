package n_260;

import java.util.HashSet;

public class N_260 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {-1, 0};
        for (int e : singleNumber(nums))
            System.out.println(e);
    }

    public static int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[][] n = new int[set.size()][2];
        int h = 0;
        for (int e : set) {
            n[h][0] = e;
            h++;
        }
        for (int j = 0; j < set.size(); j++) {
            for (int k = 0; k < nums.length; k++) {
                if (n[j][0] == nums[k]) {
                    n[j][1]++;
                }
            }
        }
        int[] singleNumber = new int[2];
        int c = 0;
        for (int m = 0; m < set.size(); m++) {
            if (n[m][1] == 1) {
                singleNumber[c] = n[m][0];
                c++;
            }
        }
        return singleNumber;
    }
}
