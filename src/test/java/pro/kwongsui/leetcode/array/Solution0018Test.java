package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0018Test {

  @ParameterizedTest
  @CsvSource({
      "'1,0,-1,0,-2,2', 0, '-2,-1,1,2|-2,0,0,2|-1,0,0,1'"
  })
  void fourSum(@ConvertWith(IntArrayConverter.class) int[] input, int target,
      @ConvertWith(NestedListConverter.class)
          List<List<Integer>> expected) {
    assertIterableEquals(expected, new Solution0018().fourSum(input, target));
  }
}