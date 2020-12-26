package pro.kwongsui.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution0654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        for (int num : nums) {
            TreeNode node = new TreeNode(num);
            while (!deque.isEmpty() && deque.peekLast().val < node.val) {
                node.left = deque.pollLast();
            }
            if (!deque.isEmpty()) {
                deque.peekLast().right = node;
            }
            deque.offerLast(node);
        }
        return deque.isEmpty() ? null : deque.pollFirst();
    }

    public TreeNode constructMaximumBinaryTree1(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        return constructMaximumBinaryTree1(nums, 0, nums.length - 1);
    }

    private TreeNode constructMaximumBinaryTree1(int[] nums, int lower, int upper) {
        if (lower > upper) {
            return null;
        }
        int max = nums[lower];
        int idx = lower;
        for (int i = lower; i <= upper; i++) {
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }
        TreeNode node = new TreeNode(max);
        node.left = constructMaximumBinaryTree1(nums, lower, idx - 1);
        node.right = constructMaximumBinaryTree1(nums, idx + 1, upper);
        return node;
    }
}
