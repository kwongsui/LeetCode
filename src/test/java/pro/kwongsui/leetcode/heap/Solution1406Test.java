package pro.kwongsui.leetcode.heap;

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
  }
}