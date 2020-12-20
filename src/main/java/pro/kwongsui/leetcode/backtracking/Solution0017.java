package pro.kwongsui.leetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution0017 {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        if (digits.length() == 0) {
            return list;
        }
        char[][] letters = {{}, {},
            {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
            {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        StringBuilder builder = new StringBuilder();
        list.offer(builder.toString());
        while (!list.isEmpty() && list.peek().length() != digits.length()) {
            builder.append(list.poll());
            for (char ch : letters[digits.charAt(builder.length()) - '0']) {
                list.offer(builder.append(ch).toString());
                builder.deleteCharAt(builder.length() - 1);
            }
            builder.delete(0, builder.length());
        }
        return list;
    }

    public List<String> letterCombinations1(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) {
            return list;
        }

        char[][] letters = {{}, {},
            {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
            {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

        backtrack(digits, letters, 0, new StringBuilder(), list);

        return list;
    }

    private void backtrack(String digits, char[][] letters, int idx,
        StringBuilder combination, List<String> list) {
        if (idx == digits.length()) {
            list.add(combination.toString());
            return;
        }
        for (char ch : letters[digits.charAt(idx) - '0']) {
            backtrack(digits, letters, idx + 1, combination.append(ch), list);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
