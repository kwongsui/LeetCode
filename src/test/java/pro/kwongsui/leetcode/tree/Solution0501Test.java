package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0501Test {

  @ParameterizedTest
  @CsvSource({
      "'1,null,2,2', '2'",
      "'1,null,2,2,3,2,3,3,4','2,3'"})
  void findMode(
      @ConvertWith(IntegerArrayConverter.class) Integer[] input,
      @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
    assertArrayEquals(expected, new Solution0501().findMode(BinaryTree.create(input)));
  }
}