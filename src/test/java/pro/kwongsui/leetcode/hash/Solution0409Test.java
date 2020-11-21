package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0409Test {
  Solution0409 solution = new Solution0409();

  @Test
  void longestPalindrome() {
    Assertions.assertEquals(0, solution.longestPalindrome(""));
    Assertions.assertEquals(7, solution.longestPalindrome("abccccdd"));
    Assertions.assertEquals(7, solution.longestPalindrome("ccccddd"));
    Assertions.assertEquals(11, solution.longestPalindrome("AAbbCCCDDDDe"));
  }
}