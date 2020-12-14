package pro.kwongsui.leetcode.linkedlist;

public class Solution0086 {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode small = new ListNode(-1),
            big = new ListNode(-1),
            p = small,
            q = big;
        while (head != null) {
            if (head.val < x) {
                p.next = head;
                p = p.next;
            } else {
                q.next = head;
                q = q.next;
            }
            head = head.next;
        }
        q.next = null;
        p.next = big.next;
        return small.next;
    }
}
