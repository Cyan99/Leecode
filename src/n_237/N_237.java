package n_237;

public class N_237 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public void deleteNode(ListNode node) {
        node.next = node.next.next;
        node.val = node.next.val;

    }
}
