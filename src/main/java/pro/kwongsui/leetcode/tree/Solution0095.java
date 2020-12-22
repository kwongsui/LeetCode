package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution0095 {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return doBST(1, n);
    }

    private List<TreeNode> doBST(int k, int n) {
        List<TreeNode> list = new ArrayList<>();
        if (k > n) {
            list.add(null);
            return list;
        }
        for (int i = k; i <= n; i++) {
            List<TreeNode> left = doBST(k, i - 1);
            List<TreeNode> right = doBST(i + 1, n);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
