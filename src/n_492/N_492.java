package n_492;

public class N_492 {
    /*
     * ����Ƶľ���ҳ�������ڸ�����Ŀ�������
        ��� W ��Ӧ���ڳ��� L������֮��Ҫ�� L >= W ��
        ���� L �Ϳ�� W ֮��Ĳ��Ӧ��������С��
    �ٷ�˼·��
        �������⣬�� \sqrt{area} ��ʼ����ģ�⣬������һ���ܹ�����������ֵ���򷵻ظô�
     */
    public static void main(String[] args) {
        int[] a = constructRectangle(1);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] constructRectangle(int area) {
//�Լ��ⷨ
//		 int []c = new int[2];
//		 for(int i = 1; i <= Math.sqrt(area); i++) {
//			 if(area % i == 0) {
//				 c[0] = area/i;
//				 c[1] = i;
//			}
//		}
//		 return c;
//	    }
//�ٷ����
        int a = (int) Math.sqrt(area);
        while (area % a != 0) {
            a--;
        }
        return new int[]{area / a, a};
    }
}
