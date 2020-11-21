package pro.kwongsui.leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution0961 {

  public int repeatedNTimes(int[] A) {
    // 2N个元素中有一个元素重复了N次，即有且只有一个元素重复
//    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    for (int a : A) {
//      map.put(a, map.getOrDefault(a, 0) + 1);
//      if (map.get(a) == A.length / 2) {
//        return a;
//      }
//      if (map.get(a) > 1) {
//        return a;
//      }
      if(!set.add(a)) {
        return a;
      }
    }
    return -1;
  }
}
