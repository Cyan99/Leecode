package ÒÆ³ýÁ´±íÔªËØ;

import java.util.ArrayList;

public class N_206 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public ListNode reverseList(ListNode head) {
        ListNode a = new ListNode(-1, head);
        ArrayList<Integer> tmp = new ArrayList<>();
        while (a.next != null) {
            tmp.add(a.next.val);
            a = a.next;
        }
        ListNode result = a;
        for (int i = 0; i < tmp.size(); i++) {
            result.next = new ListNode(tmp.get(i), result.next);
        }
        return result.next;
    }
}
