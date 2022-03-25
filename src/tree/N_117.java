package tree;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

public class N_117 {

    public Node connect(Node root) {
        Queue<Node> que = new LinkedList<>();
        if (root != null) {
            que.offer(root);
        }
        while (!que.isEmpty()) {
            int len = que.size();
            Node temp = que.poll();
            if (temp.left != null) {
                que.offer(temp.left);
            }
            if (temp.right != null) {
                que.offer(temp.right);
            }

            for (int i = 1; i < len; i++) {
                Node next = que.poll();
                if (next.left != null) {
                    que.offer(next.left);
                }
                if (next.right != null) {
                    que.offer(next.right);
                }
                temp.next = next;
                temp = next;
            }
        }
        return root;
    }
}
