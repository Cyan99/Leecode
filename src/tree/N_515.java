package tree;

import sun.awt.image.ImageWatched;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class N_515 {
    //    public List<Integer> largestValues(TreeNode root) {
//        //解法：队列迭代
//        Queue<TreeNode> que = new LinkedList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//        if(root == null){
//            return result;
//        }
//        que.offer(root);
//        while(!que.isEmpty()){
//            int len = que.size();
//            ArrayList<Integer> single = new ArrayList<>();
//            while(len>0){
//                TreeNode temp = que.poll();
//                single.add(temp.val);
//                if(temp.left != null){
//                    que.offer(temp.left);
//                }
//                if(temp.right != null){
//                    que.offer(temp.right);
//                }
//                len--;
//            }
//            result.add(getMax(single));
//        }
//        return result;
//    }
    public int getMax(List<Integer> list) {
        Collections.sort(list);
        return list.get(list.size() - 1);
    }


    ArrayList<List<Integer>> l1 = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        //解法：递归

        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, 0);
        for (int i = 0; i < l1.size(); i++) {
            result.add(getMax(l1.get(i)));
        }
        return result;
    }

    public void traverse(TreeNode node, int depth) {
        depth++;
        TreeNode temp = node;
        if (temp == null) {
            return;
        }
        if (l1.size() < depth) {
            ArrayList<Integer> l2 = new ArrayList<>();
            l1.add(l2);
        }
        l1.get(depth - 1).add(temp.val);
        if (temp.left != null) {
            traverse(temp.left, depth);
        }
        if (temp.right != null) {
            traverse(temp.right, depth);
        }
    }
}
