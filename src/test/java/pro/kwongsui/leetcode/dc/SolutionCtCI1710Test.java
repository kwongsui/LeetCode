package pro.kwongsui.leetcode.dc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class SolutionCtCI1710Test {

  @ParameterizedTest
  @CsvSource({
      "'3,2,3', 3",
      "'2,1,1,1,1,2,2', 1",
      "'1,2,1,2,1,2,1', 1",
      "'2,3', -1",
      "'1,2,3', -1"
  })
  void majorityElement(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
    assertEquals(expected, new SolutionCtCI1710().majorityElement(input));
  }
}