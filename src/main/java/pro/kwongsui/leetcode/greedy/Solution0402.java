package pro.kwongsui.leetcode.greedy;

public class Solution0402 {

    public String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        for (char ch : num.toCharArray()) {
            while (k != 0 && builder.length() != 0 && ch < builder.charAt(builder.length() - 1)) {
                builder.deleteCharAt(builder.length() - 1);
                k--;
            }
            if (builder.length() != 0 || ch != '0') { // 前导0的处理
                builder.append(ch);
            }
        }
        while (k != 0) { // 可能存在移除不足 k 个字符，后面所有字符都大于栈顶字符的情况
            builder.deleteCharAt(builder.length() - 1);
            k--;
        }
        return builder.length() == 0 ? "0" : builder.toString();  // 所有数字被移除返回0
    }
}
