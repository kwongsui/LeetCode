package pro.kwongsui.leetcode.greedy;

public class Solution1221 {

  public int balancedStringSplit(String s) {
    int cntL = 0, cntR = 0, cnt = 0;
    for (char ch : s.toCharArray()) {
      if (ch == 'L') {
        cntL++;
      } else {
        cntR++;
      }
      if (cntL == cntR) {
        cnt++;
      }
    }
    return cnt;
  }
}
