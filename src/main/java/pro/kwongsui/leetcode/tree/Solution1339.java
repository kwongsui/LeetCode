package pro.kwongsui.leetcode.tree;

public class Solution1339 {

    public int maxProduct(TreeNode root) {
        long sum = sum(root);
        long[] product = new long[]{0};
        compute(root, sum, product);
        return (int) (product[0] % 1000000007);
    }

    private long sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    private long compute(TreeNode root, long sum, long[] product) {
        if (root == null) {
            return 0;
        }
        long l = compute(root.left, sum, product);
        long r = compute(root.right, sum, product);
        product[0] = Math.max(product[0], Math.max(l * (sum - l), r * (sum - r)));
        return root.val + l + r;
    }
}
