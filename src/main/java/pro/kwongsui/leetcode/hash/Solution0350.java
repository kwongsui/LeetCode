package pro.kwongsui.leetcode.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution0350 {
  public int[] intersect(int[] nums1, int[] nums2) {
    if(nums1.length > nums2.length) {
      return intersect(nums2, nums1);
    }
    Map<Integer, Integer> map = new HashMap<>();
    for(int num : nums1) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    int[] ret = new int[nums1.length];
    int idx = 0;
    for(int num : nums2) {
      int count = map.getOrDefault(num, 0);
      if(count > 0) {
        ret[idx++] = num;
        map.put(num, count - 1);
      }
    }
    return Arrays.copyOfRange(ret, 0, idx);
  }
}
