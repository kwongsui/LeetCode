package pro.kwongsui.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import pro.kwongsui.leetcode.tree.TreeNode;

public class Solution0098 {

    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode prev = null;
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (prev != null && prev.val >= p.val) {
                return false;
            }
            prev = p;
            p = p.right;
        }
        return true;
    }

    public boolean isValidBST3(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST3(root.left)) {
            return false;
        }
        if (prev != null && prev.val >= root.val) {
            return false;
        }
        prev = root;
        return isValidBST3(root.right);
    }

    public boolean isValidBST2(TreeNode root) {
        return isValidBST2(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean isValidBST2(TreeNode root, long max, long min) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST2(root.left, root.val, min) && isValidBST2(root.right, max, root.val);
    }

    public boolean isValidBST1(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && max(root.left, root.left.val) >= root.val) {
            return false;
        }
        if (root.right != null && min(root.right, root.right.val) <= root.val) {
            return false;
        }
        return isValidBST1(root.left) && isValidBST1(root.right);
    }

    private int max(TreeNode root, int max) {
        if (root == null) {
            return max;
        }
        if (root.val > max) {
            max = root.val;
        }
        return Math.max(max(root.left, max), max(root.right, max));
    }

    private int min(TreeNode root, int min) {
        if (root == null) {
            return min;
        }
        if (root.val < min) {
            min = root.val;
        }
        return Math.min(min(root.left, min), min(root.right, min));
    }
}
