package pro.kwongsui.offer;

import java.util.HashMap;
import java.util.Map;
import pro.kwongsui.leetcode.tree.TreeNode;

public class Solution07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return doBuild(preorder, inorder, 0, 0, inorder.length - 1, map);
    }

    private TreeNode doBuild(int[] preorder, int[] inorder, int k, int l, int r,
        Map<Integer, Integer> map) {
        if (l > r) {
            return null;
        }
        int idx = map.get(preorder[k]);
        TreeNode left = doBuild(preorder, inorder, k + 1, l, idx - 1, map);
        TreeNode right = doBuild(preorder, inorder, k + idx - l + 1, idx + 1, r, map);
        TreeNode node = new TreeNode(preorder[k]);
        node.left = left;
        node.right = right;
        return node;
    }
}
