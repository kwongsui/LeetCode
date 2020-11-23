package pro.kwongsui.leetcode.tree;

public class Solution0530 {

  private int ans = Integer.MAX_VALUE;
  private TreeNode prev;

  public int getMinimumDifference(TreeNode root) {
    inOrder(root);
    return ans;
  }

  private void inOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    if (prev != null) {
      ans = Math.min(ans, node.val - prev.val);
    }
    prev = node;
    inOrder(node.right);
  }
}
