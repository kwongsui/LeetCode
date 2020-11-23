package pro.kwongsui.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0572Test {

  Solution0572 solution = new Solution0572();

  @ParameterizedTest
  @CsvSource({
      "'12', '2', 0",
      "'3,4,5,1,2', '4,1,2', 1",
      "'3,4,5,1,2,null,null,null,null,0', '4,1,2', 0"})
  void isSubtree(@ConvertWith(IntArrayConverter.class) Integer[] input1,
      @ConvertWith(IntArrayConverter.class) Integer[] input2, int expected) {
    Assertions.assertEquals(expected == 1,
        solution.isSubtree(BinaryTree.create(input1), BinaryTree.create(input2)));
  }
}