package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution0746Test {

  @Test
  void minCostClimbingStairs() {
    assertEquals(10, new Solution0746().minCostClimbingStairs(new int[]{10, 15}));
    assertEquals(15, new Solution0746().minCostClimbingStairs(new int[]{10, 15, 20}));
    assertEquals(10, new Solution0746().minCostClimbingStairs(new int[]{15, 10}));
    assertEquals(15, new Solution0746().minCostClimbingStairs(new int[]{15, 15}));
    assertEquals(6,
        new Solution0746().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }
}