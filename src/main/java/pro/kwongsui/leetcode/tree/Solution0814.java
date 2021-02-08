package pro.kwongsui.leetcode.tree;

public class Solution0814 {

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null) {
            root = null;
        }
        return root;
    }

    public TreeNode pruneTree1(TreeNode root) {
        if (root == null || notContainsOne(root)) {
            return null;
        }
        if (notContainsOne(root.left)) {
            root.left = null;
        }
        if (notContainsOne(root.right)) {
            root.right = null;
        }
        pruneTree1(root.left);
        pruneTree1(root.right);
        return root;
    }

    private boolean notContainsOne(TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.val == 1) {
            return false;
        }
        return notContainsOne(node.left) && notContainsOne(node.right);
    }
}
