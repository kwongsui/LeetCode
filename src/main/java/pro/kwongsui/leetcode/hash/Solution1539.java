package pro.kwongsui.leetcode.hash;

public class Solution1539 {

  public int findKthPositive(int[] arr, int k) {
    // 数组元素范围1~1000
    int[] counter = new int[1001];
    for (int num : arr) {
      counter[num]++;
    }
    int idx = 0;
    int ans = 0;
    for (int i = 1; i < counter.length; i++) {
      if (counter[i] == 0) {
        idx++;
      }
      if (idx == k) {
        ans = i;
        break;
      }
    }
    // k的范围1~1000意味着1000以后可能有缺失的数
    if(ans == 0) {
      ans = 1000 + (k - idx);
    }
    return ans;
  }
}
