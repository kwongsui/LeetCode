package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution0508 {

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] max = new int[]{0};
        List<Integer> list = new ArrayList<>();
        sum(root, map, max, list);
        int[] ret = new int[list.size()];
        int idx = 0;
        while (idx != ret.length) {
            ret[idx] = list.get(idx++);
        }
        return ret;
    }

    private int sum(TreeNode root, Map<Integer, Integer> map, int[] max, List<Integer> list) {
        if (root == null) {
            return 0;
        }
        int left = sum(root.left, map, max, list);
        int right = sum(root.right, map, max, list);
        int sum = root.val + left + right;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        if (map.get(sum) > max[0]) {
            max[0] = map.get(sum);
            list.clear();
            list.add(sum);
        } else if (map.get(sum) == max[0]) {
            list.add(sum);
        }
        return sum;
    }
}
