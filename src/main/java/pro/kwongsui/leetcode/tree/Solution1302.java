package pro.kwongsui.leetcode.tree;

public class Solution1302 {

    public int deepestLeavesSum(TreeNode root) {
        int[] level = new int[]{-1};
        int[] sum = new int[]{0};
        compute(root, 1, sum, level);
        return sum[0];
    }

    private void compute(TreeNode root, int l, int[] sum, int[] level) {
        if (root == null) {
            return;
        }
        if (l > level[0]) {
            level[0] = l;
            sum[0] = root.val;
        } else if (l == level[0]) {
            sum[0] += root.val;
        }
        compute(root.left, l + 1, sum, level);
        compute(root.right, l + 1, sum, level);
    }
}
