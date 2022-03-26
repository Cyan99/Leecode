package tree;

import java.util.ArrayList;

public class N_530 {
    //����������õ�������������������Сֵ
    //    ArrayList<Integer> bst = new ArrayList<>();
//    public int getMinimumDifference(TreeNode root) {
//        traverse(root);
//        int min = Integer.MAX_VALUE;
//        for (int i = 1; i < bst.size(); i++) {
//            min = Math.min( Math.abs(bst.get(i) - bst.get(i - 1)), min);
//        }
//        return min;
//    }
//
//    public void traverse(TreeNode root){
//        if(root == null){
//            return;
//        }
//        if(root.left!=null){
//            traverse(root.left);
//        }
//        bst.add(root.val);
//        if(root.right != null){
//            traverse(root.right);
//        }
//    }

    //�ڵݹ�������Сֵ
    TreeNode pre = null;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            getMinimumDifference(root.left);
        }
        if (pre != null && Math.abs(pre.val - root.val) < min) {
            min = Math.abs(pre.val - root.val);
        }
        pre = root;
        if (root.right != null) {
            getMinimumDifference(root.right);
        }
        return min;

    }
}
