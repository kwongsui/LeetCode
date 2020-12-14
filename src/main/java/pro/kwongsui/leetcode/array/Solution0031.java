package pro.kwongsui.leetcode.array;

import java.util.Arrays;

public class Solution0031 {

  public void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }
    if(i >= 0) {
      int j = nums.length - 1;
      while(j >= 0 && nums[i] >= nums[j]) {
        j--;
      }
      swap(nums, i, j);
    }
    reverse(nums, i + 1, nums.length - 1);
  }

  public void reverse(int[] nums, int i, int j) {
    while (i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  public void nextPermutation2(int[] nums) {
    boolean next = false;
    for (int i = nums.length - 1; i > 0; i--) {
      if (nums[i] > nums[i - 1]) {
        swap(nums, i - 1, search(nums, i - 1));
        Arrays.sort(nums, i, nums.length);
        next = true;
        break;
      }
    }
    if (!next) {
      Arrays.sort(nums);
    }
  }

  public void nextPermutation3(int[] nums) {
    int i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }
    if(i >= 0) {
      swap(nums, i, search(nums, i));
    }
    reverse(nums, i + 1, nums.length - 1);
  }

  /**
   * 二分查找数组中出现在索引k之后的最后一个比索引k元素大的元素
   */
  private int search(int[] nums, int k) {
    int l = k + 1, h = nums.length - 1;
    while (l <= h) {
      int mid = l + (h - l) / 2;
      if (nums[mid] <= nums[k]) {
        h = mid - 1;
      } else {
        if (mid == nums.length - 1 || nums[mid + 1] <= nums[k]) {
          return mid;
        } else {
          l = mid + 1;
        }
      }
    }
    return k;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
