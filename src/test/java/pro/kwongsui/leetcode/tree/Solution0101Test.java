package pro.kwongsui.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0101Test {


  @ParameterizedTest
  @CsvSource({"'1,2,2,3,4,4,3'"})
  void isSymmetric(@ConvertWith(IntArrayConverter.class) Integer[] input) {
    Assertions.assertTrue(Solution0101.isSymmetric(BinaryTree.create(input)));
  }
}