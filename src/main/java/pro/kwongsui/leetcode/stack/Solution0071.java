package pro.kwongsui.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Solution0071 {

    public String simplifyPath(String path) {
        String[] seq = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : seq) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else if (s.length() > 0 && !s.equals(".")) {
                stack.addLast(s);
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append("/").append(stack.pop());
        }
        if (builder.length() == 0) {
            builder.append("/");
        }
        return builder.toString();
    }

    public String simplifyPath2(String path) {
        String[] seq = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        stack.push("/");
        if (seq.length > 1) {
            for (int i = 1; i < seq.length; i++) {
                if (seq[i].equals("..")) {
                    if (!stack.isEmpty() && !stack.peek().equals("/")) {
                        stack.pop();
                        stack.pop();
                    }
                    if (stack.isEmpty()) {
                        stack.push("/");
                    }
                } else if (!stack.isEmpty() && seq[i].length() >= 1 && !seq[i].equals(".")) {
                    if (!stack.peek().equals("/")) {
                        stack.push("/");
                    }
                    stack.push(seq[i]);
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.insert(0, stack.pop());
        }
        return builder.toString();
    }
}
