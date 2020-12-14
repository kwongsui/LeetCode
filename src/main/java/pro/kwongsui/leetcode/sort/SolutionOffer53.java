package pro.kwongsui.leetcode.sort;

public class SolutionOffer53 {

  /**
   * 二分查找：第一个值大于索引的元素，额外考虑缺失值是最后一个元素的情况
   */
  public int missingNumber(int[] nums) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == mid) {
        if (mid == nums.length - 1) {
          return nums.length;
        }
        low = mid + 1;
      } else if (nums[mid] > mid) {
        if (mid == 0 || nums[mid - 1] == mid - 1) {
          return mid;
        } else {
          high = mid - 1;
        }
      }
    }
    return -1;
  }

  /**
   * 基本解法
   */
  public int missingNumber2(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i) {
        return i;
      }
    }
    return nums.length;
  }
}
