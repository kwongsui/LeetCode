package pro.kwongsui.leetcode.heap;

public class Solution0703 {

  private final int[] data;
  private boolean isFull = false; // 堆是否已满

  public Solution0703(int k, int[] nums) {
    data = new int[k];
    if (k <= nums.length) {
      System.arraycopy(nums, 0, data, 0, k);
      isFull = true;
      heapify(data);
      for (int i = k; i < nums.length; i++) {
        if (nums[i] > data[0]) {
          data[0] = nums[i];
          siftDown(data, data.length - 1, 0);
        }
      }
    }
    if (k > nums.length && nums.length != 0) {
      System.arraycopy(nums, 0, data, 0, nums.length);
    }
  }

  private void heapify(int[] data) {
    int n = data.length - 1;
    int index = (n - 1) / 2;
    while (index >= 0) {
      siftDown(data, n, index--);
    }
  }

  private void siftDown(int[] data, int n, int i) {
    while (i <= n) {
      int small = i;
      if (2 * i + 1 <= n && data[2 * i + 1] < data[i]) {
        small = 2 * i + 1;
      }
      if (2 * i + 2 <= n && data[2 * i + 2] < data[small]) {
        small = 2 * i + 2;
      }
      if (data[small] < data[i]) {
        swap(data, small, i);
        i = small;
      } else {
        break;
      }
    }
  }

  private void swap(int[] data, int i, int j) {
    int temp = data[i];
    data[i] = data[j];
    data[j] = temp;
  }

  public int add(int val) {
    if (!isFull) {
      data[data.length - 1] = val;
      isFull = true;
      heapify(data);
    } else if (val > data[0]) {
      data[0] = val;
      siftDown(data, data.length - 1, 0);
    }
    return data[0];
  }
}
