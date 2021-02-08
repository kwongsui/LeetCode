package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution0863 {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        parent(root, null, map);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);

        Set<TreeNode> set = new HashSet<>();
        set.add(target);

        List<Integer> list = new ArrayList<>();
        int dist = 0;
        while (!queue.isEmpty()) {
            if (dist == K) {
                for (TreeNode treeNode : queue) {
                    list.add(treeNode.val);
                }
                return list;
            } else {
                int size = queue.size();
                while (size-- != 0) {
                    TreeNode node = queue.poll();
                    if (node != null) {
                        if (map.get(node) != null && set.add(map.get(node))) {
                            queue.offer(map.get(node));
                        }
                        if (node.left != null && set.add(node.left)) {
                            queue.offer(node.left);
                        }
                        if (node.right != null && set.add(node.right)) {
                            queue.offer(node.right);
                        }
                    }
                }
                dist++;
            }
        }
        return list;
    }

    private void parent(TreeNode root, TreeNode parent, Map<TreeNode, TreeNode> map) {
        if (root == null) {
            return;
        }
        map.put(root, parent);
        parent(root.left, root, map);
        parent(root.right, root, map);
    }
}
