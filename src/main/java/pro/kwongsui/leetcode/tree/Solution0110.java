package pro.kwongsui.leetcode.tree;

public class Solution0110 {

  public static boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (Math.abs(height(root.left) - height(root.right)) > 1) {
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
  }

  private static int height(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return Math.max(height(node.left), height(node.right)) + 1;
  }
}
