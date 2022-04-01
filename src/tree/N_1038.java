package tree;

import java.io.IOException;
import java.net.URISyntaxException;

public class N_1038 {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }

    public void traverse(TreeNode root){
        if(root == null){
            return;
        }
        if(root.right != null){
            traverse(root.right);
        }
        sum += root.val;
        root.val = sum;
        if(root.left != null){
            traverse(root.left);
        }
    }

}
