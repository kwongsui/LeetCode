package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0563Test {

  @ParameterizedTest
  @CsvSource({
      "'', 0",
      "'1', 0",
      "'1,2,3', 1",
      "'21,7,14,1,1,2,2,3,3', 9",
      "'4,2,9,3,5,null,7', 15"})
  void findTilt(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
    assertEquals(expected, new Solution0563().findTilt(BinaryTree.create(input)));
  }
}