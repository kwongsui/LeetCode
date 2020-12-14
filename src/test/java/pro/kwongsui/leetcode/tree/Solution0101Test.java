package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0101Test {


  @ParameterizedTest
  @CsvSource({"'1,2,2,3,4,4,3'"})
  void isSymmetric(@ConvertWith(IntegerArrayConverter.class) Integer[] input) {
    assertTrue(Solution0101.isSymmetric(BinaryTree.create(input)));
  }
}