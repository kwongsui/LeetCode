package pro.kwongsui.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class Solution0138 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node p, q = head;
        while (q != null) {
            p = new Node(q.val);
            p.next = q.next;
            q.next = p;
            q = p.next;
        }
        p = head.next;
        q = head;
        while (q != null) {
            p.random = q.random == null ? null : q.random.next;
            q = q.next.next;
            if (p.next != null) {
                p = p.next.next;
            }
        }
        Node newHead = head.next;
        p = head.next;
        q = head;
        while (q != null) {
            q.next = q.next.next;
            if (p != null && p.next != null) {
                p.next = p.next.next;
            }
            q = q.next;
            if (p != null) {
                p = p.next;
            }
        }
        return newHead;
    }

    public Node copyRandomList2(Node head) {
        Node sentinel = new Node(-1), p = sentinel, q = head;
        while (q != null) {
            p.next = new Node(q.val);
            p = p.next;
            q = q.next;
        }
        p = sentinel.next;
        q = head;
        while (q != null) {
            p.random = q.random == null ? null : getNode(sentinel.next, getPos(head, q.random));
            p = p.next;
            q = q.next;
        }
        return sentinel.next;
    }

    private int getPos(Node head, Node node) {
        Node p = head;
        int idx = 0;
        while (p != null && p != node) {
            p = p.next;
            idx++;
        }
        return idx;
    }

    private Node getNode(Node node, int pos) {
        Node p = node;
        int idx = 0;
        while (p != null && idx != pos) {
            p = p.next;
            idx++;
        }
        return p;
    }

    public Node copyRandomList1(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node p = head;
        while (p != null) {
            map.put(p, new Node(p.val));
            p = p.next;
        }

        p = head;
        while (p != null) {
            map.get(p).next = map.get(p.next);
            map.get(p).random = map.get(p.random);
            p = p.next;
        }

        return map.get(head);
    }
}
