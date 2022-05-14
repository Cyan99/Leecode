package 贪心;

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
               //前股票价值 > min+fee，有利润
               result += prices[i] - min - fee;
               // 但是可能不是最终卖出点，所以更新min = prices[i] - fee ， 这样在下一次遇到有利润的时候 -min 就把fee又加回来了
               min = prices[i] - fee;
           }
           if(prices[i] < min){
               //当前股票价值比min还小，买入它
               min = prices[i];
           }
        }
    return result;
    }
}
