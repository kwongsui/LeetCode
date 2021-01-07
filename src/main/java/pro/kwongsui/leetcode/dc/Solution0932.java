package pro.kwongsui.leetcode.dc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution0932 {

    public int[] beautifulArray(int N) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        while (list.size() < N) {
            List<Integer> l = new ArrayList<>();
            for (int i : list) {
                if (i * 2 - 1 <= N) {
                    l.add(i * 2 - 1);
                }
            }
            for (int i : list) {
                if (i * 2 <= N) {
                    l.add(i * 2);
                }
            }
            list = l;
        }
        int[] res= new int[list.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return  res;
    }

    public int[] beautifulArray1(int N) {
        Map<Integer, int[]> memo = new HashMap<>();
        return f(N, memo);
    }

    private int[] f(int n, Map<Integer, int[]> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int[] res = new int[n];
        if (n == 1) {
            res[0] = 1;
        } else {
            int idx = 0;
            int[] odd = f((n + 1) / 2, memo);
            for (int num : odd) {
                res[idx++] = 2 * num - 1;
            }
            int[] even = f(n / 2, memo);
            for (int num : even) {
                res[idx++] = 2 * num;
            }
        }
        memo.put(n, res);
        return res;
    }
}
