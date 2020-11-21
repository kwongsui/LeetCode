package pro.kwongsui.leetcode.hash;

public class Solution1512 {
  public int numIdenticalPairs(int[] nums) {
    // 数组元素范围0~100
    int[] counter = new int[101];
    for (int num : nums) {
      counter[num]++;
    }
    int ans = 0;
    for (int cnt : counter) {
      if (cnt > 1) {
        ans += cnt * (cnt - 1) / 2;
      }
    }
    return ans;
  }
}
