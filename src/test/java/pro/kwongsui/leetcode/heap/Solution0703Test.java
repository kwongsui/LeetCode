package pro.kwongsui.leetcode.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution0703Test {

  @Test
  void add() {
    Solution0703 solution = new Solution0703(3, new int[]{4, 5, 8, 2});
    assertEquals(4, solution.add(3));
    assertEquals(5, solution.add(5));
    assertEquals(5, solution.add(10));
    assertEquals(8, solution.add(9));
    assertEquals(8, solution.add(4));

    solution = new Solution0703(1, new int[0]);
    assertEquals(-1, solution.add(-1));

    solution = new Solution0703(2, new int[]{-5});
    assertEquals(-5, solution.add(-3));

    solution = new Solution0703(2, new int[]{-5});
    assertEquals(-6, solution.add(-6));

    solution = new Solution0703(5, new int[]{4, 5, 8, 2});
    assertEquals(2, solution.add(3));
    assertEquals(3, solution.add(5));
    assertEquals(4, solution.add(10));
    assertEquals(5, solution.add(9));
    assertEquals(5, solution.add(4));

    solution = new Solution0703(4, new int[]{4, 5, 8, 2});
    assertEquals(3, solution.add(3));
    assertEquals(4, solution.add(5));
    assertEquals(5, solution.add(10));
    assertEquals(5, solution.add(9));
    assertEquals(5, solution.add(4));
  }
}