package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.ListNodeConverter;

class Solution0142Test {

    @ParameterizedTest
    @CsvSource({
        "'', -1",
        "'1', -1",
        "'1,2', 0",
        "'3,2,0,4', 1",
        "'1,2,3,4,5', -1",
        "'1,2,3,4,5,6', 2",
        "'1,2,3,4,5,6', 5",
        "'1,2,3,4,5,6,7,8,9,10,11', 8",
        "'-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5', 24"
    })
    void detectCycle(@ConvertWith(ListNodeConverter.class) ListNode node, int pos) {
        if (pos != -1) {
            assertEquals(getNode(node, pos),
                new Solution0142().detectCycle(cyclization(node, pos)));
        } else {
            assertNull(new Solution0142().detectCycle(node));
        }
    }

    private ListNode cyclization(ListNode node, int pos) {
        ListNode p = node;
        while (p.next != null) {
            p = p.next;
        }
        p.next = getNode(node, pos);
        return node;
    }

    private ListNode getNode(ListNode node, int pos) {
        int idx = 0;
        ListNode p = node;
        while (p != null && idx != pos) {
            p = p.next;
            idx++;
        }
        return p;
    }
}