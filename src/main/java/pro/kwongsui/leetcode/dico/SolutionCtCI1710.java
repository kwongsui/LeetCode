package pro.kwongsui.leetcode.dico;

public class SolutionCtCI1710 {


  public int majorityElement(int[] nums) {
    return dico(nums, 0, nums.length - 1);
  }

  private int dico(int[] nums, int l, int r) {
    if (l == r) {
      return nums[l];
    }
    int m = l + (r - l) / 2;
    int le = dico(nums, l, m);
    int re = dico(nums, m + 1, r);
    if (le == re) {
      return le;
    }
    int cntL = count(nums, le, l, r);
    int cntR = count(nums, re, l, r);
    int length = r - l + 1;
    return cntL * 2 > length ? le : cntR * 2 > length ? re : -1;
  }

  private int count(int[] nums, int num, int l, int r) {
    int cnt = 0;
    for (int i = l; i <= r; i++) {
      if (num == nums[i]) {
        cnt++;
      }
    }
    return cnt;
  }
}
