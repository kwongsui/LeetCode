package pro.kwongsui.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution0077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(n, k, 1, list, new ArrayList<>());
        return list;
    }

    private void backtrack(int n, int k, int idx, List<List<Integer>> list, List<Integer> l) {
        if (l.size() == k) {
            list.add(new ArrayList<>(l));
            return;
        }
        if (l.size() + (n - idx + 1) < k) {
            return;
        }
        l.add(idx);
        backtrack(n, k, idx + 1, list, l);
        l.remove(l.size() - 1);
        backtrack(n, k, idx + 1, list, l);
    }
}
