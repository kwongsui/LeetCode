package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0811Test {
Solution0811 solution = new Solution0811();
  @Test
  void subdomainVisits() {
    List<String> res = solution.subdomainVisits(new String[] {"9001 discuss.leetcode.com"});
    Assertions.assertEquals("9001 discuss.leetcode.com", res.get(0));
    Assertions.assertEquals("9001 leetcode.com", res.get(1));
    Assertions.assertEquals("9001 com", res.get(2));
  }
}