package pro.kwongsui.leetcode.hash;

import java.util.ArrayList;
import java.util.List;

public class Solution0438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int[] hash = new int[26];
        for (char ch : p.toCharArray()) {
            hash[ch - 'a']++;
        }

        int lower = 0, upper = 0, cnt = p.length();
        while (upper < s.length()) {
            char u = (char) (s.charAt(upper) - 'a');
            if (hash[u] >= 1) {
                cnt--;
            }
            hash[u]--;
            upper++;

            if (cnt == 0) {
                list.add(lower);
            }

            if (upper - lower == p.length()) {
                char l = (char) (s.charAt(lower) - 'a');
                if (hash[l] >= 0) {
                    cnt++;
                }
                hash[l]++;
                lower++;
            }
        }

        return list;
    }
}
