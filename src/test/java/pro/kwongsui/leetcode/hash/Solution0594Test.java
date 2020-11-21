package pro.kwongsui.leetcode.hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0594Test {

  Solution0594 solution = new Solution0594();

  @Test
  void findLHS() {
    Assertions.assertEquals(5, solution.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
    Assertions.assertEquals(0, solution.findLHS(new int[]{1, 1, 1, 1}));
  }
}