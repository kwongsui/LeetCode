package pro.kwongsui.leetcode.tree;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution0662 {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] max = new int[]{0};
        dfs(root, 0, 1, map, max);
        return max[0];
    }

    private void dfs(TreeNode root, int depth, int idx, Map<Integer, Integer> map, int[] max) {
        if (root == null) {
            return;
        }
        map.putIfAbsent(depth, idx);
        max[0] = Math.max(max[0], idx - map.get(depth) + 1);
        dfs(root.left, depth + 1, idx * 2, map, max);
        dfs(root.right, depth + 1, idx * 2 + 1, map, max);
    }

    public int widthOfBinaryTree1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        Deque<TreeNode> deque = new LinkedList<>();
        root.val = 1;
        deque.offerLast(root);
        while (!deque.isEmpty()) {
            max = Math.max(max, deque.peekLast().val - deque.peekFirst().val + 1);
            int size = deque.size();
            while (size-- != 0) {
                TreeNode node = deque.pollFirst();
                if (node != null && node.left != null) {
                    node.left.val = node.val * 2;
                    deque.offerLast(node.left);
                }
                if (node != null && node.right != null) {
                    node.right.val = node.val * 2 + 1;
                    deque.offerLast(node.right);
                }
            }
        }
        return max;
    }
}
