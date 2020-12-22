package pro.kwongsui.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class Solution0106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexes.put(inorder[i], i);
        }
        return doBuild(indexes, inorder, postorder,
            postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode doBuild(
        Map<Integer, Integer> indexes, int[] inorder, int[] postorder, int k, int l, int r) {
        if (l > r) {
            return null;
        }
        int index = indexes.get(postorder[k]);
        TreeNode left = doBuild(indexes, inorder, postorder, k + index - r - 1, l, index - 1);
        TreeNode right = doBuild(indexes, inorder, postorder, k - 1, index + 1, r);
        TreeNode root = new TreeNode(inorder[index]);
        root.left = left;
        root.right = right;
        return root;
    }
}
