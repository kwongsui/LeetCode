package pro.kwongsui.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class Solution0166 {

    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        // 结果正负，真值相同异或为假，不同为真
        builder.append(numerator > 0 ^ denominator > 0 ? "-" : "");
        // 转为 long 型防止溢出
        long n = Math.abs((long) numerator), d = Math.abs((long) denominator);
        builder.append(n / d);
        long remainder = (n % d);
        if (remainder == 0) {
            return builder.toString();
        }
        builder.append(".");
        Map<Long, Integer> map = new HashMap<>();
        map.put(remainder, builder.length());
        while (remainder != 0) {
            remainder *= 10;
            builder.append(remainder / d);
            remainder %= d;
            // 重复出现同一个余数即说明出现循环小数
            if (map.containsKey(remainder)) {
                builder.insert(map.get(remainder), "(").append(")");
                break;
            }
            map.put(remainder, builder.length());
        }
        return builder.toString();
    }
}
