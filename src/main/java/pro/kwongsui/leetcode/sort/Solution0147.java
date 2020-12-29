package pro.kwongsui.leetcode.sort;

import pro.kwongsui.leetcode.linkedlist.ListNode;

public class Solution0147 {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode(-1);
        ListNode q = head;
        while (q != null) {
            ListNode p = sentinel;
            while (p.next != null && p.next.val <= q.val) {
                p = p.next;
            }
            ListNode r = q.next;
            q.next = p.next;
            p.next = q;
            q = r;
        }
        return sentinel.next;
    }

    public ListNode insertionSortList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode p = head, q = head.next;
        p.next = q.next;
        while (q != null) {
            if (p.val <= q.val) {
                p = q;
            } else {
                ListNode r = sentinel;
                p.next = q.next;
                while (r.next.val <= q.val) {
                    r = r.next;
                }
                q.next = r.next;
                r.next = q;
            }
            q = p.next;
        }
        return sentinel.next;
    }
}
