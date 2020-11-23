package pro.kwongsui.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0530Test {

  Solution0530 solution = new Solution0530();

  @ParameterizedTest
  @CsvSource({
      "'', 2147483647",
      "'1', 2147483647",
      "'2,1', 1",
      "'1,null,5,3', 2",
      "'2,1,3,1', 0"})
  void getMinimumDifference(@ConvertWith(IntArrayConverter.class) Integer[] input, int expected) {
    Assertions.assertEquals(expected, solution.getMinimumDifference(BinaryTree.create(input)));
  }
}