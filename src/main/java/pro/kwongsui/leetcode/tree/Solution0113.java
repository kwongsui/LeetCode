package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution0113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        getPaths(root, sum, new ArrayList<>(), list);
        return list;
    }

    private void getPaths(TreeNode root, int sum, List<Integer> l, List<List<Integer>> list) {
        l.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            list.add(new ArrayList<>(l));
            return;
        }
        if (root.left != null) {
            getPaths(root.left, sum - root.val, l, list);
            l.remove(l.size() - 1);
        }
        if (root.right != null) {
            getPaths(root.right, sum - root.val, l, list);
            l.remove(l.size() - 1);
        }
    }
}
