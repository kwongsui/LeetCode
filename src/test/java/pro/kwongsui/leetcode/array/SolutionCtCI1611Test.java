package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class SolutionCtCI1611Test {

  @ParameterizedTest
  @CsvSource({
      "1, 2, 0, ''",
      "1, 2, 1, '1,2'",
      "1, 2, 2, '2,3,4'",
      "1, 2, 3, '3,4,5,6'",
      "1, 1, 3, '3'",
  })
  void divingBoard(int shorter, int longer, int k,
      @ConvertWith(IntArrayConverter.class) int[] output) {
    assertArrayEquals(output, new SolutionCtCI1611().divingBoard(shorter, longer, k));
  }
}