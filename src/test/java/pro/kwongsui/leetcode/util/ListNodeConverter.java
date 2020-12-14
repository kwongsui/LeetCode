package pro.kwongsui.leetcode.util;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;
import pro.kwongsui.leetcode.linkedlist.ListNode;

public class ListNodeConverter implements ArgumentConverter {

  @Override
  public Object convert(Object source, ParameterContext context)
      throws ArgumentConversionException {
    if (!(source instanceof String)) {
      throw new IllegalArgumentException("The argument should be a string: " + source);
    }
    try {
      if (((String) source).length() == 0) {
        return null;
      }
      String[] s = ((String) source).split(",");
      ListNode sentinel = new ListNode(-1), p = sentinel;
      int idx = 0;
      while (idx != s.length) {
        p.next = new ListNode(Integer.parseInt(s[idx++]));
        p = p.next;
      }
      return sentinel.next;
    } catch (Exception e) {
      throw new IllegalArgumentException("Failed to convert", e);
    }
  }
}
