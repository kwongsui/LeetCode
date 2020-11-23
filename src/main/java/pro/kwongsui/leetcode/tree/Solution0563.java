package pro.kwongsui.leetcode.tree;

public class Solution0563 {

  private int ans;

  public int findTilt(TreeNode root) {
    dfs(root);
    return ans;
  }

  private int dfs(TreeNode node) {
    if (node == null) {
      return 0;
    }
    int l = dfs(node.left);
    int r = dfs(node.right);
    ans += Math.abs(l - r);
    return node.val + l + r;
  }
}
