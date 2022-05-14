package ��̬;

public class N_337 {
    public int rob(TreeNode root) {
        int[] val = find(root);
        return Math.max(val[0], val[1]);
    }

    public int[] find(TreeNode root) {
        int[] dp = new int[2]; // 0��ʾ��͵�ýڵ������1��ʾ͵�ýڵ�������
        if (root == null) {
            return dp;
        }
        int[] left = find(root.left);
        int[] right = find(root.right);
        //�����͵��ǰ�ڵ�
        dp[0] = Math.max(left[1], left[0]) + Math.max(right[1], right[0]);
        //���͵��ǰ�ڵ�
        dp[1] = root.val + left[0] + right[0];
        return dp;
    }
}
