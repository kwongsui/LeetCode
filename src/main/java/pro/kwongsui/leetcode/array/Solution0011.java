package pro.kwongsui.leetcode.array;

public class Solution0011 {

  public int maxArea(int[] height) {
    int l = 0, r = height.length - 1;
    int maxArea = 0;
    while (l < r) {
      maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }
    return maxArea;
  }

  public int maxArea2(int[] height) {
    int maxArea = 0;
    for (int i = 0; i < height.length; i++) {
      for (int j = i + 1; j < height.length; j++) {
        maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
      }
    }
    return maxArea;
  }
}
