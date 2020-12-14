package pro.kwongsui.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0018 {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> output = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;
    for (int a = 0; a < n - 3; a++) {
      if (a == 0 || nums[a] != nums[a - 1]) {
        for (int d = n - 1; d > a + 2; d--) {
          if (d == n - 1 || nums[d] != nums[d + 1]) {
            int b = a + 1, c = d - 1;
            int min = nums[a] + nums[b] + nums[b + 1] + nums[d];
            if (target < min) {
              continue;
            }
            int max = nums[a] + nums[c - 1] + nums[c] + nums[d];
            if (target > max) {
              break;
            }
            while (b < c) {
              int sum = nums[a] + nums[b] + nums[c] + nums[d];
              if (sum < target) {
                b++;
              } else if (sum > target) {
                c--;
              } else {
                output.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                b++;
                c--;
                while (b < c && nums[b] == nums[b - 1]) {
                  b++;
                }
                while (b < c && nums[c] == nums[c + 1]) {
                  c--;
                }
              }
            }
          }
        }
      }
    }
    return output;
  }
}
