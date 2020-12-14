package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.ListNodeConverter;

class Solution0160Test {

  @ParameterizedTest
  @CsvSource({
      "'2,6,4', '1,5'"
  })
  void getIntersectionNode(
      @ConvertWith(ListNodeConverter.class) ListNode headA,
      @ConvertWith(ListNodeConverter.class) ListNode headB) {
    assertNull(new Solution0160().getIntersectionNode(headA, headB));
  }
}