package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution0874Test {

  @Test
  void robotSim() {
    assertEquals(0, new Solution0874().robotSim(new int[0], new int[0][]));
    assertEquals(25, new Solution0874().robotSim(new int[]{4, -1, 3}, new int[][]{}));
    assertEquals(65,
        new Solution0874().robotSim(new int[]{4, -1, 4, -2, 4}, new int[][]{{2, 4}}));
    assertEquals(17,
        new Solution0874().robotSim(
            new int[]{4, -1, 4, -1, 4, -2, 4}, new int[][]{{1, 3}, {2, 4}}));
  }
}