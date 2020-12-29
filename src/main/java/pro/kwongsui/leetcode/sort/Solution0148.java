package pro.kwongsui.leetcode.sort;

import pro.kwongsui.leetcode.linkedlist.ListNode;

public class Solution0148 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode sentinel = new ListNode();
        sentinel.next = head;

        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }

        for (int step = 1; step < size; step *= 2) {
            ListNode p = sentinel, q = sentinel.next;
            while (q != null) {
                ListNode left = q;
                ListNode right = split(left, step);
                q = split(right, step);
                p.next = merge(left, right);
                // 可将哨兵节点传入 merge 方法，在合并过程中向后传递，不用合并后从头开始向后传递
                while (p.next != null) {
                    p = p.next;
                }
            }
        }

        return sentinel.next;
    }

    private ListNode split(ListNode node, int step) {
        if (node == null) {
            return null;
        }
        int idx = 1;
        while(idx < step && node.next != null) {
            node = node.next;
            idx++;
        }
        ListNode right = node.next;
        node.next = null;
        return right;
    }

    public ListNode sortList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return sortList(head, null);
    }

    private ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) {
            return null;
        }
        // 分解到只有一个节点即返回
        if (head.next == tail) {
            // 下一个节点置空，断开链表，后续再合并
            head.next = null;
            return head;
        }
        /*
         * 左开右闭找中点并分解
         */
        ListNode mid = middle(head, tail);
        ListNode left = sortList(head, mid);
        ListNode right = sortList(mid, tail);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode sentinel = new ListNode();
        ListNode p = sentinel;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                p.next = left;
                left = left.next;
            } else {
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }
        if (left != null) {
            p.next = left;
        }
        if (right != null) {
            p.next = right;
        }
        return sentinel.next;
    }

    private ListNode middle(ListNode head, ListNode tail) {
        ListNode p = head, q = head;
        while (q != tail && q.next != tail) {
            p = p.next;
            q = q.next.next;
        }
        return p;
    }
}
