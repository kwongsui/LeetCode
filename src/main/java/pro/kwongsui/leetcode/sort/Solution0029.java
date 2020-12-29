package pro.kwongsui.leetcode.sort;

public class Solution0029 {

    public int divide(int dividend, int divisor) {
        boolean negative = false;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            negative = true;
        }
        // 全部转为负数，无需额外处理 Integer.MIN_VALUE 的情况
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;
        int quotient = 0;
        // 二分查找逆运算，每次增加前次两倍
        while (dividend <= divisor) {
            int cnt = 1, factor = divisor;
            // factor + factor < 0 防止溢出
            while (factor + factor < 0 && factor + factor > dividend) {
                factor += factor;
                cnt += cnt;
            }
            dividend -= factor;
            quotient += cnt;
        }
        // int 型正整数小于0溢出
        return negative ? -quotient : quotient < 0 ? Integer.MAX_VALUE : quotient;
    }
}
