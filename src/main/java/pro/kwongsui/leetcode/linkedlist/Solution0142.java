package pro.kwongsui.leetcode.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution0142 {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode p = head;
        while (p != null) {
            if(set.contains(p)) {
                return p;
            } else {
                set.add(p);
            }
            p = p.next;
        }
        return null;
    }

    public ListNode detectCycle2(ListNode head) {
        boolean hasCycle = false;
        ListNode p = head, q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                hasCycle = true;
                break;
            }
        }
        if (hasCycle) {
            p = head;
            while (p != q) {
                p = p.next;
                q = q.next;
            }
            return p;
        } else {
            return null;
        }
    }
}
