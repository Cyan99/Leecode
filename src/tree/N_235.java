package tree;

public class N_235 {
    //�����������ݹ�������������������������
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

    //���ö������������ʣ�������������������ȣ���������ȵ���ֵ��p,q��֮�伴Ϊ��������
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
