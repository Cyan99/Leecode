package ¹şÏ£±í;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class N_350 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2};
        intersect(nums1, nums2);
    }

    //    public static int[] intersect(int[] nums1, int[] nums2) {
//    	HashMap<Integer, Integer> map1 = new HashMap<>();
//    	HashMap<Integer, Integer> map2 = new HashMap<>();
//    	List<Integer> list = new ArrayList<>();
//    	for(int e:nums1) {
//    		map1.put(e, map1.getOrDefault(e, 0)+1);
//    	}
//    	for(int e:nums2) {
//    		map2.put(e, map2.getOrDefault(e, 0)+1);
//    	}
//    	for(int e:nums1) {
//    		if( map2.containsKey(e) &&  map2.get(e) >0) {
//    			list.add(e);
//    			map2.put(e, map2.get(e)-1);
//    		}
//    	}
//    	
//    	int i = 0;    	
//    	int[] result = new int[list.size()];
//    	for(int e:list) {
//    		result[i++] = e;
////    		System.out.println(e);
//    	}
//    	return result;
//    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int e : nums1) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        for (int e : nums2) {
            if (map.getOrDefault(e, 0) > 0) {
                list.add(e);
                map.put(e, map.get(e) - 1);
                if (map.get(e) <= 0) {
                    map.remove(e);
                }
            }

        }
        int i = 0;
        int[] result = new int[list.size()];
        for (int e : list) {
            result[i++] = e;
//  		System.out.println(e);
        }
        return result;
    }
}
