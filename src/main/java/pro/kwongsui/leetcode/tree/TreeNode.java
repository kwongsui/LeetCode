package pro.kwongsui.leetcode.tree;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;
  public TreeNode next;

  public TreeNode() {}

  public TreeNode(int v) {
    val = v;
  }

  public TreeNode(int v, TreeNode l, TreeNode r) {
    val = v;
    left = l;
    right = r;
  }
}
