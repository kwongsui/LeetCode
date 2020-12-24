package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution0449 {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        encode(root, builder);
        return builder.toString();
    }

    private void encode(TreeNode node, StringBuilder builder) {
        if (node == null) {
            return;
        }
        builder.append(node.val).append("#");
        encode(node.left, builder);
        encode(node.right, builder);
    }

    public TreeNode deserialize(String data) {
        if (data.length() == 0) {
            return null;
        }
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split("#")));
        return decode(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode decode(Queue<String> queue, int lower, int upper) {
        if (queue.isEmpty()) {
            return null;
        }
        int val = Integer.parseInt(queue.peek()); // 先探测待出队元素是否可以用于建立下一个节点
        if (lower > val || val > upper) {
            return null;
        }
        queue.poll();
        TreeNode node = new TreeNode(val);
        node.left = decode(queue, lower, val);
        node.right = decode(queue, val, upper);
        return node;
    }
}
