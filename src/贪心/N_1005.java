package ̰��;

import java.util.Arrays;

public class N_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int flag = -1; //��ʾnums�������Ľ��紦
        int sum = 0;
        for (int e : nums) {
            flag++;
            if (e >= 0) {
                break;
            }
        }
        if (flag > 0) {
            // nums�и�������k�����ڵĸ���ȫ����Ϊ�෴�����ֲ����ţ��þ���ֵ��ĸ�����Ϊ��������ǰ��ֵ�ﵽ���
            for (int i = 0; i < Math.min(flag, k); i++) {
                nums[i] *= -1;
            }
        }
        int count = k - flag;
        if (count == k) {
            nums[0] *= k % 2 * (-1);
        } else if (count > 0) {
            //��������Ϊ������������Ҫ����ŵĸ���Ϊcount���ٰ���������С�ı�һ��
            int temp = count % 2 * (-1);
            Arrays.sort(nums);
            if (temp != 0){
                nums[0] *= -1;
            }
        }
        for (int e : nums) {
            sum += e;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-8,3,-5,-3,-5,-2};
        N_1005 test = new N_1005();
        System.out.println(test.largestSumAfterKNegations(nums, 6));
    }
}
