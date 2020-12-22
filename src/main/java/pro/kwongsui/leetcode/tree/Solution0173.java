package pro.kwongsui.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution0173 {

    static class BSTIterator {

        Deque<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            stack = new ArrayDeque<>();
            inorder(root);
        }

        private void inorder(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        public int next() {
            TreeNode node = stack.pop();
            if (node.right != null) {
                inorder(node.right);
            }
            return node.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }

    static class BSTIterator1 {

        Queue<Integer> queue = new LinkedList<>();

        public BSTIterator1(TreeNode root) {
            inorder(root);
        }

        private void inorder(TreeNode root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            queue.offer(root.val);
            inorder(root.right);
        }

        public int next() {
            Integer ele = queue.poll();
            return ele == null ? 0 : ele;
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }
    }
}
