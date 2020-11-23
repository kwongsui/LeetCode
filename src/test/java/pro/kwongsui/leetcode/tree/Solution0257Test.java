package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0257Test {

  @Test
  void binaryTreePaths() {
    Integer[] nums = new Integer[]{1, 2, 3, null, 5};
    TreeNode tree = BinaryTree.create(nums);
    Assertions.assertIterableEquals(
        Arrays.asList(
            "1->2->5",
            "1->3"),
        Solution0257.binaryTreePaths(tree));
    nums = new Integer[]{
        45,
        23, 54,
        null, null, 50, 67,
        null, null, 56, null,
        null, 59};
    tree = BinaryTree.create(nums);
    Assertions.assertIterableEquals(
        Arrays.asList(
            "45->23",
            "45->54->50",
            "45->54->67->56->59"),
        Solution0257.binaryTreePaths(tree));
  }
}