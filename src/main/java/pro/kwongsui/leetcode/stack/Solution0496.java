package pro.kwongsui.leetcode.stack;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution0496 {

  /**
   * 单调栈：数组2中元素以单调增顺序入栈，
   *        待入栈元素若大于栈顶元素，则栈顶元素先出栈并和待入栈元素组成键值对，待入栈元素再入栈
   */
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] result = new int[nums1.length];

    Map<Integer, Integer> map = new HashMap<>();
    Deque<Integer> stack = new LinkedList<>();
    for (int value : nums2) {
      if (!stack.isEmpty()) {
        while (!stack.isEmpty() && value > stack.peek()) {
          map.put(stack.pop(), value);
        }
      }
      stack.push(value);
    }
    while (!stack.isEmpty()) {
      map.put(stack.pop(), -1);
    }

    for (int i = 0; i < nums1.length; i++) {
      result[i] = map.get(nums1[i]);
    }

    return result;
  }

  /**
   * 常规解法：注意index每遍历一次数组2之后正确复位
   */
  public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
    int[] result = new int[nums1.length];
    Arrays.fill(result, -1);

    int index = nums2.length;
    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        if (nums1[i] == nums2[j]) {
          index = j;
        }
        if (nums1[i] < nums2[j] && j > index) {
          result[i] = nums2[j];
          break;
        }
      }
      index = nums2.length;
    }

    return result;
  }
}
