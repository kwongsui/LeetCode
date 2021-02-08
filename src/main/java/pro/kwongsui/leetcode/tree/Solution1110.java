package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1110 {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for (int val : to_delete) {
            set.add(val);
        }
        List<TreeNode> list = new ArrayList<>();
        if (!set.contains(root.val)) {
            list.add(root);
        }
        doDelete(root, set, list);
        return list;
    }

    private TreeNode doDelete(TreeNode root, Set<Integer> set, List<TreeNode> list) {
        if (root == null) {
            return null;
        }
        root.left = doDelete(root.left, set, list);
        root.right = doDelete(root.right, set, list);
        if (set.contains(root.val)) {
            if (root.left != null) {
                list.add(root.left);
            }
            if (root.right != null) {
                list.add(root.right);
            }
            root = null;
        }
        return root;
    }
}
