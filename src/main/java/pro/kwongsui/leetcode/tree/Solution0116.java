package pro.kwongsui.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution0116 {

    public TreeNode connect(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    public TreeNode connect2(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
            TreeNode p = root.left, q = root.right;
            while (p.right != null && q.left != null) {
                p = p.right;
                q = q.left;
                p.next = q;
            }
            connect(root.left);
            connect(root.right);
        }
        return root;
    }

    public TreeNode connect1(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- != 0) {
                TreeNode treeNode = queue.poll();
                if (treeNode != null) {
                    if (size != 0) {
                        treeNode.next = queue.peek();
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
        return root;
    }
}
