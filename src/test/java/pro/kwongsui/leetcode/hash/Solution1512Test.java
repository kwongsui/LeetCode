package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1512Test {

  Solution1512 solution = new Solution1512();

  @Test
  void numIdenticalPairs() {
    Assertions.assertEquals(4, solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
  }
}