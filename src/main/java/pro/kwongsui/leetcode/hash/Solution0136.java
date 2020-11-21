package pro.kwongsui.leetcode.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution0136 {

  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    return map.entrySet().stream()
        .filter(e -> e.getValue() == 1)
        .map(Entry::getKey)
        .findFirst()
        .orElse(0);
  }

  /**
   * 1. 任何数和0异或保持不变
   * 2. 任何数和自身异或等于0
   * 3. 异或运算满足交换律和结合律
   */
  public int singleNumberUsingBitOp(int[] nums) {
    int ret = 0;
    for (int num : nums) {
      ret ^= num;
    }
    return ret;
  }
}
