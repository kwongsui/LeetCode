package pro.kwongsui.leetcode.stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0496Test {

  @ParameterizedTest
  @CsvSource({
      "'4,1,2', '1,3,4,2', '-1,3,-1'",
      "'2,4','1,2,3,4','3,-1'",
      "'1,3,5,2,4','5,4,3,2,1','-1,-1,-1,-1,-1'"
  })
  void nextGreaterElement(
      @ConvertWith(IntArrayConverter.class) int[] input1,
      @ConvertWith(IntArrayConverter.class) int[] input2,
      @ConvertWith(IntArrayConverter.class) int[] expected) {
    assertArrayEquals(expected, new Solution0496().nextGreaterElement(input1, input2));
  }
}