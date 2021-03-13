package pro.kwongsui.offer;

public class Solution14 {

    public int cuttingRope(int n) {
        if(n < 4)
            return n - 1;
        int res = 1;
        while(n > 4) {
            res *= 3;
            n -= 3;
        }
        return res * n;
    }

    public int cuttingRope2(int n) {
        if(n <= 3)
            return n - 1;
        long res = 1;
        while(n > 4) {
            res = res * 3 % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }
}
