package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class Solution0015Test {

  @Test
  void threeSum() {
    assertIterableEquals(
        Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)),
        new Solution0015().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    assertIterableEquals(
        Collections.emptyList(), new Solution0015().threeSum(new int[0]));
    assertIterableEquals(
        Collections.emptyList(), new Solution0015().threeSum(new int[]{0}));
    assertIterableEquals(
        Collections.singletonList(Arrays.asList(0, 0, 0)),
        new Solution0015().threeSum(new int[]{0, 0, 0}));
    assertIterableEquals(
        Arrays.asList(Arrays.asList(-2, 0, 2), Arrays.asList(-2, 1, 1)),
        new Solution0015().threeSum(new int[]{-2, 0, 1, 1, 2}));
  }
}