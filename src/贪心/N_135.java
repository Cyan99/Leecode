package ̰��;

public class N_135 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        int sum = 0;
        // ������̰����
        // ��һ�Σ���ǰ����ж��Һ��ӵ��ǹ������Һ��ӱ����Ӵ��Һ��ӵ��ǹ�Ϊ �����ǹ���+1
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1]+1;
            }else{
                candy[i] = 1;
            }
        }

        //�ڶ��Σ��Ӻ���ǰ���ж����ӵ��ǹ��������ӱ��Һ��Ӵ����ӵ��ǹ�Ϊ max{�Һ����ǹ���+1, ��һ��������ǹ���}
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
