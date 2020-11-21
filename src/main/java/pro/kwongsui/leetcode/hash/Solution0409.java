package pro.kwongsui.leetcode.hash;

public class Solution0409 {

  public int longestPalindrome(String s) {
    /*
     * 构建计数数组统计字符串中大小写字母出现次数
     * 数组长度为52，下标设计为0~25对应a~z，26~51对应A~Z
     */
    int[] counter = new int[('z' - 'a' + 1) * 2];
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      int idx = 'a' <= ch && ch <= 'z' ? ch - 'a' : ch - 'A' + 26; // 只考虑大小写字母
      counter[idx]++;
    }
    /*
     * 回文左右对称，中间至多出现一个字母
     */
    int ret = 0;
    boolean hasOne = false; // 中间是否有出现一次的字母，即回文长度是否奇数
    for (int cnt : counter) {
      // 偶数次
      if (cnt % 2 == 0) {
        ret += cnt;
      }
      // 不为1的奇数次
      if (cnt != 1 && cnt % 2 != 0) {
        ret += cnt - 1;
        hasOne = true; // 没有只出现一次的字母，用来作为回文中间字母
      }
      // 有只出现一次的字母，可用来作为回文中间字母
      if (cnt == 1) {
        hasOne = true;
      }
    }
    if (hasOne) {
      ret += 1;
    }
    return ret;
  }
}
