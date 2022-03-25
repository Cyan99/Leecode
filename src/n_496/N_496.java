package n_496;

import java.util.HashMap;

public class N_496 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums1 = new int[]{1, 3, 5, 2, 4};
        int[] nums2 = new int[]{6, 5, 4, 3, 2, 1, 7};
        for (int e : nextGreaterElement(nums1, nums2)) {
            System.out.println(e);
        }

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] a = new int[nums1.length];
        int flag = 0;
        for (int e : nums2) {
            flag++;
            map.put(e, flag);
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = map.get(nums1[i]); j <= nums2.length; j++) {
                if (j == nums2.length) {
                    a[i] = -1;
                } else if (nums1[i] < nums2[j]) {
                    a[i] = nums2[j];
                    break;
                }

            }
        }
        return a;
    }

}
