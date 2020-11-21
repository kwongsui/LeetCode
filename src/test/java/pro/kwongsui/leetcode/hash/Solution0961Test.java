package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0961Test {

  Solution0961 solution = new Solution0961();

  @Test
  void repeatedNTimes() {
    Assertions.assertEquals(3, solution.repeatedNTimes(new int[]{1, 2, 3, 3}));
    Assertions.assertEquals(2, solution.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));

    Character ch = 'a';
    System.out.println(ch.toString());
  }
}