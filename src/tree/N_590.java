package tree;

import java.util.ArrayList;
import java.util.List;

public class N_590 {
    ArrayList<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        //ºóĞò£º×óÓÒÖĞ
        traverse(root);
        return result;
    }

    public void traverse(Node node) {
        if (node == null) {
            return;
        }
        for (int i = 0; i < node.children.size(); i++) {
            traverse(node.children.get(i));
        }
        result.add(node.val);
    }
}
