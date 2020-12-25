package pro.kwongsui.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution0623 {

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root == null) {
            return null;
        }
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- != 0) {
                TreeNode node = queue.poll();
                if (node != null) {
                    if (depth == d - 1) {
                        TreeNode l = new TreeNode(v);
                        l.left = node.left;
                        node.left = l;
                        TreeNode r = new TreeNode(v);
                        r.right = node.right;
                        node.right = r;
                    } else {
                        if (node.left != null) {
                            queue.offer(node.left);
                        }
                        if (node.right != null) {
                            queue.offer(node.right);
                        }
                    }
                }
            }
            depth++;
        }
        return root;
    }

    public TreeNode addOneRow2(TreeNode root, int v, int d) {
        if (root == null) {
            return null;
        }
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        addOneRow2(root, v, d, 1);
        return root;
    }

    private void addOneRow2(TreeNode root, int v, int d, int depth) {
        if (root == null) {
            return;
        }
        if (depth == d - 1) {
            TreeNode l = new TreeNode(v);
            l.left = root.left;
            root.left = l;
            TreeNode r = new TreeNode(v);
            r.right = root.right;
            root.right = r;
            return;
        }
        addOneRow2(root.left, v, d, depth + 1);
        addOneRow2(root.right, v, d, depth + 1);
    }
}
