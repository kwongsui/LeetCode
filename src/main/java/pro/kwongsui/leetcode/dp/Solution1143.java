package pro.kwongsui.leetcode.dp;

public class Solution1143 {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        if (m < n) {
            return longestCommonSubsequence(text2, text1);
        }
        char[] a = text1.toCharArray(), b = text2.toCharArray();
        int[] states = new int[n + 1];
        for (int j = 0; j < m; j++) {
            int prevRowPrevCol = 0;
            for (int i = 0; i < n; i++) {
                int temp = states[i + 1];
                if (a[j] == b[i]) {
                    states[i + 1] = prevRowPrevCol + 1;
                } else {
                    states[i + 1] = Math.max(states[i], states[i + 1]);
                }
                prevRowPrevCol = temp;
            }
        }
        return states[n];
    }

    public int longestCommonSubsequence1(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        if (m < n) {
            return longestCommonSubsequence1(text2, text1);
        }
        char[] a = text1.toCharArray(), b = text2.toCharArray();
        int[] states = new int[n + 1];
        int[] newStates = new int[n + 1];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (a[j] == b[i]) {
                    newStates[i + 1] = states[i] + 1;
                } else {
                    newStates[i + 1] = Math.max(states[i + 1], newStates[i]);
                }
            }
            int[] temp = states;
            states = newStates;
            newStates = temp;
        }
        return states[n];
    }
}
