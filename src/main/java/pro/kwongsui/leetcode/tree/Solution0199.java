package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution0199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        rightSideView(root, 0, list);
        return list;
    }

    private void rightSideView(TreeNode node, int depth, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (depth == list.size()) {
            list.add(node.val);
        }
        rightSideView(node.right, depth + 1, list);
        rightSideView(node.left, depth + 1, list);
    }

    public List<Integer> rightSideView1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- != 0) {
                TreeNode treeNode = queue.poll();
                if (treeNode != null) {
                    if (size == 0) {
                        list.add(treeNode.val);
                    }
                    if (treeNode.left != null) {
                        queue.offer(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        queue.offer(treeNode.right);
                    }
                }
            }
        }
        return list;
    }
}
