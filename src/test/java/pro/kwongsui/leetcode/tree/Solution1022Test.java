package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1022Test {

  @ParameterizedTest
  @CsvSource({
      "'', 0",
      "'1,0,1,0,1,0,1', 22",
      "'0', 0",
      "'1', 1",
      "'1,1', 3"
  })
  void sumRootToLeaf(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
    assertEquals(expected, new Solution1022().sumRootToLeaf(BinaryTree.create(input)));
  }
}