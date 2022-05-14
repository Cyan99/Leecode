package µ¥µ÷Õ»;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class N_503 {
    //    public int[] nextGreaterElements(int[] nums) {
//        int[] rightResult = new int[nums.length];
//        Arrays.fill(rightResult, Integer.MAX_VALUE);
//
//        Deque<Integer> deque = new LinkedList<>();
//        deque.push(0);
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] <= nums[deque.peek()]) {
//                deque.push(i);
//            } else {
//                while (!deque.isEmpty() && nums[i] > nums[deque.peek()]) {
//                    rightResult[deque.peek()] = nums[i];
//                    deque.pop();
//                }
//                deque.push(i);
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (rightResult[i] == Integer.MAX_VALUE) {
//                for (int j = 0; j <= i; j++) {
//                    if (nums[j] > nums[i]) {
//                        rightResult[i] = nums[j];
//                        break;
//                    }
//                    if (j == i) {
//                        rightResult[i] = -1;
//                    }
//                }
//            }
//        }
//        return rightResult;
//    }
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        Deque<Integer> deque = new LinkedList<>();
        deque.push(0);
        for (int i = 1; i < nums.length * 2 ; i++) {
            if (nums[i % nums.length] <= nums[deque.peek()]) {
                deque.push(i % nums.length);
            } else {
                while (!deque.isEmpty() && nums[i % nums.length] > nums[deque.peek()]) {
                    result[deque.peek()] = nums[i % nums.length];
                    deque.pop();
                }
                deque.push(i % nums.length);
            }
        }
        return result;
    }
}