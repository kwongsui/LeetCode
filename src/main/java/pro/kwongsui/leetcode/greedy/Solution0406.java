package pro.kwongsui.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution0406 {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,
            Comparator.<int[]>comparingInt(e -> e[0]).reversed().thenComparingInt(e -> e[1]));
        List<int[]> list = new LinkedList<>();
        for(int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(people);
    }
}
