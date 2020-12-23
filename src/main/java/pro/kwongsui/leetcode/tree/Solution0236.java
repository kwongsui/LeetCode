package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution0236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        map.put(root, null);
        queue.offer(root);
        while (!map.containsKey(p) || !map.containsKey(q)) {
            TreeNode node = queue.poll();
            if (node != null) {
                if (node.left != null) {
                    map.put(node.left, node);
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    map.put(node.right, node);
                    queue.offer(node.right);
                }
            }
        }
        Set<TreeNode> set = new HashSet<>();
        while (p != null) {
            set.add(p);
            p = map.get(p);
        }
        while (!set.contains(q)) {
            q = map.get(q);
        }
        return q;
    }

    public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        Map<TreeNode, List<TreeNode>> ancestors = new HashMap<>();
        updateAncestors(root, null, ancestors);
        ancestors.get(p).retainAll(ancestors.get(q));
        List<TreeNode> commonAncestors = ancestors.get(p);
        return commonAncestors.get(commonAncestors.size() - 1);
    }

    private void updateAncestors(TreeNode node, TreeNode parent,
        Map<TreeNode, List<TreeNode>> ancestors) {
        if (node == null) {
            return;
        }
        List<TreeNode> parents = new ArrayList<>(ancestors.getOrDefault(parent, new ArrayList<>()));
        parents.add(node);
        ancestors.put(node, parents);
        updateAncestors(node.left, node, ancestors);
        updateAncestors(node.right, node, ancestors);
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if(ancestor(p, q)) {
            return p;
        }
        if(ancestor(q, p)) {
            return q;
        }
        if (commonAncestor(root.left, p, q)) {
            return lowestCommonAncestor1(root.left, p, q);
        }
        if (commonAncestor(root.right, p, q)) {
            return lowestCommonAncestor1(root.right, p, q);
        }
        return root;
    }

    private boolean commonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        return ancestor(node, p) && ancestor(node, q);
    }

    private boolean ancestor(TreeNode node, TreeNode p) {
        if (node == null) {
            return false;
        }
        if (node == p) {
            return true;
        }
        if (ancestor(node.left, p)) {
            return true;
        }
        return ancestor(node.right, p);
    }
}
