package pro.kwongsui.leetcode.linkedlist;

public class Solution0061 {

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        int size = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            size++;
        }
        if (k == size) {
            return head;
        } else if (k < size) {
            return shiftRight(head, k);
        } else {
            return k % size == 0 ? head : shiftRight(head, k % size);
        }
    }

    private ListNode shiftRight(ListNode node, int k) {
        int i = 0;
        ListNode p = node;
        while (i != k) {
            p = p.next;
            i++;
        }
        ListNode q = node;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        ListNode r = q.next;
        p.next = node;
        q.next = null;
        return r;
    }
}
