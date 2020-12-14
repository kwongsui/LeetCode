package pro.kwongsui.leetcode.tree;

public class Solution0572 {

  private StringBuilder builder = new StringBuilder();

  public boolean isSubtree(TreeNode s, TreeNode t) {
    concat(s);
    String S = builder.toString();
    builder = new StringBuilder();
    concat(t);
    String T = builder.toString();
    return S.contains(T);
  }

  private void concat(TreeNode node) {
    if (node == null) {
      return;
    }
    builder.append(" ").append(node.val);
    if (node.left == null) {
      builder.append(" ").append("lNull");
    }
    if (node.right == null) {
      builder.append(" ").append("rNull");
    }
    concat(node.left);
    concat(node.right);
  }
}
