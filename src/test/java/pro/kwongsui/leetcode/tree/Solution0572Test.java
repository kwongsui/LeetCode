package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0572Test {

  @ParameterizedTest
  @CsvSource({
      "'12', '2', 'false'",
      "'3,4,5,1,2', '4,1,2', 'true'",
      "'3,4,5,1,2,null,null,null,null,0', '4,1,2', 'false'"})
  void isSubtree(
      @ConvertWith(IntegerArrayConverter.class) Integer[] input1,
      @ConvertWith(IntegerArrayConverter.class) Integer[] input2,
      boolean expected) {
    assertEquals(expected,
        new Solution0572().isSubtree(BinaryTree.create(input1), BinaryTree.create(input2)));
  }
}