package pro.kwongsui.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution0401 {

  private final int[] LEDs = new int[]{1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
  private final List<String> ans = new ArrayList<>();

  public List<String> readBinaryWatch(int num) {
    backtrack(0, num, 0, 0);
    return ans;
  }

  private void backtrack(int k, int led, int hour, int minute) {
    if (led == 0) {
      if (hour <= 11 && minute <= 59) {
        ans.add(hour + ":" + (minute < 10 ? "0" + minute : minute));
      }
      return;
    }

    if (k == LEDs.length) {
      return;
    }

    if (k < 4) {
      backtrack(k + 1, led - 1, hour + LEDs[k], minute);
    } else {
      backtrack(k + 1, led - 1, hour, minute + LEDs[k]);
    }
    backtrack(k + 1, led, hour, minute);
  }
}
