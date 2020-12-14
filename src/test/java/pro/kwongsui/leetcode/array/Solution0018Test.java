package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Solution0018Test {

  @Test
  void fourSum() {
    assertIterableEquals(
        Arrays.asList(
            Arrays.asList(-2, -1, 1, 2),
            Arrays.asList(-2, 0, 0, 2),
            Arrays.asList(-1, 0, 0, 1)),
        new Solution0018().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
  }
}