package pro.kwongsui.leetcode.tree;

public class SolutionOffer54 {

  private int kth = 1;
  private int ans;

  public int kthLargest(TreeNode root, int k) {
    descend(root, k);
    return ans;
  }

  private void descend(TreeNode root, int k) {
    if (root != null) {
      descend(root.right, k);
      if (kth++ == k) {
        ans = root.val;
        return;
      }
      descend(root.left, k);
    }
  }
}
