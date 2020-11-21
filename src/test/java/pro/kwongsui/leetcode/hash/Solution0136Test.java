package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0136Test {

  Solution0136 solution = new Solution0136();

  @Test
  void singleNumber() {
    int[] nums = new int[]{4, 1, 2, 1, 2};
    Assertions.assertEquals(4, solution.singleNumber(nums));
  }
}