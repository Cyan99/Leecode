package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_429 {

    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            ArrayList<Integer> single = new ArrayList<>();
            int len = que.size();
            while (len > 0) {
                Node temp = que.poll();
                single.add(temp.val);
                int l = temp.children.size();
                int flag = 0;
                while (l > 0) {
                    que.offer(temp.children.get(flag++));
                    l--;
                }
                len--;
            }
            result.add(single);
        }
        return result;
    }
}
