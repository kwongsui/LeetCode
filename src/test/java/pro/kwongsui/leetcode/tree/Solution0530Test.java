package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0530Test {

  @ParameterizedTest
  @CsvSource({
      "'', 2147483647",
      "'1', 2147483647",
      "'2,1', 1",
      "'1,null,5,3', 2",
      "'2,1,3,1', 0"})
  void getMinimumDifference(
      @ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
    assertEquals(expected, new Solution0530().getMinimumDifference(BinaryTree.create(input)));
  }
}