package pro.kwongsui.leetcode.hash;

public class Solution0205 {

  public boolean isIsomorphic(String s, String t) {
    for (int i = 0; i < s.length(); i++) {
      // 相应位置字符第一次出现位置一致，即可相互映射，并保留顺序
      if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}
