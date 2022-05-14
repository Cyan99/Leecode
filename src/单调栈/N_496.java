package µ¥µ÷Õ»;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class N_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        Deque<Integer> deque = new LinkedList<Integer>();
        deque.push(nums2[0]);
        for(int i = 1; i < nums2.length; i++){
            System.out.println(deque);
            if(nums2[i] <= deque.peek()){
                deque.push(nums2[i]);
            }else{
                while(!deque.isEmpty() && nums2[i] > deque.peek()){
                    map.put(deque.peek(),nums2[i]);
                    deque.pop();
                }
                deque.push(nums2[i]);
            }
        }
        System.out.println(map);
        int i = 0;
        for(int e:nums1){
            result[i++] = map.getOrDefault(e,-1);
        }
        return result;
    }

//±©Á¦
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] result = new int[nums1.length];
//        Arrays.fill(result, -1);
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = find(nums2, nums1[i]) + 1; j < nums2.length; j++) {
//                if (nums2[j] > nums1[i]) {
//                    result[i] = nums2[j];
//                    break;
//                }
//            }
//        }
//        return result;
//    }
//
//    int find(int[] nums, int a) {
//        int i = -1;
//        for (int e : nums) {
//            i++;
//            if (e == a) {
//                return i;
//            }
//        }
//        return i;
//    }
}
