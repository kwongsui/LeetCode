package pro.kwongsui.leetcode.heap;

public class Solution0215 {

    public int findKthLargest(int[] nums, int k) {
        heapify(nums);
        int i = 1;
        while (i != k) {
            delete(nums, nums.length - i);
            i++;
        }
        return nums[0];
    }

    private void heapify(int[] nums) {
        int n = nums.length - 1;
        int index = (n - 1) / 2;
        while (index >= 0) {
            siftDown(nums, n, index--);
        }
    }

    private void delete(int[] nums, int n) {
        nums[0] = nums[n];
        siftDown(nums, n, 0);
    }

    private void siftDown(int[] nums, int n, int idx) {
        while (idx <= n) {
            int big = idx;
            if(2 * idx + 1 <= n && nums[2 * idx + 1] > nums[idx]) {
                big = 2 * idx + 1;
            }
            if(2 * idx + 2 <= n && nums[2 * idx + 2] > nums[big]) {
                big = 2 * idx + 2;
            }
            if(nums[big] > nums[idx]) {
                swap(nums, idx, big);
                idx = big;
            } else {
                break;
            }
        }
    }

    private void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
