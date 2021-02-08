package pro.kwongsui.leetcode.tree;

public class Solution0979 {

    public int distributeCoins(TreeNode root) {
        int[] ans = new int[]{0};
        doDistribute(root, ans);
        return ans[0];
    }

    private int doDistribute(TreeNode root, int[] ans) {
        if (root == null) {
            return 0;
        }
        int l = doDistribute(root.left, ans);
        int r = doDistribute(root.right, ans);
        ans[0] += Math.abs(l) + Math.abs(r);
        return root.val + l + r - 1;
    }
}
