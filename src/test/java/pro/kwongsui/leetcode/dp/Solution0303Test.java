package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution0303Test {

  @Test
  void sumRange() {
    assertEquals(1,
        new Solution0303.NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(0, 2));
    assertEquals(-1,
        new Solution0303.NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(2, 5));
    assertEquals(-3,
        new Solution0303.NumArray(new int[]{-2, 0, 3, -5, 2, -1}).sumRange(0, 5));
  }
}