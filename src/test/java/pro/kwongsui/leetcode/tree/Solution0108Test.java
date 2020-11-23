package pro.kwongsui.leetcode.tree;

import org.junit.jupiter.api.Test;

class Solution0108Test {

  @Test
  void sortedArrayToBST() {
    int[] nums = new int[]{-10, -3, 0, 5, 9, 11};
    TreeNode node = Solution0108.sortedArrayToBST(nums);
    System.out.println(BinaryTree.bfs(node));
  }
}