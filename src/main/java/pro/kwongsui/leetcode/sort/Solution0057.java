package pro.kwongsui.leetcode.sort;

import java.util.ArrayList;
import java.util.List;

public class Solution0057 {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        List<int[]> list = new ArrayList<>();
        int idx = 0;
        // 当前区间在待插入区间左侧且无重叠
        while (idx < intervals.length && intervals[idx][1] < newInterval[0]) {
            list.add(intervals[idx]);
            idx++;
        }
        // 当前区间与待插入区间有重叠
        while (idx < intervals.length && intervals[idx][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[idx][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[idx][1], newInterval[1]);
            idx++;
        }
        list.add(newInterval);
        // 当前区间在待插入区间右侧且无重叠
        while (idx < intervals.length) {
            list.add(intervals[idx]);
            idx++;
        }
        int[][] ret = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    public int[][] insert2(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        List<int[]> list = new ArrayList<>();
        int lower = search(intervals, newInterval[0]), upper = search(intervals, newInterval[1]);
        for (int i = 0; i < lower; i++) {
            list.add(intervals[i]);
        }
        if (upper == -1) {
            // 待插入区间在最左侧且与右侧区间无重叠
            list.add(newInterval);
        } else if (lower == -1) {
            // 待插入区间在最左侧且与右侧区间有重叠
            list.add(new int[]{newInterval[0], Math.max(intervals[upper][1], newInterval[1])});
        } else if (intervals[lower][1] < newInterval[0]) {
            // 待插入区间与左侧区间无重叠
            list.add(intervals[lower]);
            list.add(new int[]{newInterval[0], Math.max(intervals[upper][1], newInterval[1])});
        } else {
            list.add(new int[]{intervals[lower][0], Math.max(intervals[upper][1], newInterval[1])});
        }
        for (int i = upper + 1; i < intervals.length; i++) {
            list.add(intervals[i]);
        }
        int[][] ret = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    private int search(int[][] intervals, int val) {
        int n = intervals.length, l = 0, r = n - 1, mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (intervals[mid][0] > val) {
                r = mid - 1;
            } else {
                if (mid == n - 1 || intervals[mid + 1][0] > val) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
