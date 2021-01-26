package pro.kwongsui.leetcode.dp;

public class Solution0300 {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] states = new int[nums.length];
        states[0] = nums[0];
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > states[idx]) {
                states[++idx] = nums[i];
            } else {
                states[search(states, idx, nums[i])] = nums[i];
            }
        }
        return idx + 1;
    }

    private int search(int[] states, int upper, int target) {
        int lower = 0;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if(states[mid] < target) {
                lower = mid + 1;
            } else {
                if(mid == 0 || states[mid - 1] < target) {
                    return mid;
                } else {
                    upper = mid - 1;
                }
            }
        }
        return -1;
    }

    public int lengthOfLIS1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] states = new int[nums.length];
        states[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            states[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    states[i] = Math.max(states[i], states[j] + 1);
                }
            }
            max = Math.max(max, states[i]);
        }
        return max;
    }
}
