package pro.kwongsui.leetcode.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import pro.kwongsui.leetcode.tree.TreeNode;

public class Solution0103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(root, 0, list);
        return list;
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (level > list.size() - 1) {
            list.add(new LinkedList<>());
        }
        if (level % 2 == 0) {
            ((LinkedList<Integer>) list.get(level)).addLast(root.val);
        } else {
            ((LinkedList<Integer>) list.get(level)).addFirst(root.val);
        }
        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);
    }

    public List<List<Integer>> zigzagLevelOrder3(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            queue.offer(null);

            LinkedList<Integer> level = new LinkedList<>();
            boolean ltr = true;

            while (queue.size() > 0) {
                TreeNode node = queue.poll();
                if (node != null) {
                    if (ltr) {
                        level.addLast(node.val);
                    } else {
                        level.addFirst(node.val);
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                } else {
                    list.add(level);
                    level = new LinkedList<>();
                    if (queue.size() > 0) {
                        queue.offer(null);
                    }
                    ltr = !ltr;
                }
            }
        }
        return list;
    }

    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root != null) {
            boolean ltr = false;
            Deque<TreeNode> level = new ArrayDeque<>();
            level.push(root);
            while (!level.isEmpty()) {
                List<Integer> layer = new ArrayList<>();

                Deque<TreeNode> nextLevel = new ArrayDeque<>();
                while (!level.isEmpty()) {
                    TreeNode treeNode = level.pop();
                    layer.add(treeNode.val);
                    if (ltr) {
                        if (treeNode.right != null) {
                            nextLevel.push(treeNode.right);
                        }
                        if (treeNode.left != null) {
                            nextLevel.push(treeNode.left);
                        }
                    } else {
                        if (treeNode.left != null) {
                            nextLevel.push(treeNode.left);
                        }
                        if (treeNode.right != null) {
                            nextLevel.push(treeNode.right);
                        }
                    }
                }
                level.addAll(nextLevel);

                ltr = !ltr;
                list.add(layer);
            }
        }
        return list;
    }

    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty() || !stack.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            if (!queue.isEmpty()) {
                while (!queue.isEmpty()) {
                    TreeNode treeNode = queue.poll();
                    l.add(treeNode.val);
                    if (treeNode.left != null) {
                        stack.push(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        stack.push(treeNode.right);
                    }
                }
            } else {
                while (!stack.isEmpty()) {
                    TreeNode treeNode = stack.pop();
                    l.add(treeNode.val);
                    if (treeNode.right != null) {
                        queue.addFirst(treeNode.right);
                    }
                    if (treeNode.left != null) {
                        queue.addFirst(treeNode.left);
                    }
                }
            }
            list.add(l);
        }
        return list;
    }
}
