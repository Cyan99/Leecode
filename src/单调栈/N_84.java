package ����ջ;

import java.util.Deque;
import java.util.LinkedList;

public class N_84 {
    // ˼·�ο���https://blog.csdn.net/Zolewit/article/details/88863970
    public int largestRectangleArea(int[] heights) {
        //����ջ��ջͷ -> ջ�ף� �����ݼ�
        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        int k = 1;
        for (int e : heights) {
            newHeights[k++] = e;
        }

        newHeights[newHeights.length - 1] = 0;

        Deque<Integer> deque = new LinkedList<>();
        deque.push(0);
        int result = 0;
        for (int i = 1; i < newHeights.length; i++) {
            if (newHeights[i] > newHeights[deque.peek()]) {
                deque.push(i);
            } else if (newHeights[i] == newHeights[deque.peek()]) {
                deque.pop();
                deque.push(i);
            } else {
                while (newHeights[i] < newHeights[deque.peek()]) {
                    int height = newHeights[deque.pop()]; // �������±� �������Χ�������
                    int width = i - deque.peek() - 1;
                    result = Math.max(result, height * width);
                }
                deque.push(i);
            }
        }
        return result;
    }
}
