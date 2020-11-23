package pro.kwongsui.leetcode.tree;

public class Solution0606 {

  private StringBuilder builder = new StringBuilder();

  public String tree2str(TreeNode t) {
    preOrder(t);
    return builder.toString();
  }

  private void preOrder(TreeNode t) {
    if (t == null) {
      return;
    }
    builder.append(t.val);
    if (t.left == null && t.right == null) {
      return;
    }
    builder.append("(");
    preOrder(t.left);
    builder.append(")");
    if (t.right != null) {
      builder.append("(");
      preOrder(t.right);
      builder.append(")");
    }
  }
}
