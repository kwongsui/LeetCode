package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution0122Test {

  @Test
  void maxProfit() {
    assertArrayEquals(new int[]{5, 1, 4},
        new Solution0122().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    assertArrayEquals(new int[]{0, 0, 0},
        new Solution0122().maxProfit(new int[]{7, 6, 4, 3, 1}));
    assertArrayEquals(new int[]{4, 0, 4},
        new Solution0122().maxProfit(new int[]{1, 2, 3, 4, 5}));
  }
}