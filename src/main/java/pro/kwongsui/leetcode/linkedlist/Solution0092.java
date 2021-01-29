package pro.kwongsui.leetcode.linkedlist;

public class Solution0092 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode p = sentinel;
        for(int i = 0; i < m - 1; i++) {
            p = p.next; // p 即 m - 1 节点
        }
        ListNode q = p.next, r; // q 即 m 节点
        for(int i = m; i < n; i++) {
            r = q.next;
            q.next = r.next; // 反转后 q 指向 n + 1 节点
            r.next = p.next;
            p.next = r; // 反转后 p 指向 n 节点
        }
        return sentinel.next;
    }

    public ListNode reverseBetween1(ListNode head, int m, int n) {
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
