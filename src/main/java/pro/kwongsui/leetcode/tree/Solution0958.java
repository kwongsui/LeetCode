package pro.kwongsui.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution0958 {

    public boolean isCompleteTree(TreeNode root) {
        boolean flag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode == null) {
                flag = true;
            } else {
                if (flag) {
                    return false;
                }
                queue.offer(treeNode.left);
                queue.offer(treeNode.right);
            }
        }
        return true;
    }
}
