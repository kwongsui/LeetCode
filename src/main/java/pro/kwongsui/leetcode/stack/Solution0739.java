package pro.kwongsui.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution0739 {

    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < T.length; i++) {
            if(!stack.isEmpty()) {
                while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                    int idx = stack.pop();
                    days[idx] = i - idx;
                }
            }
            stack.push(i);
        }
        return days;
    }

    public int[] dailyTemperatures1(int[] T) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < T.length; i++) {
            if(!stack.isEmpty()) {
                while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                    map.put(stack.peek(), i - stack.pop());
                }
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), 0);
        }
        int[] days = new int[T.length];
        for(int i = 0; i < days.length; i++) {
            days[i] = map.get(i);
        }
        return days;
    }
}
