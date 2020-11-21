package pro.kwongsui.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

public class Solution0202 {

  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    int sum = 0;
    while (true) {
      sum += (int) (Math.pow(n % 10, 2));
      n /= 10;

      if (n == 0) {
        if (sum == 1) {
          return true;
        }
        if (!set.contains(sum)) {
          set.add(sum);
        } else {
          return false;
        }
        n = sum;
        sum = 0;
      }
    }
  }
}
