package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0204Test {

  Solution0204 solution = new Solution0204();

  @ParameterizedTest
  @CsvSource({
      "0, 0",
      "1, 0",
      "2, 0",
      "3, 1",
      "10, 4",
      "100, 25",
      "1000, 168",
  })
  void countPrimes(int input, int expected) {
    assertEquals(expected, new Solution0204().countPrimes(input));
  }
}