package pro.kwongsui.leetcode.array;

public class SolutionCtCI1611 {

  /**
   * 数学规律求解
   */
  public int[] divingBoard3(int shorter, int longer, int k) {
    if (k == 0) {
      return new int[0]; // new int[]{} 长度为1，值为0的数组
    }

    if (shorter == longer) {
      return new int[]{shorter * k};
    }

    int[] ret = new int[k + 1];
    for (int i = 0; i <= k; i++) {
      ret[i] = (k - i) * shorter + longer * i;
    }
    return ret;
  }

  /**
   * 递归不一定是方法自身调用自身，数组元素值通过上一个元素值得到，亦可视作一种递归形式
   */
  public int[] divingBoard(int shorter, int longer, int k) {
    if (k == 0) {
      return new int[0]; // new int[]{} 长度为1，值为0的数组
    }

    if (shorter == longer) {
      return new int[]{shorter * k};
    }

    int[] ret = new int[k + 1];
    ret[0] = shorter * k;
    for (int i = 1; i <= k; i++) {
      ret[i] = ret[i - 1] + (longer - shorter);
    }
    return ret;
  }

  /**
   * 常规递归：k很大时，栈溢出
   */
  public int[] divingBoard1(int shorter, int longer, int k) {
    if (k == 0) {
      return new int[0]; // new int[]{} 长度为1，值为0的数组
    }

    if (shorter == longer) {
      return new int[]{shorter * k};
    }

    int[] ret = new int[k + 1];
    helper(ret, shorter, longer, k);
    return ret;
  }

  private void helper(int[] ret, int shorter, int longer, int k) {
    if (k == 1) {
      ret[0] = shorter;
      ret[1] = longer;
    } else {
      helper(ret, shorter, longer, k - 1);
      // 除第1个最小值和最后一个最大值外，中间k-1个值在新增一块木板(短或长均可)后的可能值会重复
      for (int i = 0; i < k; i++) {
        ret[i] = ret[i] + shorter;
      }
      ret[k] = ret[k - 1] + (longer - shorter);
    }
  }
}
