package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution0107 {

  public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> ret = new LinkedList<>();
    if (root == null) {
      return ret;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      List<Integer> list = new ArrayList<>();
      int size = queue.size();
      // 一次循环就是一层遍历
      while (size-- != 0) {
        TreeNode treeNode = queue.poll();
        if (treeNode != null) {
          list.add(treeNode.val);
          if (treeNode.left != null) {
            queue.offer(treeNode.left);
          }
          if (treeNode.right != null) {
            queue.offer(treeNode.right);
          }
        }
      }
      ret.add(0, list);
    }
    return ret;
  }
}
