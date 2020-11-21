package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0001Test {

  Solution0001 solution = new Solution0001();

  @Test
  void twoSum() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    Assertions.assertEquals(0, solution.twoSum(nums, target)[0]);
    Assertions.assertEquals(1, solution.twoSum(nums, target)[1]);
  }
}