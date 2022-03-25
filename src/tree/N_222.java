package tree;

import java.util.LinkedList;
import java.util.Queue;

public class N_222 {
    public int countNodes(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int count = 0;
        if (root == null) {
            return count;
        }
        while (!que.isEmpty()) {
            int len = que.size();
            count += len;
            while (len > 0) {
                TreeNode temp = que.poll();
                if (temp.left != null) {
                    que.offer(temp.left);
                }
                if (temp.right != null) {
                    que.offer(temp.right);
                }
                len--;
            }
        }
        return count;
    }

}
