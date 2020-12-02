package pro.kwongsui.leetcode.dp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0392Test {

  @ParameterizedTest
  @CsvSource({
      "'emi', 'netmuif'",
      "'mi', 'mttt'",
      "'mcu', 'mtacnu'"
  })
  void isSubsequence(String input1, String input2) {
    Solution0392 lcs = new Solution0392();
    boolean[][] states = lcs.isSubsequence(input1, input2);
//    assertEquals(expected, states[input1.length() - 1][input2.length() - 1]);
    lcs.print(states);
  }
}