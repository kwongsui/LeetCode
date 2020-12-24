package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution0437 {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int[] cnt = new int[]{0};
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        dfs(root, sum, 0, map, cnt);
        return cnt[0];
    }

    private void dfs(TreeNode node, int sum, int curr, Map<Integer, Integer> map, int[] cnt) {
        if (node == null) {
            return;
        }
        curr += node.val;
        cnt[0] += map.getOrDefault(curr - sum, 0);
        map.put(curr, map.getOrDefault(curr, 0) + 1);
        dfs(node.left, sum, curr, map, cnt);
        dfs(node.right, sum, curr, map, cnt);
        map.put(curr, map.get(curr) - 1);
    }

    public int pathSum4(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int depth = depth(root);
        int[] path = new int[depth + 1];
        int[] cnt = new int[]{0};
        dfs4(root, sum, path, 0, cnt);
        return cnt[0];
    }

    public void dfs4(TreeNode root, int sum, int[] path, int level, int[] cnt) {
        if (root == null) {
            return;
        }
        path[level] = root.val;
        int total = 0;
        for (int i = level; i >= 0; i--) {
            total += path[i];
            if (total == sum) {
                cnt[0]++;
            }
        }
        dfs4(root.left, sum, path, level + 1, cnt);
        dfs4(root.right, sum, path, level + 1, cnt);
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    public int pathSum3(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int[] cnt = new int[]{0};
        dfs3(root, sum, new ArrayList<>(), cnt);
        return cnt[0];
    }

    private void dfs3(TreeNode root, int sum, ArrayList<Integer> list, int[] cnt) {
        if (root == null) {
            return;
        }
        list = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + root.val);
            if (list.get(i) == sum) {
                cnt[0]++;
            }
        }
        list.add(root.val);
        if (root.val == sum) {
            cnt[0]++;
        }
        if (root.left != null) {
            dfs3(root.left, sum, list, cnt);
        }
        if (root.right != null) {
            dfs3(root.right, sum, list, cnt);
        }
    }

    public int pathSum2(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return dfs2(root, sum) + pathSum2(root.left, sum) + pathSum2(root.right, sum);
    }

    private int dfs2(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        return (node.val == sum ? 1 : 0)
            + dfs2(node.left, sum - node.val) + dfs2(node.right, sum - node.val);
    }

    public int pathSum1(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int[] cnt = new int[]{0};
        path(root, sum, cnt);
        return cnt[0];
    }

    private void path(TreeNode node, int sum, int[] cnt) {
        if (node == null) {
            return;
        }
        sum(node, sum, cnt);
        path(node.left, sum, cnt);
        path(node.right, sum, cnt);
    }

    private void sum(TreeNode node, int sum, int[] cnt) {
        if (node == null) {
            return;
        }
        if (node.val == sum) {
            cnt[0]++;
//            return;
        }
        sum(node.left, sum - node.val, cnt);
        sum(node.right, sum - node.val, cnt);
    }
}
