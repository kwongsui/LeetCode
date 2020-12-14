package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0016Test {

  @ParameterizedTest
  @CsvSource({
      "'-1,2,1,-4', 1, 2"
  })
  void threeSumClosest(@ConvertWith(IntArrayConverter.class) int[] input, int target, int output) {
    assertEquals(output, new Solution0016().threeSumClosest(input, target));
  }
}