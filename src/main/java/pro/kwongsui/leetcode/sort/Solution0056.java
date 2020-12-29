package pro.kwongsui.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution0056 {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1) {
            return intervals;
        }
        int length = intervals.length;
        int[] lower = new int[length];
        int[] upper = new int[length];
        for (int i = 0; i < length; i++) {
            lower[i] = intervals[i][0];
            upper[i] = intervals[i][1];
        }
        Arrays.sort(lower);
        Arrays.sort(upper);
        List<int[]> list = new ArrayList<>();
        int l = 0, r = 0;
        while (r < length) {
            if (r == length - 1 || lower[r + 1] > upper[r]) {
                list.add(new int[]{lower[l], upper[r]});
                l = r + 1;
            }
            r++;
        }
        int[][] ret = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    public int[][] merge2(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(e -> e[0]));
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            int lower = interval[0], upper = interval[1];
            if (list.size() == 0 || list.get(list.size() - 1)[1] < lower) {
                list.add(new int[]{lower, upper});
            } else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], upper);
            }
        }
        int[][] ret = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
