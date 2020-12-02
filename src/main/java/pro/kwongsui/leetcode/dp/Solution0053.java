package pro.kwongsui.leetcode.dp;

public class Solution0053 {

  public int maxSubArray(int[] nums) {
    int max = nums[0], sum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sum = Math.max(sum + nums[i], nums[i]);
      max = Math.max(max, sum);
    }
    return max;
  }
}
