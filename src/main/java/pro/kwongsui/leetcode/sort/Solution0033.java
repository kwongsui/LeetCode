package pro.kwongsui.leetcode.sort;

public class Solution0033 {

    public int search(int[] nums, int target) {
        int lower = 0, upper = nums.length - 1;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[lower] <= nums[mid]) {
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
        return -1;
    }

    public int search2(int[] nums, int target) {
        int lower = 0, upper = nums.length - 1;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if (nums[lower] <= nums[mid]) {
                if (nums[lower] <= target && target <= nums[mid]) {
                    return search(nums, target, lower, mid);
                } else {
                    lower = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[upper]) {
                    return search(nums, target, mid, upper);
                } else {
                    upper = mid - 1;
                }
            }
        }
        return -1;
    }

    public int search(int[] arr, int val, int lower, int upper) {
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] < val) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return -1;
    }
}
