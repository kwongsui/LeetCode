package pro.kwongsui.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class Solution0337 {

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] ans = dfs2(root);
        return Math.max(ans[0], ans[1]);
    }

    private int[] dfs2(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] l = dfs2(node.left);
        int[] r = dfs2(node.right);
        int f = node.val + l[1] + r[1];
        int g = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        return new int[]{f, g};
    }

    public int rob1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Map<TreeNode, Integer> f = new HashMap<>();
        Map<TreeNode, Integer> g = new HashMap<>();
        dfs1(root, f, g);
        return Math.max(f.get(root), g.get(root));
    }

    private void dfs1(TreeNode node, Map<TreeNode, Integer> f, Map<TreeNode, Integer> g) {
        if (node == null) {
            return;
        }
        dfs1(node.left, f, g);
        dfs1(node.right, f, g);
        f.put(node, node.val
            + g.getOrDefault(node.left, 0)
            + g.getOrDefault(node.right, 0));
        g.put(node,
            Math.max(f.getOrDefault(node.left, 0),
                g.getOrDefault(node.left, 0))
                + Math.max(f.getOrDefault(node.right, 0),
                g.getOrDefault(node.right, 0)));
    }
}
