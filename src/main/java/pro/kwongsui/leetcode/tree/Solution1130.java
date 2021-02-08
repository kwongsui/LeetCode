package pro.kwongsui.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1130 {

    public int mctFromLeafValues(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.MAX_VALUE);
        int mct = 0;
        for (int v : arr) {
            while (!stack.isEmpty() && v >= stack.peek()) {
                int pop = stack.pop();
                if (stack.peek() != null) {
                    int peek = stack.peek();
                    mct += pop * Math.min(peek, v);
                }
            }
            stack.push(v);
        }
        while (stack.size() > 2) {
            int pop = stack.pop();
            if (stack.peek() != null) {
                mct += pop * stack.peek();
            }
        }
        return mct;
    }
}
