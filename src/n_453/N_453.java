package n_453;

public class N_453 {
//��С��������ʹ����Ԫ�����
    //�ٷ�˼·����Ϊֻ��Ҫ�ҳ�����������Ԫ����ȵ���С�����������������ǲ���Ҫ���������и���Ԫ�صľ��Դ�С��
    //������Ҫ�����������������Ԫ�����ʱ��Ԫ��ֵ��ֻ��Ҫ����������Ԫ����Դ�С�ı仯����

//��n-1������1���൱�ڶ�һ������1

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 2, 3};
        System.out.print(minMoves(nums));
    }

    public static int minMoves(int[] nums) {
        int min = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < min) {
                min = nums[i + 1];
            }
        }
        for (int j = 0; j < nums.length; j++) {
            count += nums[j] - min;
        }
        return count;
    }
}
