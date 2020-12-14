package pro.kwongsui.leetcode.linkedlist;

public class Solution0082 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode p = sentinel, q = head, r = head.next;
        while (r != null) {
            if (q.val == r.val) {
                while (r != null && q.val == r.val) {
                    r = r.next;
                }
                p.next = r;
            } else {
                p = q;
            }
            q = r;
            if (r != null) {
                r = r.next;
            }
        }
        return sentinel.next;
    }
}
