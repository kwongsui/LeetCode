package pro.kwongsui.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class Solution0594 {

  public int findLHS(int[] nums) {
    int max = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
      // 需要考虑上一个数和下一个数是否存在
      if(map.containsKey(num - 1)) {
        max = Math.max(max, map.get(num - 1) + map.get(num));
      }
      if(map.containsKey(num + 1)) {
        max = Math.max(max, map.get(num) + map.get(num + 1));
      }
    }
    return max;
  }
}
