package 贪心;

import tree.TreeNode;

public class N_968 {
    int result = 0;
    public int minCameraCover(TreeNode root) {
        if(traversal(root) == 0){
            result++;
        }
        return result;
    }

    private int traversal (TreeNode root){
        // 0：该节点未覆盖；
        // 1：该节点被覆盖；
        // 2：该节点有摄像头
        if(root == null){
            //如果是空节点，标记其为覆盖状态
            return 1;
        }
        int left = traversal(root.left);
        int right = traversal(root.right);
        if(left == 0 || right == 0){
            // 如果左右节点有一个没覆盖，父节点应该有摄像头
            result++;
            return 2;
        }
        if(left == 1 && right == 1){
            // 如果左右节点都被覆盖，父节点应该是未覆盖状态
            return 0;
        }
//        if(left == 2 || right == 2){
            // 如果左右节点有一个有摄像头，父节点应该是覆盖状态
            return 1;
//        }
//        return result;
    }
}
