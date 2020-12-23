package pro.kwongsui.leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution0230 {

    public int kthSmallest(TreeNode root, int k) {
        int[] kth = new int[]{0};
        int[] cnt = new int[]{0};
        inorder(root, k, cnt, kth);
        return kth[0];
    }

    private void inorder(TreeNode root, int k, int[] cnt, int[] kth) {
        if (root == null) {
            return;
        }
        if (cnt[0] > k) {
            return;
        }
        inorder(root.left, k, cnt, kth);
        cnt[0]++;
        if (cnt[0] == k) {
            kth[0] = root.val;
            return;
        }
        inorder(root.right, k, cnt, kth);
    }

    public int kthSmallest3(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (true) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (--k == 0) {
                return p.val;
            }
            p = p.right;
        }
    }

    public int kthSmallest2(TreeNode root, int k) {
        int kth = 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        inorder2(p, stack);
        while (k-- != 0) {
            p = stack.pop();
            kth = p.val;
            if (p.right != null) {
                inorder2(p.right, stack);
            }
        }
        return kth;
    }

    private void inorder2(TreeNode node, Deque<TreeNode> stack) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int kthSmallest1(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder1(root, list);
        if (k > list.size()) {
            return -1;
        }
        return list.get(k - 1);
    }

    private void inorder1(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder1(root.left, list);
        list.add(root.val);
        inorder1(root.right, list);
    }
}
