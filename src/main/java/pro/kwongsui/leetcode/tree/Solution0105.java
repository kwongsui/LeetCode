package pro.kwongsui.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class Solution0105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexes.put(inorder[i], i);
        }
        return doBuild(indexes, preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode doBuild(
        Map<Integer, Integer> indexes, int[] preorder, int[] inorder, int k, int l, int r) {
        if (l > r) {
            return null;
        }
        int index = indexes.get(preorder[k]);
        TreeNode left = doBuild(indexes, preorder, inorder, k + 1, l, index - 1);
        TreeNode right = doBuild(indexes, preorder, inorder, k + index - l + 1, index + 1, r);
        TreeNode root = new TreeNode(inorder[index]);
        root.left = left;
        root.right = right;
        return root;
    }
}
