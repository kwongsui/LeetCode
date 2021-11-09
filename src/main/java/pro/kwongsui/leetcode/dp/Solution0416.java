package pro.kwongsui.leetcode.dp;

public class Solution0416 {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }

        int half = sum / 2;
        boolean[] state = new boolean[half + 1];

        state[0] = true;
        if (nums[0] < half) state[nums[0]] = true;

        for (int i = 1; i < nums.length; i++) {
            for (int j = half - nums[i]; j >= 0; j--) {
                if (state[j]) {
                    state[j + nums[i]] = true;
                }
            }
        }
        return state[half];
    }
}
