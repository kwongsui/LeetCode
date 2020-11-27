package pro.kwongsui.leetcode.greedy;

public class Solution0944 {

  public int minDeletionSize(String[] A) {
    int ans = 0;
    int idx = 0;
    while (idx != A[0].length()) {
      for (int i = 1; i < A.length; i++) {
        if (A[i].charAt(idx) < A[i - 1].charAt(idx)) {
          ans++;
          break;
        }
      }
      idx++;
    }
    return ans;
  }
}
