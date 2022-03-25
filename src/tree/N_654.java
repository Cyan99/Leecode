package tree;

public class N_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traverse(nums, 0, nums.length);
    }

    public TreeNode traverse(int[] num, int begin, int end){
        if(end - begin < 1){
            return null;
        }
        int[] max = searchMax(num, begin, end);
        TreeNode root = new TreeNode(max[0]);
        if(end - begin == 1){
            return new TreeNode(root.val);
        }
        int maxPos = max[1];
        root.left = traverse(num, begin, maxPos);
        root.right = traverse(num, maxPos+1, end);
        return root;


    }

    public int[] searchMax(int[] num, int begin, int end){
        int[] result = new int[2];
        result[0] = num[begin];
        result[1] = -1;
        for(int i = begin; i < end; i++){
            if(result[0] <= num[i]){
                result[0] = num[i];
                result[1] = i;
            }
        }
        return result;
    }

}
