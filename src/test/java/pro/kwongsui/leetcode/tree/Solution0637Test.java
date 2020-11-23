package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0637Test {

  @Test
  void averageOfLevels() {
    Assertions.assertIterableEquals(Arrays.asList(3.0, 14.5, 11.0),
        new Solution0637().averageOfLevels(BinaryTree.create(new Integer[]{3, 9, 20, 15, 7})));
  }
}