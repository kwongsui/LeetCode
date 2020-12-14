package pro.kwongsui.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class Solution0205 {

  /**
   * 常规解法：哈希表映射s中字符到t中字符
   *          额外考虑s中字符未映射到t中字符，而哈希表中已有被映射为t中字符的记录
   */
  public boolean isIsomorphic(String s, String t) {
    int length = s.length();
    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < length; i++) {
      if (map.containsKey(s.charAt(i))) {
        if (map.get(s.charAt(i)) != t.charAt(i)) {
          return false;
        }
      } else {
        if (map.containsValue(t.charAt(i))) {
          return false;
        } else {
          map.put(s.charAt(i), t.charAt(i));
        }
      }
    }
    return true;
  }

  public boolean isIsomorphic2(String s, String t) {
    for (int i = 0; i < s.length(); i++) {
      // 相应位置字符第一次出现位置一致，即可相互映射，并保留顺序
      if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}
