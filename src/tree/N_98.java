package tree;

import java.util.ArrayList;

public class N_98 {
    //根据中序遍历的二叉搜索树是一个有序序列判断
//    ArrayList<Integer> tree = new ArrayList<>();
//    public boolean isValidBST(TreeNode root) {
//        traverse(root);
//        for (int i = 0; i < tree.size() - 1; i++) {
//            if (tree.get(i) >= tree.get(i+1) ){
//                return false;
//            }
//        }
//        return true;
//    }
//    public void traverse(TreeNode root){
//        if(root == null){
//            return;
//        }
//        if(root.left != null) {
//            traverse(root.left);
//        }
//        tree.add(root.val);
//        if(root.right != null) {
//            traverse(root.right);
//        }
//    }

    //中序遍历的递归中判断
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        //左
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        //中
        if (pre != null && pre.val >= root.val) {
            return false;
        } else {
            pre = root;
        }
        //右
        return isValidBST(root.right);
    }
}
