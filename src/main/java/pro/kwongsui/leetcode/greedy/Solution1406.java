package pro.kwongsui.leetcode.greedy;

import java.util.Arrays;

public class Solution1406 {

  public int lastStoneWeight(int[] stones) {
    if (stones.length == 1) {
      return stones[0];
    }

    Arrays.sort(stones);
    while (stones[stones.length - 2] != 0) {
      smash(stones);
      Arrays.sort(stones);
    }

    return stones[stones.length - 1];
  }

  private void smash(int[] stones) {
    stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
    stones[stones.length - 2] = 0;
  }
}
