package tree;

import javax.transaction.TransactionRequiredException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class N_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else if (left.val != right.val) {
            return false;
        }
        boolean out = compare(left.left, right.right);
        boolean in = compare(left.right, right.left);
        return out && in;
    }
}
