package tree;

import java.util.LinkedList;
import java.util.Queue;

public class N_116 {
    public Node connect(Node root) {
        Queue<Node> que = new LinkedList<>();
        Node temp = root;
        Node result = temp;
        if (root == null) {
            return temp;
        }
        temp.next = null;
        que.offer(temp);
        while (!que.isEmpty()) {
            int len = que.size();
            while (len > 0) {
                temp = que.poll();
                if (temp.left != null) {
                    que.offer(temp.left);
                    temp.left.next = temp.right;
                }
                if (temp.right != null) {
                    que.offer(temp.right);
                    if (temp.next != null) {
                        temp.right.next = temp.next.left;
                    } else {
                        temp.right.next = null;
                    }
                }
                len--;
            }
        }
        return result;
    }
}
