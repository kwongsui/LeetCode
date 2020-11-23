package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution0257 {

  public static List<String> binaryTreePaths(TreeNode root) {
    List<String> ret = new ArrayList<>();
    getPaths(root, new StringBuilder(), ret);
    return ret;
  }

  private static void getPaths(TreeNode node, StringBuilder builder, List<String> list) {
    if (node != null) {
      int cursor = builder.length();
      builder.append(node.val);
      if (node.left == null && node.right == null) {
        list.add(builder.toString());
      } else {
        builder.append("->");
        getPaths(node.left, builder, list);
        getPaths(node.right, builder, list);
      }
      /*
       * 以下情况builder都要复位：
       * 1. 到达叶子结点
       * 2. 当前节点的左右节点都已遍历完毕，以确保当前节点的上级和上上级等节点能够正确拼接
       */
      builder.delete(cursor, builder.length());
    }
  }
}
