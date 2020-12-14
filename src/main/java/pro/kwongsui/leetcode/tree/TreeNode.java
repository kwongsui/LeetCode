package pro.kwongsui.leetcode.tree;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {}
  public TreeNode(int v) {
    val = v;
  }
}
