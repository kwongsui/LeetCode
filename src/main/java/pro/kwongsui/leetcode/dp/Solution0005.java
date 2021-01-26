package pro.kwongsui.leetcode.dp;

public class Solution0005 {

    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] states = new boolean[n][n]; // states[i][j] 为 true 代表 s[i...j] 是回文子串
        int max = 1, idx = 0;
        char[] chars = s.toCharArray(); // s.charAt() 额外判断下标是否越界
        // 填表顺序确保先计算 states[i + 1][j - 1] 从而得到 states[i][j]
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                // 子串首尾字符相等
                if (chars[i] == chars[j]) {
                    if (j - i < 3) {
                        states[i][j] = true; // 边界条件： [i + 1, j - 1] 长度为0或1必为回文
                    } else {
                        states[i][j] = states[i + 1][j - 1];
                    }
                }
                if (states[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    idx = i;
                }
            }
        }
        return s.substring(idx, idx + max);
    }
}
