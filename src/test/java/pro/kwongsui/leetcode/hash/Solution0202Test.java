package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0202Test {
  Solution0202 solution = new Solution0202();

  @Test
  void isHappy() {
    Assertions.assertTrue(solution.isHappy(19));
    Assertions.assertTrue(solution.isHappy(7));
    Assertions.assertFalse(solution.isHappy(116));
  }
}