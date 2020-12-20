package pro.kwongsui.leetcode.tree;

import java.util.HashMap;
import java.util.Map;
import pro.kwongsui.leetcode.tree.TreeNode;

public class Solution0865 {


    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        return dfs(root, map);
    }

    private TreeNode dfs(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) {
            return null;
        }
        TreeNode l = dfs(root.left, map);
        TreeNode r = dfs(root.right, map);
        if (map.getOrDefault(l, -1) > map.getOrDefault(r, -1)) {
            map.put(l, map.getOrDefault(l, -1) + 1);
            return l;
        }
        if (map.getOrDefault(r, -1) > map.getOrDefault(l, -1)) {
            map.put(r, map.getOrDefault(r, -1) + 1);
            return r;
        }
        map.put(root, map.getOrDefault(l, -1) + 1);
        return root;
    }

    public TreeNode subtreeWithAllDeepest2(TreeNode root) {
        if (root == null) {
            return null;
        }
        Map<TreeNode, Integer> map = new HashMap<>();
//        updateDepth(root, 0, map);
        updateHeight(root, map);
        int left = map.getOrDefault(root.left, 0);
        int right = map.getOrDefault(root.right, 0);
        if (left == right) {
            return root;
        }
        if (left > right) {
            return subtreeWithAllDeepest2(root.left);
        }
        return subtreeWithAllDeepest2(root.right);
    }

    private int updateHeight(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) {
            return 0;
        }
        int l = updateHeight(root.left, map);
        int r = updateHeight(root.right, map);
        map.put(root, Math.max(l, r) + 1);
        return map.get(root);
    }

    private void updateDepth(TreeNode root, int depth, Map<TreeNode, Integer> map) {
        if (root == null) {
            return;
        }
        map.put(root, depth);
        updateDepth(root.left, depth + 1, map);
        updateDepth(root.right, depth + 1, map);
    }

    public TreeNode subtreeWithAllDeepest1(TreeNode root) {
        if (root == null) {
            return null;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (left == right) {
            return root;
        }
        if (left > right) {
            return subtreeWithAllDeepest1(root.left);
        }
        return subtreeWithAllDeepest1(root.right);
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
