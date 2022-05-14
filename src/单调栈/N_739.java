package µ¥µ÷Õ»;

import java.util.Deque;
import java.util.LinkedList;

public class N_739 {
    // ±©Á¦
//    public int[] dailyTemperatures(int[] temperatures) {
//        int[] result = new int[temperatures.length];
//        for (int i = 0; i < temperatures.length; i++) {
//
//            for(int j = i +1; j < temperatures.length; j++){
//                if (temperatures[j] - temperatures[i] <= 0) {
//
//                }else{
//                    result[i] = j-i;
//                    break;
//                }
//                if(j == temperatures.length -1){
//                    result[i] = 0;
//                }
//            }
//
//        }
//        return result;
//    }
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[temperatures.length];
        deque.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] == temperatures[deque.peek()]) {
                deque.push(i);
            } else if (temperatures[i] < temperatures[deque.peek()]) {
                deque.push(i);
            } else {
                while (!deque.isEmpty() && temperatures[i] > temperatures[deque.peek()]) {
                    result[deque.peek()] = i - deque.peek();
                    deque.pop();
                }
                deque.push(i);
            }
        }
        return result;
    }
}
