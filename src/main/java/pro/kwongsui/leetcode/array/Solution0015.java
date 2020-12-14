package pro.kwongsui.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0015 {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> output = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] <= 0 && (i == 0 || nums[i] != nums[i - 1])) {
        int l = i + 1, r = nums.length - 1;
        while (l < r) {
          if (nums[l] + nums[r] < -nums[i]) {
            l++;
          } else if (nums[l] + nums[r] > -nums[i]) {
            r--;
          } else {
            output.add(Arrays.asList(nums[i], nums[l], nums[r]));
            while (l < r && nums[l + 1] == nums[l]) {
              l++;
            }
            while (l < r && nums[r - 1] == nums[r]) {
              r--;
            }
            l++;
            r--;
          }
        }
      }
    }
    return output;
  }

  public List<List<Integer>> threeSum3(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[k]);
            if (!res.contains(list)) {
              res.add(list);
            }
          }
        }
      }
    }
    return res;
  }
}
