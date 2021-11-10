package pro.kwongsui.leetcode.dp;

public class Solution0509 {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int[][] a = new int[2][2];
        a[0][0] = a[0][1] = a[1][0] = 1;

        int[][] base = new int[2][1];
        base[0][0] = 1;

        int[][] res = quickPow(a, n - 1);
        res = multiply(res, base);

        return res[0][0];
    }

    private int[][] multiply(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = b[0].length;
        int[][] c = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                for (int k = 0; k < b.length; k++) {
                    c[row][column] += a[row][k] * b[k][column];
                }
            }
        }
        return c;
    }

    private int[][] quickPow(int[][] x, int N) {
        int[][] res = new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            res[i][i] = 1;
        }

        while (N != 0) {
            if ((N & 1) == 1) {
                res = multiply(res, x);
            }
            x = multiply(x, x);
            N >>>= 1;
        }

        return res;
    }

    /**
     * 快速幂算法，时间复杂度 logN
     * @param x 底数
     * @param N 幂指数
     */
    public int quickPow(int x, int N) {
        int res = 1;
        while (N != 0) {
            if ((N & 1) == 1) {
                res *= x;
            }
            x *= x;
            N >>>= 1;
        }
        return res;
    }

    public int fib2(int n) {
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
