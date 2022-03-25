package n_240_n_74;

public class N_74 {
    /*˼��ͬN_74
     * ��ͬ�����ڣ�
     * ���ö��ַ����ң�����ÿ�еĵ�һ��Ԫ�ش���ǰһ�е����һ��Ԫ�أ���ÿ��Ԫ��������ģ�
        ����ÿ�еĵ�һ��Ԫ�ش���ǰһ�еĵ�һ��Ԫ�أ���˾����һ�е�Ԫ��������ġ�
        ���ǿ��ԶԾ���ĵ�һ�е�Ԫ�ض��ֲ��ң��ҵ����һ��������Ŀ��ֵ��Ԫ�أ�
        Ȼ���ڸ�Ԫ���������ж��ֲ���Ŀ��ֵ�Ƿ���ڡ�
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix, 13));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int a = 0;
        int b = matrix[0].length - 1;
        while (a < matrix.length && b > -1) {
            if (target < matrix[a][b]) {
                b--;
                continue;
            } else if (target > matrix[a][b]) {
                a++;
                continue;
            } else if (target == matrix[a][b]) {
                return true;
            }
        }
        return false;

    }
}
