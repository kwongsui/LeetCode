package pro.kwongsui.leetcode.sort;

public class Solution0034 {

    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return new int[]{-1, -1};
        }
        int first = searchF(nums, target);
        int last = searchL(nums, target);
        return new int[]{first, last};
    }

    private int searchF(int[] nums, int target) {
        int lower = 0, upper = nums.length - 1;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if (nums[mid] < target) {
                lower = mid + 1;
            } else if (nums[mid] > target) {
                upper = mid - 1;
            } else {
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid;
                } else {
                    upper = mid - 1;
                }
            }
        }
        return -1;
    }

    private int searchL(int[] nums, int target) {
        int lower = 0, upper = nums.length - 1;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if (nums[mid] < target) {
                lower = mid + 1;
            } else if (nums[mid] > target) {
                upper = mid - 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] > target) {
                    return mid;
                } else {
                    lower = mid + 1;
                }
            }
        }
        return -1;
    }
}
