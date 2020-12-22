package pro.kwongsui.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution0129 {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> numbers = new LinkedList<>();
        nodes.offer(root);
        numbers.offer(root.val);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            Integer element = numbers.poll();
            int val = element == null ? 0 : element;
            if (node.left == null && node.right == null) {
                sum += val;
            }
            if (node.left != null) {
                nodes.offer(node.left);
                numbers.offer(val * 10 + node.left.val);
            }
            if (node.right != null) {
                nodes.offer(node.right);
                numbers.offer(val * 10 + node.right.val);
            }
        }
        return sum;
    }

    public int sumNumbers2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int val) {
        if (root.left == null && root.right == null) {
            return val * 10 + root.val;
        }
        int l = 0, r = 0;
        if (root.left != null) {
            l = dfs(root.left, val * 10 + root.val);
        }
        if (root.right != null) {
            r = dfs(root.right, val * 10 + root.val);
        }
        return l + r;
    }

    public int sumNumbers1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] sum = new int[]{0};
        sum(root, new StringBuilder(), sum);
        return sum[0];
    }

    private void sum(TreeNode root, StringBuilder builder, int[] sum) {
        builder.append(root.val);
        if (root.left == null && root.right == null) {
            sum[0] += Integer.parseInt(builder.toString());
            return;
        }
        if (root.left != null) {
            sum(root.left, builder, sum);
            builder.deleteCharAt(builder.length() - 1);
        }
        if (root.right != null) {
            sum(root.right, builder, sum);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
