package pro.kwongsui.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0047 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return list;
        }
        Arrays.sort(nums);
        backtrack(nums, list, new ArrayList<>(), new boolean[nums.length]);
        return list;
    }

    private void backtrack(int[] nums, List<List<Integer>> list, List<Integer> l,
        boolean[] visited) {
        if (l.size() == nums.length) {
            list.add(new ArrayList<>(l));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (i > 0 && nums[i - 1] == nums[i] && !visited[i - 1]) {
                continue;
            }
            visited[i] = true;
            l.add(nums[i]);
            backtrack(nums, list, l, visited);
            visited[i] = false;
            l.remove(l.size() - 1);
        }
    }
}
