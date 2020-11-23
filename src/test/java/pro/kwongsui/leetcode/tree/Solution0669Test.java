package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0669Test {

  @ParameterizedTest
  @CsvSource({
      "'', '1', '2', ''",
      "'1,2', '3', '4', ''",
      "'1,0,2', '1', '2','1,2'",
      "'3,0,4,null,2,null,null,1', '1', '3', '3,2,1'",
      "'1', '1', '2', '1'",
      "'1,null,2', '1', '3', '1,2'",
      "'1,null,2', '2', '4', '2'",
      "'3,0,null,null,1,2', '1', '2', '1,2'",
      "'3,0,4,null,1,null,9,2,null,8,10,null,null,6', '4', '10', '4,9,8,10,6'"})
  void trimBST(
      @ConvertWith(IntArrayConverter.class) Integer[] input1,
      String input2,
      String input3,
      @ConvertWith(IntArrayConverter.class) Integer[] expected) {
    Assertions.assertIterableEquals(Arrays.asList(expected),
        BinaryTree.bfs(new Solution0669().trimBST(
            BinaryTree.create(input1),
            Integer.parseInt(input2),
            Integer.parseInt(input3))));
  }
}