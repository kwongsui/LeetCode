package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0204Test {

  Solution0204 solution = new Solution0204();

  @Test
  void countPrimes() {
    Assertions.assertEquals(0,solution.countPrimes(0));
    Assertions.assertEquals(0, solution.countPrimes(1));
    Assertions.assertEquals(0, solution.countPrimes(2));
    Assertions.assertEquals(1, solution.countPrimes(3));
    Assertions.assertEquals(4,solution.countPrimes(10));
    Assertions.assertEquals(25, solution.countPrimes(100));
  }
}