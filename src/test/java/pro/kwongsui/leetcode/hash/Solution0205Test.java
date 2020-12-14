package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0205Test {


  @ParameterizedTest
  @CsvSource({
      "'','', 'true'",
      "'a', 'b', 'true'",
      "'aa', 'ab', 'false'",
      "'ab', 'aa', 'false'",
      "'aaaa', 'aabb', 'false'",
      "'abbbb', 'ababb', 'false'",
      "'aba', 'baa', 'false'",
      "'egg', 'add', 'true'",
      "'foo', 'bar', 'false'",
      "'paper', 'title', 'true'"
  })
  void isIsomorphic(String s, String t, boolean expected) {
    assertEquals(expected, new Solution0205().isIsomorphic(s, t));
  }
}