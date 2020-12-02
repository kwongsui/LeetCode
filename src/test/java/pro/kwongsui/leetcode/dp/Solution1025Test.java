package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution1025Test {

  @ParameterizedTest
  @CsvSource({
      "1, 'false'",
      "2, 'true'",
      "3, 'false'",
      "4, 'true'",
      "5, 'false'",
      "6, 'true'",
      "7, 'false'",
      "8, 'true'",
      "9, 'false'",
      "50, 'true'",
      "51, 'false'",
      "500, 'true'",
      "501, 'false'",
      "999, 'false'",
      "1000, 'true'"
  })
  void divisorGame(int input, boolean expected) {
    assertEquals(expected, new Solution1025().divisorGame(input));
  }
}