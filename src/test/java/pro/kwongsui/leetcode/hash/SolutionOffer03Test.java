package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOffer03Test {

  SolutionOffer03 solution = new SolutionOffer03();

  @Test
  void findRepeatNumber() {
    Assertions.assertEquals(2, solution.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
  }
}