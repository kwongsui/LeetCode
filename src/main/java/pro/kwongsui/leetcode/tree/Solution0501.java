package pro.kwongsui.leetcode.tree;

public class Solution0501 {

  private Integer[] ret;
  private int retCnt;

  private int curVal;
  private int curCnt;

  private int maxCnt;

  public Integer[] findMode(TreeNode root) {
    inOrder(root);
    ret = new Integer[retCnt];
    retCnt = 0; // 数组从0开始赋值，并防止越界
    curCnt = 0;
//    maxCnt = 0; // 数组从1开始，且越界
    inOrder(root);
    return ret;
  }

  private void inOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    handle(node);
    inOrder(node.right);
  }

  private void handle(TreeNode node) {
    if (node.val != curVal) {
      curVal = node.val;
      curCnt = 1;
    } else {
      curCnt++;
    }
    if (curCnt > maxCnt) {
      maxCnt = curCnt;
      retCnt = 1;
    } else if (curCnt == maxCnt) {
      if (ret != null) {
        ret[retCnt] = curVal;
      }
      retCnt++;
    }
  }
}
