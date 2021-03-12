package pro.kwongsui.offer;

public class Solution13 {

    public int movingCount(int m, int n, int k) {
        int[] res = new int[]{0};
        boolean[][] visited = new boolean[m][n];
        dfs(0, 0, m, n, k, visited, res);
        return res[0];
    }

    private void dfs(int i, int j, int m, int n, int k, boolean[][] visited, int[] res) {
        if(0 <= i && i < m && 0 <= j && j < n && sum (i, j) <= k && !visited[i][j]) {
            res[0]++;
        } else {
            return;
        }
        visited[i][j] = true;
        dfs(i - 1, j, m, n, k, visited, res);
        dfs(i + 1, j, m, n, k, visited, res);
        dfs(i, j - 1, m, n, k, visited, res);
        dfs(i, j + 1, m, n, k, visited, res);
    }

    private int sum(int i, int j) {
        int sum = 0;
        if(i >= 10)
            sum += i / 10;
        sum += i % 10;
        if(j >= 10)
            sum += j / 10;
        sum += j % 10;
        return sum;
    }
}
