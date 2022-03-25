package n_6;

public class N_6 {
    /*
     * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。
     * 我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数
     *
     * 官方解法：
     * 	由于每堆拿取的操作事相互独立的，所以就不存在特别的先后顺序，我们只需要从第一堆开始拿取即可。
     * 	为了拿取速度最快，我们每次都拿取两枚硬币。
     * 	需要注意的是，要对拿取次数向上取整，即(coins[i] + 1) / 2。
     * 	最后，对每堆的拿取次数进行求和获得最终结果。
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] coins = {4, 2, 1};
        System.out.print(minCount(coins));

    }

    public static int minCount(int[] coins) {
        int sum = 0;
        for (int i : coins) {
            if (i % 2 == 0) {
                sum += i / 2;
            } else {
                sum += i / 2 + 1;
            }
        }
        return sum;
    }

}
