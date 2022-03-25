package ÒÆ³ýÔªËØ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class N_26 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : nums) {
            set.add(e);
        }
        int length = set.size();
        List<Integer> list = new ArrayList<Integer>(set);
        System.out.println(list);
        Collections.sort(list);
        int i = 0;
        for (int e : list) {
            nums[i] = e;
            i++;
        }
        return length;
    }
}
