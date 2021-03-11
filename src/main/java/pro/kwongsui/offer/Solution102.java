package pro.kwongsui.offer;

public class Solution102 {

    public int numWays(int n) {
        int n0, n1 = 0, n2 = 1;
        for(int i = 1; i <= n; i++) {
            n0 = n1;
            n1 = n2;
            n2 = n0 + n1;
            if(n2 > 1000000007)
                n2 %= 1000000007;
        }
        return n2;
    }

    public int numWays1(int n) {
        int[] memo = new int[n + 1];
        return numWays(n, memo);
    }

    private int numWays(int n, int[] memo) {
        if(n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        else if(memo[n] > 0)
            return memo[n];

        memo[n] = numWays(n - 1, memo) + numWays(n - 2, memo);
        if(memo[n] > 1000000007)
            memo[n] %= 1000000007;
        return memo[n];
    }
}
