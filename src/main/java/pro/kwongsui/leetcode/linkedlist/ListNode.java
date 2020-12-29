package pro.kwongsui.leetcode.linkedlist;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int _val) {
        val = _val;
    }
}