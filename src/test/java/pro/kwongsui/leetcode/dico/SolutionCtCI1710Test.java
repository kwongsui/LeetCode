package pro.kwongsui.leetcode.dico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionCtCI1710Test {

  @Test
  void majorityElement() {
    assertEquals(3, new SolutionCtCI1710().majorityElement(new int[]{3, 2, 3}));
    assertEquals(1, new SolutionCtCI1710().majorityElement(new int[]{2, 1, 1, 1, 1, 2, 2}));
    assertEquals(1, new SolutionCtCI1710().majorityElement(new int[]{1, 2, 1, 2, 1, 2, 1}));
    assertEquals(-1, new SolutionCtCI1710().majorityElement(new int[]{2, 3}));
    assertEquals(-1, new SolutionCtCI1710().majorityElement(new int[]{1, 2, 3}));
  }
}