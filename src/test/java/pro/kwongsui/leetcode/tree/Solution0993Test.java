package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0993Test {

  @ParameterizedTest
  @CsvSource({
      "'', '3', '4', 'false'",
      "'1,2,3,4', '4', '3', 'false'",
      "'1,2,3,null,4,null,5', '5', '4', 'true'",
      "'1,2,3,null,4', '3', '2', 'false'"
  })
  void isCousins(
      @ConvertWith(IntegerArrayConverter.class) Integer[] input1,
      int input2,
      int input3,
      boolean expected) {
    assertEquals(expected,
        new Solution0993().isCousins(BinaryTree.create(input1), input2, input3));
  }
}