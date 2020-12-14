package pro.kwongsui.leetcode.linkedlist;

public class Solution0092 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        int pos = 1;
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode start = null, p = null, node = head, q;
        while (node != null && pos <= n) {
            if (pos == m - 1) {
                start = node;
            } else if (m == 1) {
                start = sentinel;
            }
            q = node.next;
            if (pos >= m) {
                node.next = p;
                p = node;
            }
            node = q;
            pos++;
        }
        if (start != null && start.next != null) {
            start.next.next = node;
        }
        if (start != null) {
            start.next = p;
        }
        return sentinel.next;
    }
}
