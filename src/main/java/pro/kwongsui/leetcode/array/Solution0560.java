package pro.kwongsui.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class Solution0560 {

    public int subArraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum == k) {
                cnt++;
            }
            cnt += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}
