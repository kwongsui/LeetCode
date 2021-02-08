package pro.kwongsui.leetcode.tree;

public class Solution0968 {

    public String smallestFromLeaf(TreeNode root) {
        String[] ans = new String[1];
        dfs(root, ans, new StringBuilder());
        return ans[0];
    }

    private void dfs(TreeNode root, String[] ans, StringBuilder builder) {
        builder.insert(0, (char) (root.val + 'a'));
        if (root.left == null && root.right == null) {
            if (ans[0] == null || builder.toString().compareTo(ans[0]) < 0) {
                ans[0] = builder.toString();
            }
        }
        if (root.left != null) {
            dfs(root.left, ans, builder);
            builder.deleteCharAt(0);
        }
        if (root.right != null) {
            dfs(root.right, ans, builder);
            builder.deleteCharAt(0);
        }
    }
}
