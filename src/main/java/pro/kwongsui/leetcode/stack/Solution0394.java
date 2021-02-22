package pro.kwongsui.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution0394 {

    public String decodeString(String s) {
        StringBuilder builder = new StringBuilder();
        int time = 0;
        Deque<Integer> times = new ArrayDeque<>();
        Deque<String> repeat = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if ('0' <= ch && ch <= '9') {
                time = time * 10 + (ch - '0');
            } else if (ch == '[') {
                times.push(time);
                repeat.push(builder.toString());
                time = 0;
                builder.delete(0, builder.length());
            } else if (ch == ']') {
                String str = builder.toString();
                builder.delete(0, builder.length());
                builder.append(repeat.pop()).append(str.repeat(times.pop()));
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
