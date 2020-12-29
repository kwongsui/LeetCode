package pro.kwongsui.leetcode.sort;

public class Solution0081 {

    public boolean search(int[] nums, int target) {
        int lower = 0, upper = nums.length - 1;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if (target == nums[mid]) {
                return true;
            }
            if (nums[lower] == nums[mid]) {
                lower++;
                continue;
            }
            if (nums[lower] < nums[mid]) {
                if (nums[lower] <= target && target < nums[mid]) {
                    upper = mid - 1;
                } else {
                    lower = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[upper]) {
                    lower = mid + 1;
                } else {
                    upper = mid - 1;
                }
            }
        }
        return false;
    }
}
