package ��̬;

public class N_62 {
    public int uniquePaths(int m, int n) {
/**
         * 1. ȷ��dp�����±꺬�� dp[i][j] ��ÿһ��������ܵ�·������
         * 2. ���ƹ�ʽ dp[i][j] = dp[i-1][j] dp[i][j-1]
         * 3. ��ʼ�� dp[i][0]=1 dp[0][i]=1 ��ʼ�������Ϳ�
         * 4. ����˳�� һ��һ�б���
         * 5. �Ƶ���� ����������������
         * **/

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}
