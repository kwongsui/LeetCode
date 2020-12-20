package pro.kwongsui.leetcode.backtracking;

public class Solution0698 {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) {
            return false;
        }
        return backtrack(new boolean[nums.length], nums, 0, k, 0, sum / k);
    }

    private boolean backtrack(boolean[] pick, int[] nums,
        int start, int k, int gotten, int target) {
        if (k == 1) {
            return true;
        }
        if (gotten > target) {
            return false;
        }
        if (gotten == target) {
            return backtrack(pick, nums, 0, k - 1, 0, target);
        }
        for (int i = start; i < nums.length; i++) {
            if (pick[i]) {
                continue;
            }
            pick[i] = true;
            if (backtrack(pick, nums, i + 1, k, gotten + nums[i], target)) {
                return true;
            }
            pick[i] = false;

        }
        return false;
    }
}
