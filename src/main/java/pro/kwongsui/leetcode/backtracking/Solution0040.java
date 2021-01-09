package pro.kwongsui.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0040 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
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
            backtrack(candidates, target - candidates[k], k + 1, list, l);
            l.remove(l.size() - 1);
        }
        while(k < candidates.length - 1 && candidates[k + 1] == candidates[k]) {
            k++;
        }
        backtrack(candidates, target, k + 1, list, l);
    }
}
