package pro.kwongsui.offer;

import pro.kwongsui.leetcode.linkedlist.ListNode;

public class Solution06 {

    public int[] reversePrint(ListNode head) {
        ListNode p = null, q = head, n;
        int size = 0;
        while (q != null) {
            n = q.next;
            q.next = p;
            p = q;
            q = n;
            size++;
        }
        int[] res = new int[size];
        int idx = 0;
        while(p != null) {
            res[idx++] = p.val;
            p = p.next;
        }
        return res;
    }
}
