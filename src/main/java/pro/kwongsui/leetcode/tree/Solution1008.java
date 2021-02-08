package pro.kwongsui.leetcode.tree;

public class Solution1008 {

    private int idx = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return doConstruct(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode doConstruct(int[] preorder, int lower, int upper) {
        if (idx == preorder.length) {
            return null;
        }
        int val = preorder[idx];
        if (lower > val || val > upper) {
            return null;
        }
        idx++;
        TreeNode node = new TreeNode(val);
        node.left = doConstruct(preorder, lower, val);
        node.right = doConstruct(preorder, val, upper);
        return node;
    }
}
