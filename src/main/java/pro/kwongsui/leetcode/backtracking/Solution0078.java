package pro.kwongsui.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution0078 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, 0, list, new ArrayList<>());
        return list;
    }

    private void backtrack(int[] nums, int k, List<List<Integer>> list, ArrayList<Integer> l) {
        if (k == nums.length) {
            list.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[k]);
        backtrack(nums, k + 1, list, l);
        l.remove(l.size() - 1);
        backtrack(nums, k + 1, list, l);
    }
}
