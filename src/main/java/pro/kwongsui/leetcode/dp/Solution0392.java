package pro.kwongsui.leetcode.dp;

public class Solution0392 {

  public boolean[][] isSubsequence(String s, String t) {
    boolean[][] states = new boolean[s.length()][t.length()];

    for (int j = 0; j < t.length(); j++) {
      if (s.charAt(0) == t.charAt(j)) {
        states[0][j] = true;
      } else if (j != 0) {
        states[0][j] = states[0][j - 1];
      } else {
        states[0][j] = false;
      }
    }

    for (int i = 1; i < s.length(); i++) {
      states[i][0] = false;
    }

    for (int i = 1; i < s.length(); i++) {
      for (int j = 1; j < t.length(); j++) {
        if (s.charAt(i) == t.charAt(j)) {
          states[i][j] = states[i - 1][j - 1];
        } else {
          states[i][j] = states[i - 1][j] && states[i][j - 1];
        }
      }
    }

    return states;
  }

  public void print(boolean[][] states) {
    for (boolean[] state : states) {
      for (boolean b : state) {
        System.out.print(b ? "T " : "F ");
      }
      System.out.println();
    }
  }
}
