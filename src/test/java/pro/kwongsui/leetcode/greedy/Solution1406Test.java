package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution1406Test {

  @Test
  void lastStoneWeight() {
    assertEquals(2, new Solution1406().lastStoneWeight(new int[]{2}));
    assertEquals(5, new Solution1406().lastStoneWeight(new int[]{2, 7}));
    assertEquals(1, new Solution1406().lastStoneWeight(new int[]{2, 7, 4}));
    assertEquals(1, new Solution1406().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    assertEquals(0,
        new Solution1406().lastStoneWeight(new int[]{3, 5, 6, 9, 11, 20, 15, 4, 8, 13}));
    assertEquals(0,
        new Solution1406().lastStoneWeight(new int[]{10, 5, 4, 10, 3, 1, 7, 8}));
    assertEquals(0,
        new Solution1406().lastStoneWeight(new int[]{3, 4, 8, 9, 4, 2, 5, 7, 10}));
  }
}