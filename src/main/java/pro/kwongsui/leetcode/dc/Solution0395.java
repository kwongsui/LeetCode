package pro.kwongsui.leetcode.dc;

import java.util.HashMap;
import java.util.Map;

public class Solution0395 {

    Map<Character, Integer> map = new HashMap<>();

    /**
     * 关键思路：使用出现次数少于 k 次的字符作为 pivot 对字符串进行两路分治。时间复杂度 O(NlogN)
     */
    public int longestSubstring(String s, int k) {
        return longestSubstring(s, 0, s.length(), k);
    }

    private int longestSubstring(String s, int start, int end, int k) {
        if (end - start < k) {
            return 0;
        }
        map.clear();
        for (int i = start; i < end; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        // 首尾剪枝
        while (end - start >= k && map.get(s.charAt(start)) < k) {
            start++;
        }
        while (end - start >= k && map.get(s.charAt(end - 1)) < k) {
            end--;
        }
        for (int i = start; i < end; i++) {
            if (map.get(s.charAt(i)) < k) {
                return Math.max(
                    longestSubstring(s, start, i, k),
                    longestSubstring(s, i + 1, end, k));
            }
        }
        return end - start;
    }
}
