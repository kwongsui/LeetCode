package pro.kwongsui.leetcode.array;

import java.util.Arrays;

public class Solution0016 {

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int diff = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length && diff != 0; i++) {
      int l = i + 1, r = nums.length - 1;
      while (l < r) {
        int min = nums[i] + nums[l] + nums[l + 1];
        if (target < min) {
          if (Math.abs(min - target) < Math.abs(diff)) {
            diff = min - target;
          }
          break;
        }
        int max = nums[i] + nums[r - 1] + nums[r];
        if (target > max) {
          if (Math.abs(max - target) < Math.abs(diff)) {
            diff = max - target;
          }
          break;
        }
        int sum = nums[i] + nums[l] + nums[r];
        if (Math.abs(sum - target) < Math.abs(diff)) {
          diff = sum - target;
        }
        if (sum < target) {
          l++;
        } else {
          r--;
        }
      }
    }
    return diff + target;
  }
}
