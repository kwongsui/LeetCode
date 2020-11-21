package pro.kwongsui.leetcode.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0205Test {

  Solution0205 solution = new Solution0205();

  @Test
  void isIsomorphic() {
    Assertions.assertTrue(solution.isIsomorphic("", ""));
    Assertions.assertTrue(solution.isIsomorphic("a", "b"));
    Assertions.assertFalse(solution.isIsomorphic("aa", "ab"));
    Assertions.assertFalse(solution.isIsomorphic("ab", "aa"));
    Assertions.assertFalse(solution.isIsomorphic("aaaa", "aabb"));
    Assertions.assertFalse(solution.isIsomorphic("abbbb", "ababb"));
    Assertions.assertFalse(solution.isIsomorphic("aba", "baa"));
    Assertions.assertTrue(solution.isIsomorphic("egg", "add"));
    Assertions.assertFalse(solution.isIsomorphic("foo", "bar"));
    Assertions.assertTrue(solution.isIsomorphic("paper", "title"));
  }
}