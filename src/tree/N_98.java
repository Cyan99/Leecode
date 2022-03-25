package tree;

import java.util.ArrayList;

public class N_98 {
    ArrayList<Integer> tree = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        traverse(root);
        for (int i = 0; i < tree.size() - 1; i++) {
            if (tree.get(i) >= tree.get(i+1) ){
                return false;
            }
        }
        return true;
    }
    public void traverse(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null) {
            traverse(root.left);
        }
        tree.add(root.val);
        if(root.right != null) {
            traverse(root.right);
        }
    }

}
