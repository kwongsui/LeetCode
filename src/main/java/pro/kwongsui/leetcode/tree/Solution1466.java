package pro.kwongsui.leetcode.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution1466 {

    public int minReorder(int n, int[][] connections) {
        Map<Integer, LinkedList<int[]>> adj = new HashMap<>(n);
        for (int[] conn : connections) {
            adj.computeIfAbsent(conn[0], k -> new LinkedList<>());
            adj.get(conn[0]).add(new int[]{conn[1], 1});
            adj.computeIfAbsent(conn[1], k -> new LinkedList<>());
            adj.get(conn[1]).add(new int[]{conn[0], 0});
        }
        int[] ans = new int[]{0};
        dfs(0, adj, new boolean[n], ans);
        return ans[0];
    }

    private void dfs(int u, Map<Integer, LinkedList<int[]>> adj, boolean[] visited, int[] ans) {
        visited[u] = true;
        for (int[] v : adj.get(u)) {
            if (!visited[v[0]]) {
                ans[0] += v[1];
                dfs(v[0], adj, visited, ans);
            }
        }
    }
}
