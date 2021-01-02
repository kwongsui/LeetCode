package pro.kwongsui.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution0187 {

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> found = new HashSet<>(), repeated = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String sequence = s.substring(i, i + 10);
            if (!found.add(sequence)) {
                repeated.add(sequence);
            }
        }
        return new ArrayList<>(repeated);
    }

    public List<String> findRepeatedDnaSequences2(String s) {
        List<String> list = new ArrayList<>();
        if (s.length() <= 10) {
            return list;
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String key = s.substring(i, i + 10);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                list.add(key);
            }
        }
        return list;
    }
}
