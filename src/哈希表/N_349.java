package ¹şÏ£±í;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class N_349 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2};
        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int e : nums1) {
            map1.put(e, map1.getOrDefault(e, 0) + 1);
        }
        for (int e : nums2) {
            map2.put(e, map2.getOrDefault(e, 0) + 1);
        }
        HashSet<Integer> result = new HashSet<Integer>();
        for (int e : nums1) {
            if (map2.containsKey(e)) {
                result.add(e);

            }
        }
        int[] list = new int[result.size()];
        int i = 0;
        for (int e : result) {
            list[i] = e;
            i++;
            //System.out.println(e);
        }
        return list;
    }
}
