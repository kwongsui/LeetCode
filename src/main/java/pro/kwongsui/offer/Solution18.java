package pro.kwongsui.offer;

import pro.kwongsui.leetcode.linkedlist.ListNode;

public class Solution18 {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode p = sentinel, q = head;
        while (q != null) {
            if(q.val == val) {
                p.next = q.next;
            } else {
                p = q;
            }
            q = q.next;
        }
        return sentinel.next;
    }
}
