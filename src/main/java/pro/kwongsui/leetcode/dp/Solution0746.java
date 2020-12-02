package pro.kwongsui.leetcode.dp;

public class Solution0746 {

  public int minCostClimbingStairs(int[] cost) {
    int pprev = 0, prev = Math.min(cost[0], cost[1]), min = prev;
    for (int i = 2; i < cost.length; i++) {
      min = Math.min(prev + cost[i], pprev + cost[i - 1]);
      pprev = prev;
      prev = min;
    }
    return min;
  }
}
