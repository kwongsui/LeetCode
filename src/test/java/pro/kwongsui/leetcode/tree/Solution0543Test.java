package pro.kwongsui.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0543Test {

  Solution0543 solution = new Solution0543();

  @ParameterizedTest
  @CsvSource({
      "'', 0",
      "'1', 0",
      "'1,2,3,4,5', 3",
      "'1,2,3,null,4,5', 4",
      "'4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2', 8",
      "'1,2,3,6,5,null,null,5,null,null,6,null,4,null,9,null,3', 7"})
  void diameterOfBinaryTree(@ConvertWith(IntArrayConverter.class) Integer[] input, int expected) {
    Assertions.assertEquals(expected, solution.diameterOfBinaryTree(BinaryTree.create(input)));
  }
}