package pro.kwongsui.leetcode.tree;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0617Test {

  @ParameterizedTest
  @CsvSource({
      "'', '', ''",
      "'1', '2', '3'",
      "'1', '', '1'",
      "'', '1', '1'",
      "'1,2,3', '1,2,3', '2,4,6'",
      "'1,3,null,null,4', '1', '2,3,null,null,4'",
      "'1,3,null,null,4', '2,null,3', '3,3,3,null,4'",
      "'3,2', '1,null,2,4', '4,2,2,null,null,4'",
      "'1,3','2,null,3', '3,3,3'",
      "'1,3,2,null,5,1', '2,1,3,null,4,null,7', '3,4,5,null,9,1,7'",
      "'1,3,2,5', '2,1,3,null,4,null,7', '3,4,5,5,4,7'"})
  void mergeTrees(@ConvertWith(IntArrayConverter.class) Integer[] input1,
      @ConvertWith(IntArrayConverter.class) Integer[] input2,
      @ConvertWith(IntArrayConverter.class) Integer[] output) {
    List<Integer> actual = BinaryTree.bfs(
        new Solution0617().mergeTrees(BinaryTree.create(input1), BinaryTree.create(input2)));
    List<Integer> expected = BinaryTree.bfs(BinaryTree.create(output));
    Assertions.assertIterableEquals(expected, actual);
  }
}