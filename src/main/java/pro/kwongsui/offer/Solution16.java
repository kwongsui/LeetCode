package pro.kwongsui.offer;

public class Solution16 {

    public double helper(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = helper(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    public double myPow(double x, int n) {
        double res = n >= 0 ? helper(x, n) : 1.0 / helper(x, -(long) n);
        return (double) Math.round(res * 100000) / 100000;
    }

    public double myPow1(double x, int n) {
        double res = 1.0;
        long b = n;
        if (n < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b != 0) {
            if (b % 2 == 1) {
                res *= x;
            }
            x *= x;
            b /= 2;
        }
        return (double) Math.round(res * 100000) / 100000;
    }
}
