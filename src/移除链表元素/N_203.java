package ÒÆ³ýÁ´±íÔªËØ;


public class N_203 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ListNode head = new ListNode(7);
        head.next = new ListNode(7);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(7);
        removeElements(head, 7);

    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        ListNode result = head;

        while (result.next != null) {

            if (result.next.val == val) {
                result.next = result.next.next;
            } else {
                result = result.next;
            }
        }
        return head;

    }
}
