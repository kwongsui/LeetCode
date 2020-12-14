package pro.kwongsui.leetcode.linkedlist;

public class Solution0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(-1), p = sentinel;
        int digit = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + digit;
            digit = digit(sum);
            p.next = new ListNode(addition(sum));
            l1 = l1.next;
            l2 = l2.next;
            p = p.next;
        }
        while (l1 != null) {
            int sum = l1.val + digit;
            digit = digit(sum);
            p.next = new ListNode(addition(sum));
            l1 = l1.next;
            p = p.next;
        }
        while (l2 != null) {
            int sum = l2.val + digit;
            digit = digit(sum);
            p.next = new ListNode(addition(sum));
            l2 = l2.next;
            p = p.next;
        }
        if (digit != 0) {
            p.next = new ListNode(digit);
        }
        return sentinel.next;
    }

    private int addition(int sum) {
        return sum >= 10 ? sum % 10 : sum;
    }

    private int digit(int sum) {
        return sum >= 10 ? 1 : 0;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        StringBuilder builder = new StringBuilder();
        while (l1 != null) {
            builder.insert(0, l1.val);
            l1 = l1.next;
        }
        long v1 = Long.parseLong(builder.toString());
        builder.delete(0, builder.length());
        while (l2 != null) {
            builder.insert(0, l2.val);
            l2 = l2.next;
        }
        long v2 = Long.parseLong(builder.toString());
        String v = String.valueOf(v1 + v2);
        ListNode sentinel = new ListNode(-1), p = sentinel;
        for (int i = v.length() - 1; i >= 0; i--) {
            p.next = new ListNode(v.charAt(i) - '0');
            p = p.next;
        }
        return sentinel.next;
    }
}
