package pro.kwongsui.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1161 {

    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = Integer.MIN_VALUE, level = 1, ans = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            while (size-- != 0) {
                TreeNode node = queue.poll();
                if (node != null) {
                    sum += node.val;
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            if (sum > max) {
                max = sum;
                ans = level;
            }
            level++;
        }
        return ans;
    }
}
