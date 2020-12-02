package pro.kwongsui.leetcode.dp;

public class Solution0303 {

  static class NumArray {

    private final int[] sum;

    public NumArray(int[] nums) {
      sum = sum(nums);
    }

    private int[] sum(int[] nums) {
      if (nums == null) {
        return null;
      }
      int[] sum = new int[nums.length];
      if (nums.length >= 1) {
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
          sum[i] = sum[i - 1] + nums[i];
        }
      }
      return sum;
    }

    public int sumRange(int i, int j) {
      if (i == 0) {
        return sum[j];
      }
      return sum[j] - sum[i - 1];
    }
  }
}
