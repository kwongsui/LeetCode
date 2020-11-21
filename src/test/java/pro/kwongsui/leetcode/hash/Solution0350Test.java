package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0350Test {

  Solution0350 solution = new Solution0350();

  @Test
  void intersect() {
    int[] nums1 = new int[]{9, 4, 9, 4, 5};
    int[] nums2 = new int[]{4, 9, 8};
    int[] ret = solution.intersect(nums1, nums2);
    Assertions.assertEquals(9, ret[0]);
    Assertions.assertEquals(4, ret[1]);
  }
}