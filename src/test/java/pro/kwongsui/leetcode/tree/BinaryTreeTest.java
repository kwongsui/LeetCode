package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class BinaryTreeTest {

  @ParameterizedTest
  @CsvSource({
      "'3,9,20,null,null,15,7', '3,9,20,15,7'",
      "'2,null,3,null,4,null,5,null,6', '2,3,4,5,6'"})
  void create(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
      @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
    assertIterableEquals(
        Arrays.asList(expected), BinaryTree.bfs(BinaryTree.create(input)));
  }
}