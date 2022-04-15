package Ì°ÐÄ;

public class N_122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i+1] - prices[i] > 0){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        N_122 test = new N_122();
        System.out.println(test.maxProfit(prices));
    }
}
