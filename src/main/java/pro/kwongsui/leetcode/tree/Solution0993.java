package pro.kwongsui.leetcode.tree;

public class Solution0993 {

  public boolean isCousins(TreeNode root, int x, int y) {
    if (root == null) {
      return false;
    }
    int depthX = depth(root, x, 0);
    int depthY = depth(root, y, 0);
    TreeNode parentX = parent(root, x);
    TreeNode parentY = parent(root, y);
    return (depthX == depthY) && (parentX.val != parentY.val);
  }

  private TreeNode parent(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    if ((root.left != null && root.left.val == val)
        || (root.right != null && root.right.val == val)) {
      return root;
    }
    TreeNode ret = parent(root.left, val);
    if (ret != null) {
      return ret;
    }
    ret = parent(root.right, val);
    return ret;
  }

  private int depth(TreeNode root, int val, int depth) {
    if (root == null) {
      return -1;
    }
    if (root.val == val) {
      return depth;
    }
    int ret = depth(root.left, val, depth + 1);
    if (ret != -1) {
      return ret;
    }
    ret = depth(root.right, val, depth + 1);
    return ret;
  }
}
