package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution0198Test {

  @Test
  void rob() {
    assertEquals(35, new Solution0198().rob(new int[]{10, 5, 1, 10, 2, 15}));
    assertEquals(0, new Solution0198().rob(null));
    assertEquals(0, new Solution0198().rob(new int[]{}));
    assertEquals(10, new Solution0198().rob(new int[]{10}));
    assertEquals(10, new Solution0198().rob(new int[]{10, 5}));
  }
}