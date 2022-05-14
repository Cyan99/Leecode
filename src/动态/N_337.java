package 动态;

public class N_337 {
    public int rob(TreeNode root) {
        int[] val = find(root);
        return Math.max(val[0], val[1]);
    }

    public int[] find(TreeNode root) {
        int[] dp = new int[2]; // 0表示不偷该节点的最大金额；1表示偷该节点的最大金额
        if (root == null) {
            return dp;
        }
        int[] left = find(root.left);
        int[] right = find(root.right);
        //如果不偷当前节点
        dp[0] = Math.max(left[1], left[0]) + Math.max(right[1], right[0]);
        //如果偷当前节点
        dp[1] = root.val + left[0] + right[0];
        return dp;
    }
}
