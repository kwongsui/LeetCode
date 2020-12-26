package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution0655 {

    public List<List<Integer>> printTree(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        int m = level(root);
        int n = (int) Math.pow(2, m) - 1;
        List<Integer> l = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            l.add(0);
        }
        for (int i = 0; i < m; i++) {
            list.add(new ArrayList<>(l));
        }
        printTree(root, 0, 0, n - 1, list);
        return list;
    }

    private int level(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(level(node.left), level(node.right)) + 1;
    }

    private void printTree(TreeNode node, int depth, int lower, int upper,
        List<List<Integer>> list) {
        if (node == null) {
            return;
        }
        int mid = lower + (upper - lower) / 2;
        list.get(depth).set(mid, node.val);
        printTree(node.left, depth + 1, lower, mid - 1, list);
        printTree(node.right, depth + 1, mid + 1, upper, list);
    }
}
