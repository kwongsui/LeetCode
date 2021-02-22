package pro.kwongsui.leetcode.array;

public class Solution0004 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m + n == 0) {
            return 0.0;
        }
        if (m + n == 1) {
            return (m != 0 ? nums1[0] : nums2[0]) * 1.0;
        }
        int[] nums = new int[m + n];
        int idx1 = 0, idx2 = 0, idx = 0;
        while (idx1 < m && idx2 < n) {
            if (nums1[idx1] <= nums2[idx2]) {
                nums[idx++] = nums1[idx1++];
            } else {
                nums[idx++] = nums2[idx2++];
            }
        }
        while (idx1 < m) {
            nums[idx++] = nums1[idx1++];
        }
        while (idx2 < n) {
            nums[idx++] = nums2[idx2++];
        }
        if ((m + n) % 2 == 0) {
            return (nums[(m + n) / 2] + nums[(m + n) / 2 - 1]) / 2.0;
        } else {
            return nums[(m + n) / 2] * 1.0;
        }
    }
}
