package pro.kwongsui.leetcode.tree;

public class Solution1315 {

    public int sumEvenGrandparent(TreeNode root) {
        int[] sum = new int[]{0};
        compute(root, 1, 1, sum);
        return sum[0];
    }

    private void compute(TreeNode root, int gval, int pval, int[] sum) {
        if (root == null) {
            return;
        }
        if (gval % 2 == 0) {
            sum[0] += root.val;
        }
        compute(root.left, pval, root.val, sum);
        compute(root.right, pval, root.val, sum);
    }

    public int sumEvenGrandparent1(TreeNode root) {
        int[] sum = new int[]{0};
        compute1(root, sum);
        return sum[0];
    }

    private void compute1(TreeNode root, int[] sum) {
        if (root == null) {
            return;
        }
        if (root.val % 2 == 0) {
            if (root.left != null) {
                sum[0] += root.left.left != null ? root.left.left.val : 0;
                sum[0] += root.left.right != null ? root.left.right.val : 0;
            }
            if (root.right != null) {
                sum[0] += root.right.left != null ? root.right.left.val : 0;
                sum[0] += root.right.right != null ? root.right.right.val : 0;
            }
        }
        compute1(root.left, sum);
        compute1(root.right, sum);
    }
}
