package pro.kwongsui.offer;

public class Solution10 {

    public int fib(int n) {
        int[] memo = new int[n + 1];
        return fib(n, memo);
    }

    private int fib(int n, int[] memo) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        if (memo[n] > 1000000007)
            memo[n] = memo[n] % 1000000007;
        return memo[n];
    }

    public int fib1(int n) {
        int f0 = 0, f1 = 1;
        int fib = 0;
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }
        for (int i = 2; i <= n; i++) {
            fib = f0 + f1;
            if (fib > 1000000007) {
                fib %= 1000000007;
            }
            f0 = f1;
            f1 = fib;
        }
        return fib;
    }

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
