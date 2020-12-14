package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution0138Test {

    @Test
    void copyRandomList() {
        Node input = convert(
            new Integer[][]{{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}});
//            new Integer[][]{{1, 1}, {2, 1}});
//            new Integer[][]{{3, null}, {3, 0}, {3, null}});
//            new Integer[0][0]);
        Integer[][] expected = convert(input);
        Node output = new Solution0138().copyRandomList(input);
        Integer[][] actual = convert(output);
        assertArrayEquals(expected, actual);
    }

    private Integer[][] convert(Node node) {
        Integer[][] tuples = new Integer[size(node)][2];
        Node p = node;
        int idx = 0;
        while (p != null) {
            tuples[idx][0] = p.val;
            tuples[idx][1] = p.random == null ? null : getPos(node, p.random);
            p = p.next;
            idx++;
        }
        return tuples;
    }

    private int size(Node node) {
        int size = 0;
        Node p = node;
        while (p != null) {
            p = p.next;
            size++;
        }
        return size;
    }

    private Integer getPos(Node head, Node node) {
        Node p = head;
        int idx = 0;
        while (p != null && p != node) {
            p = p.next;
            idx++;
        }
        return idx;
    }

    private Node convert(Integer[][] tuples) {
        Node sentinel = new Node(-1);
        Node p = sentinel;
        int idx = 0;
        while (idx != tuples.length) {
            p.next = new Node(tuples[idx][0]);
            p = p.next;
            idx++;
        }
        p = sentinel.next;
        idx = 0;
        while (p != null) {
            p.random = tuples[idx][1] == null ? null : getNode(sentinel.next, tuples[idx][1]);
            p = p.next;
            idx++;
        }
        return sentinel.next;
    }

    private Node getNode(Node head, Integer pos) {
        Node p = head;
        int idx = 0;
        while (p != null && idx != pos) {
            p = p.next;
            idx++;
        }
        return p;
    }
}