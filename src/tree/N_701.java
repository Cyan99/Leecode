package tree;

import javax.management.remote.rmi._RMIConnection_Stub;

public class N_701 {
    //递归插入，遇到空节点就按二叉搜索树的规则插入
//    public TreeNode insertIntoBST(TreeNode root, int val) {
//        if(root == null){
//            return new TreeNode(val);
//        }
//        if(root.val > val){
//            root.left = insertIntoBST(root.left, val);
//        }
//        if(root.val < val){
//            root.right = insertIntoBST(root.right, val);
//        }
//        return root;
//    }
    //迭代插入
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode (val);
        }
        TreeNode cur = root;
        TreeNode pre = root;
        while (cur != null) {
            pre = cur;
            if (cur.val > val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        if (pre.val > val) {
            pre.left = new TreeNode(val);
        } else {
            pre.right = new TreeNode(val);
        }
        return root;
    }
}
