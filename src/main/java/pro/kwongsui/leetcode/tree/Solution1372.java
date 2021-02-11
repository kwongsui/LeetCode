package pro.kwongsui.leetcode.tree;

public class Solution1372 {

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] ans = new int[]{0};
        dfs(root, false, 0, ans);
        dfs(root, true, 0, ans);
        return ans[0];
    }

    // 向左为 false，向右为 true
    private void dfs(TreeNode root, boolean dir, int len, int[] ans) {
        ans[0] = Math.max(ans[0], len);
        if (root == null) {
            return;
        }
        if (!dir) {
            if (root.left != null) {
                dfs(root.left, true, len + 1, ans);
            }
            if (root.right != null) {
                dfs(root.right, false, 1, ans);
            }
        } else {
            if (root.right != null) {
                dfs(root.right, false, len + 1, ans);
            }
            if (root.left != null) {
                dfs(root.left, true, 1, ans);
            }
        }
    }
}
