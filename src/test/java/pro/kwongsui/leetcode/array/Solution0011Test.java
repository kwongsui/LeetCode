package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0011Test {

  @ParameterizedTest
  @CsvSource({
      "'1,8,6,2,5,4,8,3,7', 49",
      "'1,1', 1",
      "'4,3,2,1,4', 16",
      "'1,2,1', 2"
  })
  void maxArea(
      @ConvertWith(IntArrayConverter.class) int[] input,
      int expected) {
    assertEquals(expected, new Solution0011().maxArea(input));
  }
}