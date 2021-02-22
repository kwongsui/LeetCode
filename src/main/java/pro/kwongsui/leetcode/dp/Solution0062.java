package pro.kwongsui.leetcode.dp;

public class Solution0062 {

    public int uniquePaths(int m, int n) {
        if (m > n) {
            return uniquePaths(n, m);
        }
        long ans = 1;
        for(int i = n, j = 1; j < m; i++, j++) {
            ans = ans * i / j;
        }
        return Math.toIntExact(ans);
    }
}
