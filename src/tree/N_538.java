package tree;

import java.util.ArrayList;

public class N_538 {
    ArrayList<Integer> tree = new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
        getAll(root);
        for (int i = 0; i < tree.size(); i++) {
            for (int j = i + 1; j < tree.size(); j++) {
                tree.set(i, tree.get(i) + tree.get(j));
            }
        }
        return rebuild(tree, root, 0);
    }

    public TreeNode rebuild(ArrayList<Integer> num, TreeNode root, int i) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            rebuild(num, root, i);
        }
        root.val = num.get(i++);
        if (root.right != null) {
            rebuild(num, root, i);
        }
        return root;
    }


    public TreeNode getAll(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            getAll(root.left);
        }
        tree.add(root.val);
        if (root.right != null) {
            getAll(root.right);
        }
        return root;
    }
}
