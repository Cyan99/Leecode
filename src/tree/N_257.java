package tree;

import java.util.ArrayList;
import java.util.List;

public class N_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> valPath = new ArrayList<>();
        traverse(new String(""),root,valPath);
        return valPath;
    }


    public void traverse(String path,TreeNode root,ArrayList<String> valPath) {
        path = path + root.val;
        if(root.left != null){
            traverse(path+"->", root.left, valPath);
        }
        if(root.right != null){
            traverse(path+"->", root.right, valPath);
            return;
        }
        if(root.left == null && root.right == null){
            valPath.add(path);
           return;
        }
    }

    public static void main(String[] args) {
        N_257 test = new N_257();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        System.out.println(test.binaryTreePaths(t1));

    }
}
