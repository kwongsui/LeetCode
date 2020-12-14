package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0110Test {

  @ParameterizedTest
  @CsvSource({
      "'3,9,20,null,null,15,7', 1",
      "'1,2,2,3,3,null,null,4,4',0"})
  void isBalanced(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
    assertEquals(expected == 1,
        Solution0110.isBalanced(BinaryTree.create(input)));
  }
}