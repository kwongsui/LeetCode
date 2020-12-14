package pro.kwongsui.leetcode.tree;

public class Solution0108 {

  public static TreeNode sortedArrayToBST(int[] nums) {
    return convert(nums, 0, nums.length - 1);
  }

  public static TreeNode convert(int[] nums, int low, int high) {
    if (low > high) {
      return null;
    }
    int mid = low + (high - low) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = convert(nums, low, mid - 1);
    node.right = convert(nums, mid + 1, high);
    return node;
  }
}
