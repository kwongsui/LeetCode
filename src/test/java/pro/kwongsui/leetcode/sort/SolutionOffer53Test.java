package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class SolutionOffer53Test {

  @ParameterizedTest
  @CsvSource({
      "'0', 1",
      "'0,1', 2",
      "'1', 0",
      "'1,2,3', 0",
      "'0,1,2,3,4,5,6,7', 8",
      "'0,1,2,3,4,5,6,7,9', 8"
  })
  void missingNumber(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
    assertEquals(expected, new SolutionOffer53().missingNumber(input));
  }
}