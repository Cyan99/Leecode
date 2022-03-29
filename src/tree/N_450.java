package tree;

public class N_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }else if(root.val == key) {
           if(root.left == null && root.right == null){
               return null;
           }else if (root.left == null) {
                return root.right;
           } else if (root.right == null) {
                return root.left;
            }else{
                TreeNode cur = root.right;
                while (cur.left != null) {
                    cur = cur.left;
                }
                cur.left = root.left;
                root = root.right;
                return root;
            }
        }
        return root;
    }

}
