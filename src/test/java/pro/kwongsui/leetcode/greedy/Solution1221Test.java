package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution1221Test {

  @Test
  void balancedStringSplit() {
    assertEquals(1, new Solution1221().balancedStringSplit("LR"));
    assertEquals(4, new Solution1221().balancedStringSplit("RLRRLLRLRL"));
    assertEquals(3, new Solution1221().balancedStringSplit("RLLLLRRRLR"));
    assertEquals(1, new Solution1221().balancedStringSplit("LLLLRRRR"));
    assertEquals(1, new Solution1221().balancedStringSplit("LLLRRR"));
  }
}