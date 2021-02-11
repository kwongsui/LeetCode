package pro.kwongsui.leetcode.tree;

public class Solution1448 {

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] ans = new int[]{0};
        count(root, root.val, ans);
        return ans[0];
    }

    private void count(TreeNode root, int max, int[] ans) {
        if (root == null) {
            return;
        }
        if (root.val >= max) {
            ans[0]++;
            max = root.val;
        }
        count(root.left, max, ans);
        count(root.right, max, ans);
    }
}
