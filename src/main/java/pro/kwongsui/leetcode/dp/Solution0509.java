package pro.kwongsui.leetcode.dp;

public class Solution0509 {

    public int fib(int n) {
        int f0 = 0, f1 = 1, fib = 0;
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }
        for (int i = 2; i <= n; i++) {
            fib = f0 + f1;
            f0 = f1;
            f1 = fib;
        }
        return fib;
    }

    public int fib1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
