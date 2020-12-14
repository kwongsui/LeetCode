package pro.kwongsui.leetcode.linkedlist;

import java.util.Objects;

public class Solution0024 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode(-1);
        ListNode p = head, q = head.next, r = null;
        while (q != null) {
            p.next = q.next;
            q.next = p;

            Objects.requireNonNullElse(r, sentinel).next = q;
//            if (r == null) {
//                sentinel.next = q;
//            } else {
//                r.next = q;
//            }
            r = p;
            p = p.next;
            q = p != null ? p.next : null;
        }
        return sentinel.next;
    }
}
