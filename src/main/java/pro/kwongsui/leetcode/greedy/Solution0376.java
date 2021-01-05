package pro.kwongsui.leetcode.greedy;

public class Solution0376 {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int length = 1;
        int up = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 0 && up != 1) {
                length++;
                up = 1;
            } else if (nums[i] - nums[i - 1] < 0 && up != -1) {
                length++;
                up = -1;
            }
        }
        return length;
    }
}
