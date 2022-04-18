package 贪心;

public class N_135 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        int sum = 0;
        // 分两次贪心做
        // 第一次：从前向后，判断右孩子的糖果，即右孩子比左孩子大，右孩子的糖果为 左孩子糖果数+1
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1]+1;
            }else{
                candy[i] = 1;
            }
        }

        //第二次：从后向前，判断左孩子的糖果，即左孩子比右孩子大，左孩子的糖果为 max{右孩子糖果数+1, 上一轮算出的糖果数}
        for(int i= ratings.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i], candy[i+1]+1);
            }
        }
        for(int e:candy){
            sum += e;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] rating = {1,0,2};
        N_135 test = new N_135();
        System.out.println(test.candy(rating));
    }
}
