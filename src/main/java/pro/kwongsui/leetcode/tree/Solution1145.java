package pro.kwongsui.leetcode.tree;

public class Solution1145 {

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        boolean[] flag = new boolean[]{false};
        postorder(root, n, x, flag);
        return flag[0];
    }

    private int postorder(TreeNode root, int n, int x, boolean[] flag) {
        if (root == null) {
            return 0;
        }
        int left = postorder(root.left, n, x, flag);
        int right = postorder(root.right, n, x, flag);
        if (root.val == x
            && (n / 2 > left + right || left > n / 2 || right > n / 2)) { // n 为奇数
            flag[0] = true;
        }
        return left + right + 1;
    }
}
