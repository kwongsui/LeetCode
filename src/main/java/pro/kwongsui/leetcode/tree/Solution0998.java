package pro.kwongsui.leetcode.tree;

public class Solution0998 {

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null || root.val < val) {
            TreeNode newTreeNode = new TreeNode(val);
            newTreeNode.left = root;
            return newTreeNode;
        }
        if (root.right == null || root.right.val < val) {
            TreeNode newTreeNode = new TreeNode(val);
            newTreeNode.left = root.right;
            root.right = newTreeNode;
        } else {
            insertIntoMaxTree(root.right, val);
        }
        return root;
    }
}
