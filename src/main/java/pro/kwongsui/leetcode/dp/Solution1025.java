package pro.kwongsui.leetcode.dp;

public class Solution1025 {

  public boolean divisorGame(int N) {
    if (N == 1) {
      return false;
    }

    boolean[] states = new boolean[N + 1];
    states[1] = false;
    states[2] = true;

    for (int n = 3; n <= N; n++) {
      for (int x = 1; x <= n / 2; x++) {
        if (n % x == 0 && !states[n - x]) {
          states[n] = true;
          break;
        }
      }
    }

    return states[N];
  }
}
