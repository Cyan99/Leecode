package n_6;

public class N_6 {
    /*
     * ������ n �����۱ң�ÿ�ѵ��������������� coins �С�
     * ����ÿ�ο���ѡ������һ�ѣ��������е�һö������ö���������������۱ҵ����ٴ���
     *
     * �ٷ��ⷨ��
     * 	����ÿ����ȡ�Ĳ������໥�����ģ����ԾͲ������ر���Ⱥ�˳������ֻ��Ҫ�ӵ�һ�ѿ�ʼ��ȡ���ɡ�
     * 	Ϊ����ȡ�ٶ���죬����ÿ�ζ���ȡ��öӲ�ҡ�
     * 	��Ҫע����ǣ�Ҫ����ȡ��������ȡ������(coins[i] + 1) / 2��
     * 	��󣬶�ÿ�ѵ���ȡ����������ͻ�����ս����
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
