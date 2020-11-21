package pro.kwongsui.leetcode.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0784Test {

  Solution0784 solution = new Solution0784();

  @Test
  void shortestCompletingWord() {
    Assertions.assertEquals("steps", solution
        .shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));
  }
}