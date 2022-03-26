package tree;

import java.util.ArrayList;
import java.util.HashMap;

public class N_501 {
    //没用二叉搜索树的性质，即中序遍历是有序的做的
//    HashMap<Integer, Integer> result = new HashMap<>();
//    public int[] findMode(TreeNode root) {
//        ArrayList<Integer> mode = new ArrayList<>();
//        traverse(root);
//        int max = Integer.MIN_VALUE;
//        for(int e: result.values()){
//            if(e > max){
//                max = e;
//            }
//        }
//        for(int e: result.keySet()){
//            if(result.get(e) == max){
//                mode.add(e);
//            }
//        }
//        int[] re = new int[mode.size()];
//        int i = 0;
//        for(int e:mode){
//            re[i++] = e;
//        }
//        return re;
//    }
//    public void traverse(TreeNode root){
//        if(root == null){
//            return;
//        }
//        if(root.left != null){
//            traverse(root.left);
//        }
//        result.put(root.val, result.getOrDefault(root.val,0)+1);
//        if(root.right != null){
//            traverse(root.right);
//        }
//    }

    //用二叉搜索树的性质，即中序遍历是有序的做的
    TreeNode pre = null;
    int count = 0;
    int maxCount = Integer.MIN_VALUE;
    ArrayList<Integer> temp = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        traverse2(root);
        int[] result = new int[temp.size()];
        int i = 0;
        for (int e : temp) {
            result[i++] = e;
        }
        return result;

    }


    public void traverse2(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse2(root.left);

        if (pre == null) {
            count = 1;
        } else if (pre.val == root.val) {
            count++;
        } else {
            count = 1;
        }
        if (count == maxCount) {
            temp.add(root.val);
        }
        if (count > maxCount) {
            maxCount = count;
            temp.clear();
            temp.add(root.val);
        }
        pre = root;
        traverse2(root.right);
    }
}
