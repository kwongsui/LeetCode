package pro.kwongsui.leetcode.tree;

public class Solution1022 {

  private int ans;

  public int sumRootToLeaf(TreeNode root) {
    computeSum(root, new StringBuilder());
    return ans;
  }

  private void computeSum(TreeNode node, StringBuilder builder) {
    if (node != null) {
      int cursor = builder.length();
      builder.append(node.val);
      if (node.left == null && node.right == null) {
        ans += Integer.parseInt(builder.toString(), 2);
      } else {
        computeSum(node.left, builder);
        computeSum(node.right, builder);
      }
      builder.delete(cursor, builder.length());
    }
  }
}
