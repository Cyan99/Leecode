package tree;

public class n_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return traverse(inorder, 0, inorder.length -1,postorder, 0, postorder.length-1);
    }

    public TreeNode traverse(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight){
        if((inRight - inLeft) == 1){
            return new TreeNode(inorder[inLeft]);
        }
        if((inRight - inLeft) < 1){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postRight]);
        int rootPos = search(inorder, root.val);
        root.left = traverse(inorder, inLeft, rootPos, postorder, postLeft, postLeft + rootPos - inLeft);
        root.right = traverse(inorder, rootPos +1, inRight, postorder, postLeft + rootPos - inLeft, postRight - 1);
        return root;

    }
    public int search(int[] a, int target) {
        int i = -1;
        for (int e : a) {
            i++;
            if (e == target) {
                return i;
            }
        }
        return i;
    }


}
