package pro.kwongsui.leetcode.stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution0020 {

  /**
   * 普通解法：栈存左括号
   */
  public boolean isValid(String s) {
    Deque<Character> stack = new LinkedList<>();
    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '[' || ch == '{') {
        stack.push(ch);
      } else if (!stack.isEmpty()) {
        if (ch == ')' && stack.peek() == '(') {
          stack.pop();
        } else if (ch == ']' && stack.peek() == '[') {
          stack.pop();
        } else if (ch == '}' && stack.peek() == '{') {
          stack.pop();
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
    return stack.isEmpty();
  }

  /**
   * 更优解法：栈存右括号
   */
  public boolean isValid2(String s) {
    if (s.length() % 2 != 0) {
      return false;
    }
    Deque<Character> stack = new LinkedList<>();
    char[] chars = s.toCharArray();
    for (char ch : chars) {
      switch (ch) {
        case '(':
          stack.push(')');
          break;
        case '[':
          stack.push(']');
          break;
        case '{':
          stack.push('}');
          break;
        default:
          if (stack.isEmpty() || ch != stack.pop()) {
            return false;
          }
      }
    }
    return stack.isEmpty();
  }

  /**
   * 可扩展性解法：哈希表存括号对，无需判断具体括号类型
   */
  public boolean isValid3(String s) {
    if (s.length() % 2 != 0) {
      return false;
    }
    Deque<Character> stack = new LinkedList<>();
    Map<Character, Character> map = new HashMap<>() {
      {
        put(')', '(');
        put(']', '[');
        put('}', '{');
      }
    };
    char[] chars = s.toCharArray();
    for (char ch : chars) {
      if (map.containsKey(ch)) {
        if (stack.isEmpty() || stack.peek() != map.get(ch)) {
          return false;
        }
        stack.pop();
      } else {
        stack.push(ch);
      }
    }
    return stack.isEmpty();
  }
}
