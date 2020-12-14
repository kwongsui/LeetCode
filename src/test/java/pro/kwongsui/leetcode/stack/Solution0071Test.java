package pro.kwongsui.leetcode.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0071Test {

    @ParameterizedTest
    @CsvSource({
        "'/', '/'",
        "'//', '/'",
        "'/./', '/'",
        "'/home/', '/home'",
        "'/../', '/'",
        "'/home//foo/', '/home/foo'",
        "'/a/./b/../../c/', '/c'",
        "'/a/../../b/../c//.//', '/c'",
        "'/a//b////c/d//././/..', '/a/b/c'"
    })
    void simplifyPath(String input, String output) {
        assertEquals(output, new Solution0071().simplifyPath(input));
    }

    @Test
    void test() {
        Deque<Integer> stack = new ArrayDeque<>();
//        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.clear();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack);
        stack.removeLast();
        System.out.println(stack);
    }
}