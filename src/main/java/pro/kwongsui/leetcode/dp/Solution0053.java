package pro.kwongsui.leetcode.dp;

public class Solution0053 {

  public int maxSubArray(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if(nums[i - 1] > 0) {
        nums[i] += nums[i - 1];
      }
      max = Math.max(max, nums[i]);
    }
    return max;
  }

  public int maxSubArray2(int[] nums) {
    int max = nums[0], sum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sum = Math.max(sum + nums[i], nums[i]);
      max = Math.max(max, sum);
    }
    return max;
  }

  public int maxSubArray1(int[] nums) {
    return dico(nums, 0, nums.length - 1);
  }

  private int dico(int[] nums, int l, int r) {
    if (l > r) {
      return Integer.MIN_VALUE;
    }
    int m = l + (r - l) / 2;
    int lM = dico(nums, l, m - 1);
    int rM = dico(nums, m + 1, r);
    int lm = 0, lsum = 0;
    for (int i = m - 1; i >= l; i--) {
      lsum += nums[i];
      lm = Math.max(lm, lsum);
    }
    int rm = 0, rsum = 0;
    for (int i = m + 1; i <= r; i++) {
      rsum += nums[i];
      rm = Math.max(rm, rsum);
    }
    return Math.max(lm + nums[m] + rm, Math.max(lM, rM));
  }
}
