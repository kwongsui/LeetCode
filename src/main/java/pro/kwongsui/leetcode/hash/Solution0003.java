package pro.kwongsui.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class Solution0003 {

    public int lengthOfLongestSubstring(String s) {
        int max = 0, lower = 0, upper = 0;
        while (upper < s.length()) {
            int i = lower;
            while (i < upper) {
                if(s.charAt(i) == s.charAt(upper)) {
                    lower = i + 1;
                    break;
                }
                i++;
            }
            max = Math.max(max, upper - lower + 1);
            upper++;
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int lower = 0, upper = 0;
        while (upper < s.length()) {
            if (map.containsKey(s.charAt(upper))) {
                lower = Math.max(lower, map.get(s.charAt(upper)) + 1); // 左侧指针一直往前走
            }
            map.put(s.charAt(upper), upper);
            max = Math.max(max, upper - lower + 1);
            upper++;
        }
        return max;
    }
}
