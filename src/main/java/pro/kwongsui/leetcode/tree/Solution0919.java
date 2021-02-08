package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution0919 {

    static class CBTInserter {

        private final List<TreeNode> list;

        public CBTInserter(TreeNode root) {
            list = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
        }

        public int insert(int v) {
            TreeNode newNode = new TreeNode(v);
            list.add(newNode);
            TreeNode treeNode = list.get((list.size() - 2) / 2);
            if (treeNode.left == null) {
                treeNode.left = newNode;
            } else {
                treeNode.right = newNode;
            }
            return treeNode.val;
        }

        public TreeNode get_root() {
            return list.get(0);
        }
    }
}
