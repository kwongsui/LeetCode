package pro.kwongsui.leetcode.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution0997Test {

  @Test
  void findJudge() {
    int[][] trust = new int[][]{{1, 2}};
    assertEquals(2, new Solution0997().findJudge(2, trust));

    trust = new int[][]{{1, 3}, {2, 3}};
    assertEquals(3, new Solution0997().findJudge(3, trust));

    trust = new int[][]{{1, 3}, {2, 3}, {3, 1}};
    assertEquals(-1, new Solution0997().findJudge(3, trust));

    trust = new int[][]{{1, 2}, {2, 3}};
    assertEquals(-1, new Solution0997().findJudge(3, trust));

    trust = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
    assertEquals(3, new Solution0997().findJudge(4, trust));
  }
}