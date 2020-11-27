package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution0944Test {

  @Test
  void minDeletionSize() {
    assertEquals(1, new Solution0944().minDeletionSize(new String[]{"cba", "daf", "ghi"}));
    assertEquals(3, new Solution0944().minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
  }
}