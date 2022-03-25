package tree;

public class N_105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return traverse(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode traverse(int[] preorder, int preBegin, int preEnd,
                             int[] inorder, int inBegin, int inEnd){
        if(inEnd - inBegin < 1){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preBegin]);
        if(inEnd - inBegin == 1){
            return new TreeNode(root.val);
        }

        int rootPos = search(inorder, root.val);
        root.left = traverse(preorder, preBegin+1, preBegin +1+ rootPos-inBegin,inorder,inBegin, rootPos);
        root.right = traverse(preorder, preEnd - (inEnd-rootPos-1), preEnd,inorder,rootPos +1, inEnd);

        return root;
    }

    public int search(int[] a, int target){
        int i = -1;
        for(int e:a){
            i++;
            if(e == target){
                return i;
            }
        }
        return i;
    }


}
