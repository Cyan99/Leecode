package ̰��;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class N_714 {
    public int maxProfit(int[] prices, int fee) {
        int min = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
//           if(prices[i] > min && prices[i] <= min + fee){
//               continue;
//           }
           if(prices[i] > min +fee){
               //ǰ��Ʊ��ֵ > min+fee��������
               result += prices[i] - min - fee;
               // ���ǿ��ܲ������������㣬���Ը���min = prices[i] - fee �� ��������һ�������������ʱ�� -min �Ͱ�fee�ּӻ�����
               min = prices[i] - fee;
           }
           if(prices[i] < min){
               //��ǰ��Ʊ��ֵ��min��С��������
               min = prices[i];
           }
        }
    return result;
    }
}
