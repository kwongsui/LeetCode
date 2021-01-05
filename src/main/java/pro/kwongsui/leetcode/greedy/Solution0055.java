package pro.kwongsui.leetcode.greedy;

public class Solution0055 {

    /**
     * 1. 在可跳跃的位置跳跃至最远位置，探测该位置是否可跳至最后位置
     * 2. 若该位置为0，则回头探测跳跃过的位置是否可以跳跃至更远，可以则跳至更远，否则最远只能到达该位置
     * 3. 若该位置不为0，则继续往前跳
     */
    public boolean canJump(int[] nums) {
        int pos = 0;
        while (true) {
            pos += nums[pos];
            if (pos >= nums.length - 1) {
                return true;
            }
            if (nums[pos] == 0) {
                boolean flag = false; // 到达跳跃长度为0的位置可能无法到达最后位置
                /*
                 * 回头探测已跳过的位置是否可以跳到比 pos 位置更远的位置
                 */
                for (int i = pos; i >= 0; i--) {
                    if (i + nums[i] >= nums.length - 1) {
                        return true;
                    }
                    if (i + nums[i] > pos) {
                        pos = i + nums[i];
                        flag = true; // 可以跳跃到比 pos 位置更远的位置，可能到达最后位置
                        break;
                    }
                }
                // 无法到达最后位置
                if (!flag) {
                    return false;
                }
            }
        }
    }

    /**
     * 若无法到达最后位置，则即刻返回
     */
    public boolean canJump2(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < i) {
                return false;
            }
            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }

    /**
     * 若无法到达最后位置，i 仍将自增至 nums.length - 1
     */
    public boolean canJump1(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(max, i + nums[i]);
                if (max >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
