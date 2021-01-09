package pro.kwongsui.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution0039 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates, target, 0, list, new ArrayList<>());
        return list;
    }

    private void backtrack(int[] candidates, int target, int k, List<List<Integer>> list,
        List<Integer> l) {
        if (target == 0) {
            list.add(new ArrayList<>(l));
            return;
        }
        if (k == candidates.length) {
            return;
        }
        if(target - candidates[k] >= 0) {
            l.add(candidates[k]);
            backtrack(candidates, target - candidates[k], k, list, l);
            l.remove(l.size() - 1);
        }
        backtrack(candidates, target, k + 1, list, l);
    }
}
