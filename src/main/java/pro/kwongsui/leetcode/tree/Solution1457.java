package pro.kwongsui.leetcode.tree;

public class Solution1457 {

    public int pseudoPalindromicPaths(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] ans = new int[]{0};
        dfs(root, 0, ans);
        return ans[0];
    }

    private void dfs(TreeNode root, int n, int[] ans) {
        n ^= 1 << root.val;
        if (root.left == null && root.right == null) {
            if ((n & (n - 1)) == 0) {
                ans[0]++;
            }
            return;
        }
        if (root.left != null) {
            dfs(root.left, n, ans);
        }
        if (root.right != null) {
            dfs(root.right, n, ans);
        }
    }

    public int pseudoPalindromicPaths1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] ans = new int[]{0};
        int[] counter = new int[10];
        dfs(root, counter, ans);
        return ans[0];
    }

    private void dfs(TreeNode root, int[] counter, int[] ans) {
        counter[root.val]++;
        if (root.left == null && root.right == null) {
            if (isPalindromic(counter)) {
                ans[0]++;
            }
            return;
        }
        if (root.left != null) {
            dfs(root.left, counter, ans);
            counter[root.left.val]--;
        }
        if (root.right != null) {
            dfs(root.right, counter, ans);
            counter[root.right.val]--;
        }
    }

    private boolean isPalindromic(int[] counter) {
        int oddCount = 0;
        for (int cnt : counter) {
            if (cnt % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }
}
