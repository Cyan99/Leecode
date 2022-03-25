package tree;

public class N_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean a = true, b = true;
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null && subRoot != null) {
            return false;
        } else if (root != null && subRoot == null) {
            return false;
        } else if (root.val != subRoot.val) {
            if (isSubtree(root.left, subRoot)) {
                a = isSubtree(root.left.left, subRoot.left) && isSubtree(root.left.right, subRoot.right);
            } else if (isSubtree(root.right, subRoot)) {
                b = isSubtree(root.right.left, subRoot.left) && isSubtree(root.right.right, subRoot.right);
            } else {
                return false;
            }
        }
        isSubtree(root.left, subRoot.left);
        isSubtree(root.right, subRoot.right);
        return a && b;
    }
}
