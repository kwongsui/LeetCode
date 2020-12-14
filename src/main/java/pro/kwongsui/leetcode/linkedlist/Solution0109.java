package pro.kwongsui.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;
import pro.kwongsui.leetcode.tree.TreeNode;

public class Solution0109 {

    private ListNode head;

    public TreeNode sortedListToBST(ListNode head) {
        this.head = head;
        return convert(0, size(head) - 1);
    }

    private TreeNode convert(int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode left = convert(low, mid - 1);
        TreeNode node = new TreeNode(head.val, left, null);
        head = head.next;
        node.right = convert(mid + 1, high);
        return node;
    }

    private int size(ListNode node) {
        int size = 0;
        ListNode p = node;
        while (p != null) {
            p = p.next;
            size++;
        }
        return size;
    }

    public TreeNode sortedListToBST2(ListNode head) {
        return convert(head, null);
    }

    private TreeNode convert(ListNode head, ListNode tail) {
        if (head == tail) {
            return null;
        }
        ListNode mid = middle(head, tail);
        TreeNode node = new TreeNode(mid.val);
        node.left = convert(head, mid);
        node.right = convert(mid.next, tail);
        return node;
    }

    private ListNode middle(ListNode head, ListNode tail) {
        ListNode p = head, q = head;
        while (q != tail && q.next != tail) {
            p = p.next;
            q = q.next.next;
        }
        return p;
    }

    public TreeNode sortedListToBST1(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            values.add(p.val);
            p = p.next;
        }
        return convert(values, 0, values.size() - 1);
    }

    private TreeNode convert(List<Integer> values, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(values.get(mid));
        node.left = convert(values, low, mid - 1);
        node.right = convert(values, mid + 1, high);
        return node;
    }
}
