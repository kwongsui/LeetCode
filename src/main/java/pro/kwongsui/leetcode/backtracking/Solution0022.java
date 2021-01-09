package pro.kwongsui.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution0022 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(n, 0, 0, list, new StringBuilder());
        return list;
    }

    private void backtrack(int n, int left, int right, List<String> list,
        StringBuilder builder) {
        if (builder.length() == 2 * n) {
            list.add(builder.toString());
            return;
        }
        if (left < n) {
            builder.append('(');
            backtrack(n, left + 1, right, list, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
        if (right < left) {
            builder.append(')');
            backtrack(n, left, right + 1, list, builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
