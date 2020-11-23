package pro.kwongsui.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class SolutionOffer54Test {

  @ParameterizedTest
  @CsvSource({
      "'3,1,4,null,2', 2, 3"
  })
  void kthLargest(@ConvertWith(IntArrayConverter.class) Integer[] input1, int input2,
      int expected) {
    Assertions.assertEquals(expected,
        new SolutionOffer54().kthLargest(BinaryTree.create(input1), input2));
  }
}