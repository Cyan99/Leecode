package tree;

public class N_110 {

    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1;

    }

    public int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getDepth(root.left);
        if(left < 0){
            return -1;
        }
        int right = getDepth(root.right);
        if(right < 0){
            return -1;
        }
        if(Math.abs(left-right) <= 1){
            return Math.max(left, right) + 1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        N_110 test = new N_110();
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        System.out.println(test.isBalanced(t1));

    }

}
