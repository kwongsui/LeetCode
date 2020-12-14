package pro.kwongsui.leetcode.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0020Test {

  @ParameterizedTest
  @CsvSource({
      "'', 'true'",
      "'(', 'false'",
      "')', 'false'",
      "'()', 'true'",
      "'((', 'false'",
      "'([', 'false'",
      "']}', 'false'",
      "']]', 'false'",
      "'([)]', 'false'",
      "'()[]{}', 'true'"
  })
  void isValid(String input, boolean expected) {
    assertEquals(expected, new Solution0020().isValid(input));
  }
}