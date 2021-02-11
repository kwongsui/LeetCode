package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution1443 {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        for (int[] edge : edges) {
            if (arr[edge[1]] != -1) {
                arr[edge[0]] = edge[1];
            } else {
                arr[edge[1]] = edge[0];
            }
        }
        boolean[] visited = new boolean[n];
        int time = 0;
        for (int i = 0; i < hasApple.size(); i++) {
            if (hasApple.get(i)) {
                int idx = i;
                while (arr[idx] != -1) {
                    if(!visited[idx]) {
                        time++;
                        visited[idx] = true;
                        idx = arr[idx];
                    } else {
                        break;
                    }
                }
            }
        }
        return time * 2;
    }

    public int minTime1(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] edge : edges) {
            if (map.containsKey(edge[1])) {
                map.put(edge[0], edge[1]);
            } else {
                map.put(edge[1], edge[0]);
            }
        }
        Set<Integer> set = new HashSet<>();
        int time = 0;
        for (int i = 0; i < hasApple.size(); i++) {
            if (hasApple.get(i)) {
                int idx = i;
                while (map.get(idx) != null) {
                    if (!set.contains(idx)) {
                        time++;
                        set.add(idx);
                        idx = map.get(idx);
                    } else {
                        break;
                    }
                }
            }
        }
        return time * 2;
    }
}
