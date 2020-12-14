package pro.kwongsui.leetcode.recursion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionCtCI1611Test {

  @Test
  void divingBoard() {
    assertArrayEquals(new int[0],
        new SolutionCtCI1611().divingBoard(1, 2, 0));
    assertArrayEquals(new int[]{1, 2},
        new SolutionCtCI1611().divingBoard(1, 2, 1));
    assertArrayEquals(new int[]{2, 3, 4},
        new SolutionCtCI1611().divingBoard(1, 2, 2));
    assertArrayEquals(new int[]{3, 4, 5, 6},
        new SolutionCtCI1611().divingBoard(1, 2, 3));
    assertArrayEquals(new int[]{3},
        new SolutionCtCI1611().divingBoard(1, 1, 3));
//    assertArrayEquals(new int[]{3},
//        new SolutionCtCI1611().divingBoard(7, 3625, 19808));
  }
}