package pro.kwongsui.leetcode.hash;

public class Solution1365 {

  public int[] smallerNumbersThanCurrent(int[] nums) {
    // 数组元素范围0~100
    int[] counter = new int[101];
    for (int num : nums) {
      counter[num]++;
    }
    int[] res = new int[nums.length];
    for (int i = 1; i < counter.length; i++) {
      counter[i] += counter[i - 1];
    }
//    System.arraycopy(counter, 0, counter, 1, counter.length - 1);
//    counter[0] = 0;
    // 结果中取计数数组前一位置的值
    for (int i = 0; i < nums.length; i++) {
      res[i] = nums[i] == 0 ? 0 : counter[nums[i] - 1];
    }
    return res;
  }
}
