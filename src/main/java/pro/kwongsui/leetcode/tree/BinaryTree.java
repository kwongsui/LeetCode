package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

  public static TreeNode create(Integer[] nums) {
    if (nums.length == 0) {
      return null;
    }
    int idx = 0;
    TreeNode tree = new TreeNode(nums[idx]);
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(tree);
    while (!queue.isEmpty()) {
      TreeNode treeNode = queue.poll();
      if (++idx < nums.length && nums[idx] != null) {
        treeNode.left = new TreeNode(nums[idx]);
      }
      if (++idx < nums.length && nums[idx] != null) {
        treeNode.right = new TreeNode(nums[idx]);
      }
      if (treeNode.left != null) {
        queue.offer(treeNode.left);
      }
      if (treeNode.right != null) {
        queue.offer(treeNode.right);
      }
    }
    return tree;
  }

  public static List<Integer> bfs(TreeNode tree) {
    List<Integer> list = new ArrayList<>();
    if (tree == null) {
      return list;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(tree);
    while (!queue.isEmpty()) {
      TreeNode treeNode = queue.poll();
      list.add(treeNode.val);
      if (treeNode.left != null) {
        queue.offer(treeNode.left);
      }
      if (treeNode.right != null) {
        queue.offer(treeNode.right);
      }
    }
    return list;
  }
}
