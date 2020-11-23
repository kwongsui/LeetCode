package pro.kwongsui.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0606Test {

  @ParameterizedTest
  @CsvSource({
      "'1,2,3,4', '1(2(4))(3)'",
      "'1,2,3,null,4', '1(2()(4))(3)'"})
  void tree2str(@ConvertWith(IntArrayConverter.class) Integer[] input, String expected) {
    Assertions.assertEquals(expected, new Solution0606().tree2str(BinaryTree.create(input)));
  }
}