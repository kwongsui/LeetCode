package pro.kwongsui.leetcode.dc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution0241 {

    public List<Integer> diffWaysToCompute(String input) {
        Map<String, List<Integer>> cache = new HashMap<>();
        return diff(input, cache, 0, input.length());
    }

    private List<Integer> diff(String s, Map<String, List<Integer>> cache, int lower, int upper) {
        if (cache.containsKey(s.substring(lower, upper))) {
            return cache.get(s.substring(lower, upper));
        }
        List<Integer> list = new ArrayList<>();
        boolean exp = false;
        for (int i = lower; i < upper; i++) {
            if ("+-*".indexOf(s.charAt(i)) != -1) {
                List<Integer> left = diff(s, cache, lower, i);
                List<Integer> right = diff(s, cache, i + 1, upper);
                for (int l : left) {
                    for (int r : right) {
                        list.add(compute(l, r, s.charAt(i)));
                    }
                }
                exp = true;
            }
        }
        // 当字符串不是表达式时递归终止
        if (!exp) {
            list.add(Integer.parseInt(s.substring(lower, upper)));
        }
        cache.put(s.substring(lower, upper), list);
        return list;
    }

    private int compute(int left, int right, char operator) {
        int res = 0;
        switch (operator) {
            case '+':
                res = left + right;
                break;
            case '-':
                res = left - right;
                break;
            case '*':
                res = left * right;
                break;
            default:
                break;
        }
        return res;
    }
}
