package 单调栈;

import java.util.Deque;
import java.util.LinkedList;

public class N_42 {
    // 动态规划，dpLeft[i] 即i左边的最大高度, dpRight[i] 即i右边的最大高度
//    public int trap(int[] height) {
//        int result = 0;
//        int[] dpLeft = new int[height.length];
//        int[] dpRight = new int[height.length];
//        dpLeft[0] = height[0];
//        dpRight[height.length -1] = height[height.length -1];
//        for(int i = 1; i< height.length;i++){
//            dpLeft[i] = Math.max(dpLeft[i-1], height[i]);
//        }
//        for(int i = height.length - 2; i >= 0;i--){
//            dpRight[i] = Math.max(dpRight[i+1], height[i]);
//        }
//
//        for(int i = 0; i < height.length; i++){
//            result += Math.min(dpLeft[i], dpRight[i]) - height[i];
//        }
//        return result;
//    }
    // 单调栈，栈头 -> 栈底，递增
    public int trap(int[] height) {
        Deque<Integer> deque = new LinkedList<>();
        int result = 0;
        int h = 0;
        int w = 0;
        deque.push(0);
        for (int i = 1; i < height.length; i++) {
            if (height[i] < height[deque.peek()]) {
                deque.push(i);
            } else if (height[i] == height[deque.peek()]) {
                deque.pop();
                deque.push(i);
            } else {
                while (!deque.isEmpty() && height[i] > height[deque.peek()]) {
                    int temp = deque.pop();
                    if (!deque.isEmpty()) {
                        h = Math.min(height[deque.peek()], height[i]) - height[temp];
                        w = i - deque.peek() - 1;
                        result += h * w;
                    }
                }
                deque.push(i);
            }
        }
        return result;
    }
}
