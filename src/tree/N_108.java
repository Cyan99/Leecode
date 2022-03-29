package tree;

public class N_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return traverse(nums, 0, nums.length -1);
    }

    public TreeNode traverse(int[] nums, int left, int right){
        if(left >= right){
            return null;
        }
        int rootPos = (right - left)/2 + left;
        TreeNode root = new TreeNode(nums[rootPos]);
        root.left = traverse(nums, left, rootPos - 1);
        root.right = traverse(nums, rootPos+1, right);
        return root;
    }

}
