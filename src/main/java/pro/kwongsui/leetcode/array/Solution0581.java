package pro.kwongsui.leetcode.array;

import java.util.Arrays;

public class Solution0581 {

    public int findUnsortedSubArray(int[] nums) {
        int n = nums.length, lower = -1, upper = -1, min = nums[n - 1], max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                upper = i;
            }
            min = Math.min(min, nums[n - i - 1]);
            if (nums[n - i - 1] > min) {
                lower = n - i - 1;
            }
        }
        return lower == -1 ? 0 : upper - lower + 1;
    }

    public int findUnsortedSubArray1(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);

        int idx = 0, lower = -1, upper = -2;
        while (idx < nums.length) {
            if (nums[idx] != copy[idx]) {
                if (lower == -1) {
                    lower = idx;
                }
                upper = idx;
            }
            idx++;
        }

        return lower == -1 ? 0 : upper - lower + 1;
    }
}
