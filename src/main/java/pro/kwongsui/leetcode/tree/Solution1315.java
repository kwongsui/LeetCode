package pro.kwongsui.leetcode.tree;

public class Solution1315 {

  public static boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isSymmetric(root.left, root.right);
  }

  private static boolean isSymmetric(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    } else if (p == null || q == null) {
      return false;
    } else {
      return p.val == q.val
          && isSymmetric(p.left, q.right)
          && isSymmetric(p.right, q.left);
    }
  }
}
