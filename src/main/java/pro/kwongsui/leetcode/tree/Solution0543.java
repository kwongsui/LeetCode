package pro.kwongsui.leetcode.tree;

public class Solution0543 {

  public int ans;

  public int diameterOfBinaryTree(TreeNode root) {
    helper(root);
    return ans;
  }

  private int helper(TreeNode node) {
    if (node == null) {
      return 0;
    }
    int l = helper(node.left);
    int r = helper(node.right);
    ans = Math.max(l + r, ans);
    return Math.max(l, r) + 1;
  }
}
