package pro.kwongsui.leetcode.sort;

public class Solution0154 {

    public int findMin(int[] nums) {
        int min = nums[0];
        int lower = 0, upper = nums.length - 1;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if (nums[lower] == nums[mid]) {
                if (nums[lower] < min) {
                    min = nums[lower];
                }
                lower++;
                continue;
            }
            if (nums[lower] < nums[mid]) {
                if (nums[lower] < min) {
                    min = nums[lower];
                }
                lower = mid + 1;
            } else {
                if (nums[mid] < min) {
                    min = nums[mid];
                }
                upper = mid - 1;
            }
        }
        return min;
    }
}
