package tree;

public class N_235 {
    //正常二叉树递归求二叉搜索树的最近公共祖先
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == p || root == q || root == null){
//            return root;
//        }
//        TreeNode left = lowestCommonAncestor(root.left, p, q);
//        TreeNode right = lowestCommonAncestor(root.right, p, q);
//        if(left == null && right != null){
//            return right;
//        }
//        if(left != null && right == null){
//            return left;
//        }
//        if(left != null){
//            return root;
//        }
//        return null;
//    }

    //利用二叉搜索树性质（有序）来求最近公共祖先，即如果祖先的数值【p,q】之间即为公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == null || root.val >= Math.min(p.val, q.val) && root.val <= Math.max(p.val, q.val)){
//            return root;
//        }
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
