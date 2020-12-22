package pro.kwongsui.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution0114 {

    public void flatten(TreeNode root) {
        TreeNode p = root;
        while (p != null) {
            if (p.left != null) {
                TreeNode q = p.left;
                while (q.right != null) {
                    q = q.right;
                }
                q.right = p.right;
                p.right = p.left;
                p.left = null;
            }
            p = p.right;
        }
    }

    public void flatten3(TreeNode root) {
        flatten3(root, null);
    }

    private TreeNode flatten3(TreeNode root, TreeNode prev) {
        if (root == null) {
            return prev;
        }
        prev = flatten3(root.right, prev);
        prev = flatten3(root.left, prev);
        root.right = prev;
        root.left = null;
        prev = root;
        return prev;
    }

    public void flatten2(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode prev = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (prev != null) {
                prev.left = null;
                prev.right = node;
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            prev = node;
        }
    }

    public void flatten1(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        flatten1(root, stack);
    }

    private void flatten1(TreeNode root, Deque<TreeNode> stack) {
        if (root.left == null && root.right == null) {
            root.right = stack.peek();
            return;
        }
        if (root.right != null) {
            stack.push(root.right);
            if (root.left != null) {
                root.right = root.left;
            }
        } else {
            root.right = root.left;
        }
        if (root.left != null) {
            flatten1(root.left, stack);
            root.left = null;
        }
        if (!stack.isEmpty()) {
            flatten1(stack.pop(), stack);
        }
    }
}
