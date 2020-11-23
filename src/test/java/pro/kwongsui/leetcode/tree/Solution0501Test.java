package pro.kwongsui.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0501Test {

  Solution0501 solution = new Solution0501();

  @ParameterizedTest
  @CsvSource({
      "'1,null,2,2', '2'",
      "'1,null,2,2,3,2,3,3,4','2,3'"})
  void findMode(@ConvertWith(IntArrayConverter.class) Integer[] input,
      @ConvertWith(IntArrayConverter.class) Integer[] expected) {
    Assertions.assertArrayEquals(expected, solution.findMode(BinaryTree.create(input)));
  }
}