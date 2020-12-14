package pro.kwongsui.leetcode.util;

import java.util.ArrayList;
import java.util.List;
import pro.kwongsui.leetcode.linkedlist.ListNode;

public class ListNode2List {

    public static List<Integer> convert(ListNode node) {
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }
}
