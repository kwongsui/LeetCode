package pro.kwongsui.leetcode.tree;

import java.util.Arrays;

public class Solution0889 {

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return doConstruct(pre, post, 0, 0, post.length);
    }

    private TreeNode doConstruct(int[] pre, int[] post, int from1, int from2, int total) {
        if (total == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[from1]);
        if (total == 1) {
            return root;
        }

        int left = 1;
        for (; left < total; left++) {
            if (pre[from1 + 1] == post[from2 + left - 1]) {
                break;
            }
        }

        root.left = doConstruct(pre, post, from1 + 1, from2, left);
        root.right = doConstruct(pre, post, from1 + left + 1, from2 + left,
            total - left - 1);

        return root;
    }

    public TreeNode constructFromPrePost1(int[] pre, int[] post) {
        int total = pre.length;
        if (total == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        if (total == 1) {
            return root;
        }

        int left = 0;
        for (int i = 0; i < total; i++) {
            if (pre[1] == post[i]) {
                left = i + 1;
            }
        }

        root.left = constructFromPrePost1(Arrays.copyOfRange(pre, 1, left + 1),
            Arrays.copyOfRange(post, 0, left));
        root.right = constructFromPrePost1(Arrays.copyOfRange(pre, left + 1, total),
            Arrays.copyOfRange(post, left, total - 1));

        return root;
    }
}
