package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1365Test {

  Solution1365 solution = new Solution1365();

  @Test
  void smallerNumbersThanCurrent() {
    int[] expected = {4, 0, 1, 1, 3};
    int[] method = solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
    Assertions.assertArrayEquals(expected, method);
  }
}