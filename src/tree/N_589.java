package tree;

import java.util.ArrayList;
import java.util.List;

public class N_589 {
    ArrayList<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        //Ç°Ğò£ºÖĞ×óÓÒ
        traverse(root);
        return result;
    }

    public void traverse(Node node) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        for (int i = 0; i < node.children.size(); i++) {
            traverse(node.children.get(i));
        }
    }
}
