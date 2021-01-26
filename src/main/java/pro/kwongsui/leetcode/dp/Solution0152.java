package pro.kwongsui.leetcode.dp;

public class Solution0152 {

    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0];
        int res = max;
        for (int i = 1; i < nums.length; i++) {
            int mx = max, mn = min;
            max = Math.max(nums[i], Math.max(mx * nums[i], mn * nums[i]));
            min = Math.min(nums[i], Math.min(mx * nums[i], mn * nums[i]));
            res = Math.max(res, max);
        }
        return res;
    }

    public int maxProduct1(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        max[0] = nums[0];
        min[0] = nums[0];
        int res = max[0];
        for (int i = 1; i < n; i++) {
            max[i] = Math.max(nums[i], Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]));
            min[i] = Math.min(nums[i], Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]));
            res = Math.max(res, max[i]);
        }
        return res;
    }
}
