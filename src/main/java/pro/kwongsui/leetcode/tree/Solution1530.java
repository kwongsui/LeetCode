package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution1530 {

    public int countPairs(TreeNode root, int distance) {
        if (root == null) {
            return 0;
        }
        int[] ans = new int[]{0};
        dfs(root, distance, ans);
        return ans[0];
    }

    private List<Integer> dfs(TreeNode root, int distance, int[] ans) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(0);
            return list;
        }
        List<Integer> l = dfs(root.left, distance, ans);
        List<Integer> r = dfs(root.right, distance, ans);
        for (int d : l) {
            if (d + 1 <= distance) {
                list.add(d + 1);
            }
        }
        for (int d : r) {
            if (d + 1 <= distance) {
                list.add(d + 1);
            }
        }
        for (int dl : l) {
            for (int dr : r) {
                if (dl + 1 + dr + 1 <= distance) {
                    ans[0]++;
                }
            }
        }
        return list;
    }
}
