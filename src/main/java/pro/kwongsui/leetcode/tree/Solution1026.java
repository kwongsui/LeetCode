package pro.kwongsui.leetcode.tree;

public class Solution1026 {

    public int maxAncestorDiff(TreeNode root) {
        int[] ans = new int[]{0};
        dfs(root, root.val, root.val, ans);
        return ans[0];
    }

    private void dfs(TreeNode root, int max, int min, int[] ans) {
        if (root == null) {
            return;
        }
        ans[0] = Math.max(ans[0], Math.max(Math.abs(root.val - max), Math.abs(root.val - min)));
        max = Math.max(root.val, max);
        min = Math.min(root.val, min);
        dfs(root.left, max, min, ans);
        dfs(root.right, max, min, ans);
    }
}
