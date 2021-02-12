package pro.kwongsui.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1609 {

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            int size = queue.size();
            while (size-- != 0) {
                TreeNode node = queue.poll();
                if (node != null) {
                    int val = node.val;
                    if (level % 2 == 0) {
                        if (val % 2 == 0) {
                            return false;
                        }
                        if (val <= max) {
                            return false;
                        }
                        max = val;
                    } else {
                        if (val % 2 != 0) {
                            return false;
                        }
                        if (val >= min) {
                            return false;
                        }
                        min = val;
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            level++;
        }
        return true;
    }
}
