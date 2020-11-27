package pro.kwongsui.leetcode.greedy;

import java.util.HashSet;
import java.util.Set;

public class Solution0874 {

  private static final int NORTH = 0;
  private static final int EAST = 1;
  private static final int SOUTH = 2;
  private static final int WEST = 3;

  public int robotSim(int[] commands, int[][] obstacles) {
    Set<String> set = new HashSet<>(obstacles.length);
    if (obstacles.length > 0) {
      for (int[] o : obstacles) {
        set.add(o[0] + "," + o[1]);
      }
    }

    int dx = 0, dy = 0;
    int orientation = NORTH;
    int max = 0;
    if (commands.length > 0) {
      for (int command : commands) {
        switch (command) {
          case -2:
            orientation = (orientation + 3) % 4;
            break;
          case -1:
            orientation = (orientation + 1) % 4;
            break;
          default:
            int step = 0;
            while (step++ != command) {
              if (orientation == NORTH && !set.contains(dx + "," + (dy + 1))) {
                dy++;
              }
              if (orientation == SOUTH && !set.contains(dx + "," + (dy - 1))) {
                dy--;
              }
              if (orientation == WEST && !set.contains((dx - 1) + "," + dy)) {
                dx--;
              }
              if (orientation == EAST && !set.contains((dx + 1) + "," + dy)) {
                dx++;
              }
            }
            max = Math.max(max, dx * dx + dy * dy);
        }
      }
    }

    return max;
  }
}
