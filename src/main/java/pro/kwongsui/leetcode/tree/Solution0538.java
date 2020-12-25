package pro.kwongsui.leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution0538 {

    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        int sum = 0;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.right;
            }
            p = stack.pop();
            sum += p.val;
            p.val = sum;
            p = p.left;
        }
        return root;
    }

    public TreeNode convertBST2(TreeNode root) {
        if (root == null) {
            return null;
        }
        int[] sum = new int[]{0};
        inorderReversal(root, sum);
        return root;
    }

    private void inorderReversal(TreeNode root, int[] sum) {
        if (root == null) {
            return;
        }
        inorderReversal(root.right, sum);
        sum[0] += root.val;
        root.val = sum[0];
        inorderReversal(root.left, sum);
    }

    public TreeNode convertBST1(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        inorderGet(root, list);
        for (int i = list.size() - 2; i >= 0; i--) {
            list.set(i, list.get(i) + list.get(i + 1));
        }
        int[] idx = new int[]{0};
        inorderSet(root, list, idx);
        return root;
    }

    private void inorderSet(TreeNode root, List<Integer> list, int[] idx) {
        if (root == null) {
            return;
        }
        inorderSet(root.left, list, idx);
        root.val = list.get(idx[0]++);
        inorderSet(root.right, list, idx);
    }

    private void inorderGet(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderGet(root.left, list);
        list.add(root.val);
        inorderGet(root.right, list);
    }
}
