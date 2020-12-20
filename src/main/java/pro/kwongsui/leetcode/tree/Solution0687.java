package pro.kwongsui.leetcode.tree;

import pro.kwongsui.leetcode.tree.TreeNode;

public class Solution0687 {

    private int max;

    public int longestUniValuePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (root.left == null || root.left.val != root.val) {
            left = 0;
        }
        if (root.right == null || root.right.val != root.val) {
            right = 0;
        }
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }

    public int longestUniValuePath2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs2(root);
        return max;
    }

    private int dfs2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs2(root.left);
        int right = dfs2(root.right);
        int l = 0, r = 0;
        if (root.left != null && root.left.val == root.val) {
            l += left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            r += right + 1;
        }
        max = Math.max(max, l + r);
        return Math.max(l, r);
    }

    public int longestUniValuePath1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = longestUniValuePath1(root.left);
        int r = longestUniValuePath1(root.right);
        return Math.max(Math.max(l, r), dfs1(root.left, root.val) + dfs1(root.right, root.val));
    }

    private int dfs1(TreeNode root, int val) {
        if (root == null || root.val != val) {
            return 0;
        }
        return Math.max(dfs1(root.left, val), dfs1(root.right, val)) + 1;
    }
}
